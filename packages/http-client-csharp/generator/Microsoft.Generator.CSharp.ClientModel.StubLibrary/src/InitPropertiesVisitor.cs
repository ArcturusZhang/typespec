// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using Microsoft.Generator.CSharp.Primitives;
using Microsoft.Generator.CSharp.Providers;

namespace Microsoft.Generator.CSharp.ClientModel.StubLibrary
{
    public class InitPropertiesVisitor : ScmLibraryVisitor
    {
        protected override PropertyProvider? Visit(TypeProvider enclosingType, PropertyProvider property)
        {
            if (enclosingType is not ModelProvider ||
                property.Body.HasSetter ||
                property.Modifiers.HasFlag(MethodSignatureModifiers.Static) ||
                property.ExplicitInterface is not null ||
                property.Modifiers.HasFlag(MethodSignatureModifiers.Override))
                return property;

            var initExpression = property.Body is AutoPropertyBody autoPropertyBody
                ? autoPropertyBody.InitializationExpression
                : null;

            property.Update(body: new AutoPropertyBody(true, InitializationExpression: initExpression, UseInit: true));
            return property;
        }
    }
}
