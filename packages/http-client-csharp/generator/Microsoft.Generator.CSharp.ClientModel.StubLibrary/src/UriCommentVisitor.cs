// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using System;
using System.Collections.Generic;
using Microsoft.Generator.CSharp.Providers;
using Microsoft.Generator.CSharp.Statements;

namespace Microsoft.Generator.CSharp.ClientModel.StubLibrary
{
    internal class UriCommentVisitor : ScmLibraryVisitor
    {
        protected override MethodProvider? Visit(MethodProvider method)
        {
            if (!method.IsServiceCall())
                return method;

            if (method.XmlDocs is null)
                method.Update(xmlDocProvider: new XmlDocProvider());

            var remarks = method.XmlDocs!.Remarks;
            FormattableString uriComment = $"For more details see http://myservice.com/docs/{method.Signature.Name}";
            IEnumerable<FormattableString> lines = remarks?.Lines is null ? [uriComment] : [.. remarks?.Lines, uriComment];
            method.XmlDocs.Remarks = new XmlDocStatement("remarks", lines);

            return method;
        }
    }
}
