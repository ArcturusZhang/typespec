import "@typespec/rest";
import "@typespec/http";
import "@azure-tools/typespec-client-generator-core";
import "@azure-tools/typespec-azure-core";

@versioned(Versions)
@service({
  title: "hello world",
})
@doc("This is a sample typespec project.")
@server(
  "{unbrandedTypeSpecUrl}",
  "Endpoint Service",
  {
    unbrandedTypeSpecUrl: string,
  }
)
@useAuth(ApiKeyAuth<ApiKeyLocation.header, "my-api-key">)
namespace UnbrandedTypeSpec;

using TypeSpec.Http;
using TypeSpec.Versioning;
using Azure.ClientGenerator.Core;
using Azure.Core;

enum Versions {
  `2024-07-16-preview`,
}

model Greeting {
  /** The message */
  message?: string;

  /** The participants */
  participants?: string[];
}

@route("/hello")
@doc("Return hi")
@get
op sayHi(
  @header headParameter: string,
  @query queryParameter: string,
  @query optionalQuery?: string,
  @body body: Greeting,
): Greeting;
