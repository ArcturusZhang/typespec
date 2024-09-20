// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using System;
using System.IO;
using Microsoft.Generator.CSharp.Primitives;
using Microsoft.Generator.CSharp.Snippets;

namespace Microsoft.Generator.CSharp.ClientModel.Primitives
{
    public abstract class HttpResponseType
    {
        protected HttpResponseType(CSharpType type)
        {
            Type = type;
        }

        public CSharpType Type { get; }

        public abstract ScopedApi<Stream> ContentStream();

        public abstract ScopedApi<BinaryData> Content();

        public abstract ScopedApi<bool> IsError();

        public static implicit operator CSharpType(HttpResponseType type) => type.Type;
    }
}
