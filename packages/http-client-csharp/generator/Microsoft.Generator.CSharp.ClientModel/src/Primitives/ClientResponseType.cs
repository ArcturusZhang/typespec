// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using System.ClientModel;
using Microsoft.Generator.CSharp.Expressions;
using Microsoft.Generator.CSharp.Primitives;
using Microsoft.Generator.CSharp.Snippets;

namespace Microsoft.Generator.CSharp.ClientModel.Primitives
{
    public class ClientResponseType
    {
        public ClientResponseType(CSharpType type)
        {
            Type = type;
        }

        public CSharpType Type { get; }

        public virtual ScopedApi<HttpResponseType> GetRawResponse(ValueExpression instance)
        {
            return instance.Invoke(nameof(ClientResult.GetRawResponse)).As<HttpResponseType>();
        }

        public static implicit operator CSharpType(ClientResponseType type) => type.Type;
    }
}
