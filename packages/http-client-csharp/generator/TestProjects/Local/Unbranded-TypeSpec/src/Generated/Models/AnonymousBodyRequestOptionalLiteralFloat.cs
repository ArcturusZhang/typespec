// <auto-generated/>

#nullable disable

using System;
using System.ComponentModel;
using System.Globalization;

namespace UnbrandedTypeSpec
{
    /// <summary> The AnonymousBodyRequest_optionalLiteralFloat. </summary>
    public readonly partial struct AnonymousBodyRequestOptionalLiteralFloat : IEquatable<AnonymousBodyRequestOptionalLiteralFloat>
    {
        private readonly float _value;
        /// <summary> 4.56. </summary>
        private const float _456Value = 4.56F;

        /// <summary> Initializes a new instance of <see cref="AnonymousBodyRequestOptionalLiteralFloat"/>. </summary>
        /// <param name="value"> The value. </param>
        public AnonymousBodyRequestOptionalLiteralFloat(float value)
        {
            _value = value;
        }

        /// <summary> 4.56. </summary>
        public static AnonymousBodyRequestOptionalLiteralFloat _456 { get; } = new AnonymousBodyRequestOptionalLiteralFloat(_456Value);

        /// <summary> Determines if two <see cref="AnonymousBodyRequestOptionalLiteralFloat"/> values are the same. </summary>
        /// <param name="left"> The left value to compare. </param>
        /// <param name="right"> The right value to compare. </param>
        public static bool operator ==(AnonymousBodyRequestOptionalLiteralFloat left, AnonymousBodyRequestOptionalLiteralFloat right) => left.Equals(right);

        /// <summary> Determines if two <see cref="AnonymousBodyRequestOptionalLiteralFloat"/> values are not the same. </summary>
        /// <param name="left"> The left value to compare. </param>
        /// <param name="right"> The right value to compare. </param>
        public static bool operator !=(AnonymousBodyRequestOptionalLiteralFloat left, AnonymousBodyRequestOptionalLiteralFloat right) => !left.Equals(right);

        /// <summary> Converts a string to a <see cref="AnonymousBodyRequestOptionalLiteralFloat"/>. </summary>
        /// <param name="value"> The value. </param>
        public static implicit operator AnonymousBodyRequestOptionalLiteralFloat(float value) => new AnonymousBodyRequestOptionalLiteralFloat(value);

        /// <param name="obj"> The object to compare. </param>
        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object obj) => obj is AnonymousBodyRequestOptionalLiteralFloat other && Equals(other);

        /// <param name="other"> The instance to compare. </param>
        public bool Equals(AnonymousBodyRequestOptionalLiteralFloat other) => Equals(_value, other._value);

        /// <inheritdoc/>
        public override int GetHashCode() => _value.GetHashCode();

        /// <inheritdoc/>
        public override string ToString() => _value.ToString(CultureInfo.InvariantCulture);
    }
}
