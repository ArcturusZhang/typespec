// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using System.ClientModel;
using Microsoft.Generator.CSharp.Expressions;
using Microsoft.Generator.CSharp.Snippets;

namespace Microsoft.Generator.CSharp.ClientModel.Snippets
{
    public static class ClientResultExceptionSnippets
    {
        public static ValueExpression Message(this ScopedApi<ClientResultException> clientResultException)
            => clientResultException.Property(nameof(ClientResultException.Message));
    }
}
