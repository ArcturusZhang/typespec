// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

using System;
using System.ComponentModel.Composition;

namespace Microsoft.Generator.CSharp.ClientModel.StubLibrary
{
    [Export(typeof(CodeModelPlugin))]
    [ExportMetadata("PluginName", nameof(StubLibraryPlugin))]
    public class StubLibraryPlugin : ClientModelPlugin
    {
        private static StubLibraryPlugin? _instance;
        internal static StubLibraryPlugin Instance => _instance ?? throw new InvalidOperationException("ClientModelPlugin is not loaded.");

        [ImportingConstructor]
        public StubLibraryPlugin(GeneratorContext context) : base(context)
        {
            _instance = this;
        }

        public override void Configure()
        {
            //AddVisitor(new InstrumentationVisitor());
            //AddVisitor(new InitPropertiesVisitor());
            //AddVisitor(new NoModelNamespace());
            //AddVisitor(new UriComment());
        }
    }
}
