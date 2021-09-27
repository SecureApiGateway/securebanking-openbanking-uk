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
 * Confirmation of Funds API Specification
 * Swagger for Confirmation of Funds API Specification
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.fund;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBFundsConfirmationResponse1Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T16:14:00.739+01:00")
public class OBFundsConfirmationResponse1Data {
    @JsonProperty("FundsConfirmationId")
    private String fundsConfirmationId = null;

    @JsonProperty("ConsentId")
    private String consentId = null;

    @JsonProperty("CreationDateTime")
    private DateTime creationDateTime = null;

    @JsonProperty("FundsAvailable")
    private Boolean fundsAvailable = null;

    @JsonProperty("Reference")
    private String reference = null;

    @JsonProperty("InstructedAmount")
    private OBFundsConfirmation1DataInstructedAmount instructedAmount = null;

    public OBFundsConfirmationResponse1Data fundsConfirmationId(String fundsConfirmationId) {
        this.fundsConfirmationId = fundsConfirmationId;
        return this;
    }

    /**
     * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.
     *
     * @return fundsConfirmationId
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation resource.")
    public String getFundsConfirmationId() {
        return fundsConfirmationId;
    }

    public void setFundsConfirmationId(String fundsConfirmationId) {
        this.fundsConfirmationId = fundsConfirmationId;
    }

    public OBFundsConfirmationResponse1Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.
     *
     * @return consentId
     **/
    @NotNull
    @Size(min = 1, max = 128)
    @ApiModelProperty(required = true, value = "Unique identification as assigned by the ASPSP to uniquely identify the funds confirmation consent resource.")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBFundsConfirmationResponse1Data creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBFundsConfirmationResponse1Data fundsAvailable(Boolean fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
        return this;
    }

    /**
     * Flag to indicate the result of a confirmation of funds check.
     *
     * @return fundsAvailable
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Flag to indicate the result of a confirmation of funds check.")
    public Boolean isFundsAvailable() {
        return fundsAvailable;
    }

    public void setFundsAvailable(Boolean fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }

    public OBFundsConfirmationResponse1Data reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.
     *
     * @return reference
     **/
    @NotNull
    @Size(min = 1, max = 35)
    @ApiModelProperty(required = true, value = "Unique reference, as assigned by the CBPII, to unambiguously refer to the request related to the payment transaction.")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBFundsConfirmationResponse1Data instructedAmount(OBFundsConfirmation1DataInstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
        return this;
    }

    /**
     * Get instructedAmount
     *
     * @return instructedAmount
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBFundsConfirmation1DataInstructedAmount getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBFundsConfirmation1DataInstructedAmount instructedAmount) {
        this.instructedAmount = instructedAmount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBFundsConfirmationResponse1Data obFundsConfirmationResponse1Data = (OBFundsConfirmationResponse1Data) o;
        return Objects.equals(this.fundsConfirmationId, obFundsConfirmationResponse1Data.fundsConfirmationId) &&
                Objects.equals(this.consentId, obFundsConfirmationResponse1Data.consentId) &&
                Objects.equals(this.creationDateTime, obFundsConfirmationResponse1Data.creationDateTime) &&
                Objects.equals(this.fundsAvailable, obFundsConfirmationResponse1Data.fundsAvailable) &&
                Objects.equals(this.reference, obFundsConfirmationResponse1Data.reference) &&
                Objects.equals(this.instructedAmount, obFundsConfirmationResponse1Data.instructedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundsConfirmationId, consentId, creationDateTime, fundsAvailable, reference, instructedAmount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBFundsConfirmationResponse1Data {\n");

        sb.append("    fundsConfirmationId: ").append(toIndentedString(fundsConfirmationId)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    fundsAvailable: ").append(toIndentedString(fundsAvailable)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
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

