// <auto-generated/>

#nullable disable

using System;
using System.ClientModel;
using System.ClientModel.Primitives;
using System.Text.Json;

namespace Payload.Xml.Models
{
    public partial class ModelWithUnwrappedArray : IJsonModel<ModelWithUnwrappedArray>
    {
        void IJsonModel<ModelWithUnwrappedArray>.Write(Utf8JsonWriter writer, ModelReaderWriterOptions options) => throw null;

        protected virtual void JsonModelWriteCore(Utf8JsonWriter writer, ModelReaderWriterOptions options) => throw null;

        ModelWithUnwrappedArray IJsonModel<ModelWithUnwrappedArray>.Create(ref Utf8JsonReader reader, ModelReaderWriterOptions options) => throw null;

        protected virtual ModelWithUnwrappedArray JsonModelCreateCore(ref Utf8JsonReader reader, ModelReaderWriterOptions options) => throw null;

        BinaryData IPersistableModel<ModelWithUnwrappedArray>.Write(ModelReaderWriterOptions options) => throw null;

        protected virtual BinaryData PersistableModelWriteCore(ModelReaderWriterOptions options) => throw null;

        ModelWithUnwrappedArray IPersistableModel<ModelWithUnwrappedArray>.Create(BinaryData data, ModelReaderWriterOptions options) => throw null;

        protected virtual ModelWithUnwrappedArray PersistableModelCreateCore(BinaryData data, ModelReaderWriterOptions options) => throw null;

        string IPersistableModel<ModelWithUnwrappedArray>.GetFormatFromOptions(ModelReaderWriterOptions options) => throw null;

        public static implicit operator BinaryContent(ModelWithUnwrappedArray modelWithUnwrappedArray) => throw null;

        public static explicit operator ModelWithUnwrappedArray(ClientResult result) => throw null;
    }
}