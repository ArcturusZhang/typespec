// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.TypeSpec.Generator.Primitives;

namespace Microsoft.TypeSpec.Generator.Providers
{
    public sealed class FrameworkTypeProvider : TypeProvider
    {
        private readonly Type? _type;
        private object? _literal;
        private readonly Type? _underlyingType;
        private IReadOnlyList<CSharpType>? _unionItemTypes;

        //private bool? _isReadOnlyMemory;
        //private bool? _isList;
        //private bool? _isArray;
        //private bool? _isReadOnlyList;
        //private bool? _isReadWriteList;
        //private bool? _isDictionary;
        //private bool? _isReadOnlyDictionary;
        //private bool? _isReadWriteDictionary;
        //private bool? _isCollection;
        //private bool? _isIEnumerableOfT;
        //private bool? _isIAsyncEnumerableOfT;
        //private bool? _containsBinaryData;
        //private int? _hashCode;
        //private CSharpType? _propertyInitializationType;
        //private CSharpType? _elementType;
        //private CSharpType? _inputType;
        //private CSharpType? _outputType;

        private FrameworkTypeProvider(Type type, bool isNullable = false) : base()
        {
            _type = type;
            IsNullable = isNullable;
        }

        public bool IsNullable { get; private init; }

        protected override string BuildName()
        {
            throw new NotImplementedException();
        }

        protected override string BuildRelativeFilePath()
        {
            throw new NotImplementedException();
        }

        private protected sealed override TypeProvider? GetCustomCodeView() => null;
        public static FrameworkTypeProvider Create(Type type, bool isNullable = false)
        {
            // TODO -- TypeFactory should have a cache for this.
            return new FrameworkTypeProvider(type, isNullable);
        }
    }
}
