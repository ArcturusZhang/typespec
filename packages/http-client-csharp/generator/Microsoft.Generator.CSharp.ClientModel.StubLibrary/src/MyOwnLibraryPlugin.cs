// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using System;
using System.ComponentModel.Composition;

namespace Microsoft.Generator.CSharp.ClientModel.StubLibrary
{
    [Export(typeof(CodeModelPlugin))]
    [ExportMetadata("PluginName", nameof(MyOwnLibraryPlugin))]
    public class MyOwnLibraryPlugin : ClientModelPlugin
    {
        private static MyOwnLibraryPlugin? _instance;
        internal static MyOwnLibraryPlugin Instance => _instance ?? throw new InvalidOperationException("ClientModelPlugin is not loaded.");

        [ImportingConstructor]
        public MyOwnLibraryPlugin(GeneratorContext context) : base(context)
        {
            _instance = this;
        }

        public override void Configure()
        {
        }
    }
}
