// <auto-generated/>

#nullable disable

using System;
using System.Collections.Generic;

namespace UnbrandedTypeSpec.Models
{
    /// <summary> The ProjectedNameModelRequest. </summary>
    internal partial class ProjectedNameModelRequest
    {
        /// <summary> Keeps track of any properties unknown to the library. </summary>
        private IDictionary<string, BinaryData> _serializedAdditionalRawData;

        internal ProjectedNameModelRequest(string name)
        {
            Name = name;
        }

        internal ProjectedNameModelRequest(string name, IDictionary<string, BinaryData> serializedAdditionalRawData)
        {
            Name = name;
            _serializedAdditionalRawData = serializedAdditionalRawData;
        }

        /// <summary> name of the ModelWithProjectedName. </summary>
        public string Name { get; set; }
    }
}
