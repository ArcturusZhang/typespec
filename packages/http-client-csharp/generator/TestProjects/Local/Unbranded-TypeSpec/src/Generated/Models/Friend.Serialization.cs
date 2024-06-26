// <auto-generated/>

#nullable disable

using System;
using System.ClientModel.Primitives;
using System.Collections.Generic;
using System.Text.Json;

namespace UnbrandedTypeSpec.Models
{
    public partial class Friend : System.ClientModel.Primitives.IJsonModel<Friend>
    {
        private IDictionary<string, System.BinaryData> _serializedAdditionalRawData;

        /// <summary> Initializes a new instance of <see cref="Friend"/>. </summary>
        /// <param name="name"> name of the NotFriend. </param>
        /// <param name="serializedAdditionalRawData"> Keeps track of any properties unknown to the library. </param>
        internal Friend(string name, IDictionary<string, System.BinaryData> serializedAdditionalRawData)
        {
            Name = name;
            _serializedAdditionalRawData = serializedAdditionalRawData;
        }

        /// <summary> Initializes a new instance of <see cref="Friend"/> for deserialization. </summary>
        internal Friend()
        {
        }

        /// <param name="writer"> The JSON writer. </param>
        /// <param name="options"> The client options for reading and writing models. </param>
        void System.ClientModel.Primitives.IJsonModel<Friend>.Write(System.Text.Json.Utf8JsonWriter writer, System.ClientModel.Primitives.ModelReaderWriterOptions options)
        {
        }

        /// <param name="reader"> The JSON reader. </param>
        /// <param name="options"> The client options for reading and writing models. </param>
        Friend System.ClientModel.Primitives.IJsonModel<Friend>.Create(ref System.Text.Json.Utf8JsonReader reader, System.ClientModel.Primitives.ModelReaderWriterOptions options)
        {
            return new Friend();
        }

        /// <param name="options"> The client options for reading and writing models. </param>
        System.BinaryData System.ClientModel.Primitives.IPersistableModel<Friend>.Write(System.ClientModel.Primitives.ModelReaderWriterOptions options)
        {
            return new System.BinaryData("IPersistableModel");
        }

        /// <param name="data"> The data to parse. </param>
        /// <param name="options"> The client options for reading and writing models. </param>
        Friend System.ClientModel.Primitives.IPersistableModel<Friend>.Create(System.BinaryData data, System.ClientModel.Primitives.ModelReaderWriterOptions options)
        {
            return new Friend();
        }

        /// <param name="options"> The client options for reading and writing models. </param>
        string System.ClientModel.Primitives.IPersistableModel<Friend>.GetFormatFromOptions(System.ClientModel.Primitives.ModelReaderWriterOptions options) => "J";
    }
}
