/**
 * Copyright © 2021 ForgeRock AS (obst@forgerock.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Event Notification API Specification - ASPSP Endpoints
 * Swagger for Event Notification API Specification - ASPSP Endpoints
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBCallbackUrlsResponseData1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-25T13:48:32.198+01:00")
public class OBCallbackUrlsResponseData1 {
  @JsonProperty("CallbackUrl")
  private List<OBCallbackUrlResponseData1> callbackUrl = null;

  public OBCallbackUrlsResponseData1 callbackUrl(List<OBCallbackUrlResponseData1> callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  public OBCallbackUrlsResponseData1 addCallbackUrlItem(OBCallbackUrlResponseData1 callbackUrlItem) {
    if (this.callbackUrl == null) {
      this.callbackUrl = new ArrayList<OBCallbackUrlResponseData1>();
    }
    this.callbackUrl.add(callbackUrlItem);
    return this;
  }

   /**
   * Get callbackUrl
   * @return callbackUrl
  **/
   @Valid
   @ApiModelProperty(value = "")
   public List<OBCallbackUrlResponseData1> getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(List<OBCallbackUrlResponseData1> callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCallbackUrlsResponseData1 obCallbackUrlsResponseData1 = (OBCallbackUrlsResponseData1) o;
    return Objects.equals(this.callbackUrl, obCallbackUrlsResponseData1.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCallbackUrlsResponseData1 {\n");

    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

