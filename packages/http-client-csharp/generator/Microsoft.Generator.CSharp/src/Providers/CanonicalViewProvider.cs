// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using System;
using System.Collections.Generic;
using System.Linq;
using Microsoft.Generator.CSharp.Primitives;

namespace Microsoft.Generator.CSharp.Providers
{
    public sealed class CanonicalViewProvider : TypeProvider
    {
        public CanonicalViewProvider(TypeProvider specView)
        {
            SpecView = specView;
            SerializationViews = specView.SerializationProviders;
        }

        public TypeProvider SpecView { get; }

        public IReadOnlyList<TypeProvider> SerializationViews { get; }

        public override string RelativeFilePath => throw new InvalidOperationException($"The {nameof(CanonicalViewProvider)} should never be used as output");

        public override string Name => SpecView.Name;

        protected override string GetNamespace() => SpecView.Type.Namespace;

        protected override TypeProvider[] BuildSerializationProviders()
        {
            throw new InvalidOperationException($"The {nameof(CanonicalViewProvider)} should not have more serialization providers");
        }

        protected override ConstructorProvider[] BuildConstructors()
            => ConcatMembers([SpecView, .. SerializationViews], t => t.Constructors);

        protected override FieldProvider[] BuildFields()
            => ConcatMembers([SpecView, .. SerializationViews], t => t.Fields);

        protected override MethodProvider[] BuildMethods()
            => ConcatMembers([SpecView, .. SerializationViews], t => t.Methods);

        protected override PropertyProvider[] BuildProperties()
            => ConcatMembers([SpecView, .. SerializationViews], t => t.Properties);

        protected override CSharpType[] BuildImplements()
            => ConcatMembers([SpecView, .. SerializationViews], t => t.Implements); // TODO -- do we need to dedup?

        private static T[] ConcatMembers<T>(IEnumerable<TypeProvider> providers, Func<TypeProvider, IReadOnlyList<T>> getMember)
        {
            return providers.SelectMany(getMember).ToArray();
        }
    }
}
