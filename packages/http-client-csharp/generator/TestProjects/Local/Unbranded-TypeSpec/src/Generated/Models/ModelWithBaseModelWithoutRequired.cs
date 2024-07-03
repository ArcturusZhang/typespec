// <auto-generated/>

#nullable disable

using System;
using UnbrandedTypeSpec;

namespace UnbrandedTypeSpec.Models
{
    /// <summary> This is a model that extends BaseModelWithoutRequired. </summary>
    public partial class ModelWithBaseModelWithoutRequired : BaseModelWithoutRequired
    {
        /// <summary> Initializes a new instance of <see cref="ModelWithBaseModelWithoutRequired"/>. </summary>
        /// <param name="name"> name of the ModelWithBaseModelWithoutRequired. </param>
        /// <exception cref="ArgumentNullException"> <paramref name="name"/> is null. </exception>
        public ModelWithBaseModelWithoutRequired(string name)
        {
            Argument.AssertNotNull(name, nameof(name));

            Name = name;
        }

        /// <summary> name of the ModelWithBaseModelWithoutRequired. </summary>
        public string Name { get; set; }

        /// <summary> address of the ModelWithBaseModelWithoutRequired. </summary>
        public string Address { get; set; }
    }
}
