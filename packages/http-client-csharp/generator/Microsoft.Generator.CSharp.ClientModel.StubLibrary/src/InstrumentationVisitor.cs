// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using System.ClientModel;
using Microsoft.Generator.CSharp.ClientModel.Snippets;
using Microsoft.Generator.CSharp.Providers;
using Microsoft.Generator.CSharp.Snippets;
using Microsoft.Generator.CSharp.Statements;
using static Microsoft.Generator.CSharp.Snippets.Snippet;

namespace Microsoft.Generator.CSharp.ClientModel.StubLibrary
{
    internal class InstrumentationVisitor : ScmLibraryVisitor
    {
        protected override MethodProvider? Visit(MethodProvider method)
        {
            if (!method.IsServiceCall())
                return method;

            MethodBodyStatement statements;
            if (method.BodyExpression is not null)
            {
                if (method.Signature.ReturnType is null)
                {
                    statements = method.BodyExpression.Terminate();
                }
                else
                {
                    statements = Return(method.BodyExpression);
                }
            }
            else
            {
                statements = method.BodyStatements!;
            }

            var tryBlock = new TryStatement()
            {
                statements
            };
            var catchBlock = Catch(
                Declare("exception", out ScopedApi<ClientResultException> exception),
                [
                    InvokeConsoleWriteLine(exception.Message()),
                    Throw()
                ]);
            statements = new TryCatchFinallyStatement(tryBlock, catchBlock);
            method.Update(bodyStatements: statements);
            return method;
        }
    }
}
