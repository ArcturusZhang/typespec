// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using Microsoft.Generator.CSharp.Input;
using Microsoft.Generator.CSharp.Providers;

namespace Microsoft.Generator.CSharp.ClientModel.StubLibrary
{
    internal class NoModelNamespace : ScmLibraryVisitor
    {
        protected override TypeProvider? Visit(InputModelType model, TypeProvider? type)
        {
            type?.Update(nameSpace: StubLibraryPlugin.Instance.Configuration.RootNamespace);
            return type;
        }

        protected override TypeProvider? Visit(InputEnumType enumType, TypeProvider? type)
        {
            type?.Update(nameSpace: StubLibraryPlugin.Instance.Configuration.RootNamespace);
            return type;
        }

        protected override TypeProvider? Visit(TypeProvider type)
        {
            if (type.Type.Namespace.EndsWith(".Models"))
            {
                type.Update(nameSpace: StubLibraryPlugin.Instance.Configuration.RootNamespace);
            }
            return type;
        }
    }
}
