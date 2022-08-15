/*
 * Copyright © 2020-2022 ForgeRock AS (obst@forgerock.com)
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
 * Payment Initiation API
 * Swagger for Payment Initiation API Specification
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.payment;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The multiple authorisation flow response from the ASPSP.
 */
@ApiModel(description = "The multiple authorisation flow response from the ASPSP.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T16:03:12.161+01:00")
public class OBWriteDomesticResponse3DataMultiAuthorisation {
    @JsonProperty("Status")
    private StatusEnum status = null;
    @JsonProperty("NumberRequired")
    private Integer numberRequired = null;
    @JsonProperty("NumberReceived")
    private Integer numberReceived = null;
    @JsonProperty("LastUpdateDateTime")
    private DateTime lastUpdateDateTime = null;
    @JsonProperty("ExpirationDateTime")
    private DateTime expirationDateTime = null;

    public OBWriteDomesticResponse3DataMultiAuthorisation status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the status of the authorisation flow in code form.
     *
     * @return status
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Specifies the status of the authorisation flow in code form.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OBWriteDomesticResponse3DataMultiAuthorisation numberRequired(Integer numberRequired) {
        this.numberRequired = numberRequired;
        return this;
    }

    /**
     * Number of authorisations required for payment order (total required at the start of the multi authorisation journey).
     *
     * @return numberRequired
     **/
    @ApiModelProperty(value = "Number of authorisations required for payment order (total required at the start of the multi authorisation journey).")
    public Integer getNumberRequired() {
        return numberRequired;
    }

    public void setNumberRequired(Integer numberRequired) {
        this.numberRequired = numberRequired;
    }

    public OBWriteDomesticResponse3DataMultiAuthorisation numberReceived(Integer numberReceived) {
        this.numberReceived = numberReceived;
        return this;
    }

    /**
     * Number of authorisations received.
     *
     * @return numberReceived
     **/
    @ApiModelProperty(value = "Number of authorisations received.")
    public Integer getNumberReceived() {
        return numberReceived;
    }

    public void setNumberReceived(Integer numberReceived) {
        this.numberReceived = numberReceived;
    }

    public OBWriteDomesticResponse3DataMultiAuthorisation lastUpdateDateTime(DateTime lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    /**
     * Last date and time at the authorisation flow was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return lastUpdateDateTime
     **/
    @Valid
    @ApiModelProperty(value = "Last date and time at the authorisation flow was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    public void setLastUpdateDateTime(DateTime lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public OBWriteDomesticResponse3DataMultiAuthorisation expirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Date and time at which the requested authorisation flow must be completed.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expirationDateTime
     **/
    @Valid
    @ApiModelProperty(value = "Date and time at which the requested authorisation flow must be completed.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getExpirationDateTime() {
        return expirationDateTime;
    }

    public void setExpirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticResponse3DataMultiAuthorisation obWriteDomesticResponse3DataMultiAuthorisation = (OBWriteDomesticResponse3DataMultiAuthorisation) o;
        return Objects.equals(this.status, obWriteDomesticResponse3DataMultiAuthorisation.status) &&
                Objects.equals(this.numberRequired, obWriteDomesticResponse3DataMultiAuthorisation.numberRequired) &&
                Objects.equals(this.numberReceived, obWriteDomesticResponse3DataMultiAuthorisation.numberReceived) &&
                Objects.equals(this.lastUpdateDateTime, obWriteDomesticResponse3DataMultiAuthorisation.lastUpdateDateTime) &&
                Objects.equals(this.expirationDateTime, obWriteDomesticResponse3DataMultiAuthorisation.expirationDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, numberRequired, numberReceived, lastUpdateDateTime, expirationDateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticResponse3DataMultiAuthorisation {\n");

        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    numberRequired: ").append(toIndentedString(numberRequired)).append("\n");
        sb.append("    numberReceived: ").append(toIndentedString(numberReceived)).append("\n");
        sb.append("    lastUpdateDateTime: ").append(toIndentedString(lastUpdateDateTime)).append("\n");
        sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
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

    /**
     * Specifies the status of the authorisation flow in code form.
     */
    public enum StatusEnum {
        AUTHORISED("Authorised"),

        AWAITINGFURTHERAUTHORISATION("AwaitingFurtherAuthorisation"),

        REJECTED("Rejected");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

