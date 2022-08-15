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

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Supporting Data provided by TPP, when requesting SCA Exemption.
 */
@ApiModel(description = "Supporting Data provided by TPP, when requesting SCA Exemption.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class OBWriteDomesticConsent3DataSCASupportData {
    @JsonProperty("RequestedSCAExemptionType")
    private OBRequestedSCAExemptionTypeEnum requestedSCAExemptionType = null;
    @JsonProperty("AppliedAuthenticationApproach")
    private OBAppliedAuthenticationApproachEnum appliedAuthenticationApproach = null;
    @JsonProperty("ReferencePaymentOrderId")
    private String referencePaymentOrderId = null;

    public OBWriteDomesticConsent3DataSCASupportData requestedSCAExemptionType(OBRequestedSCAExemptionTypeEnum requestedSCAExemptionType) {
        this.requestedSCAExemptionType = requestedSCAExemptionType;
        return this;
    }

    /**
     * This field allows a PISP to request specific SCA Exemption for a Payment Initiation
     *
     * @return requestedSCAExemptionType
     **/
    @ApiModelProperty(value = "This field allows a PISP to request specific SCA Exemption for a Payment Initiation")
    public OBRequestedSCAExemptionTypeEnum getRequestedSCAExemptionType() {
        return requestedSCAExemptionType;
    }

    public void setRequestedSCAExemptionType(OBRequestedSCAExemptionTypeEnum requestedSCAExemptionType) {
        this.requestedSCAExemptionType = requestedSCAExemptionType;
    }

    public OBWriteDomesticConsent3DataSCASupportData appliedAuthenticationApproach(OBAppliedAuthenticationApproachEnum appliedAuthenticationApproach) {
        this.appliedAuthenticationApproach = appliedAuthenticationApproach;
        return this;
    }

    /**
     * Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP
     *
     * @return appliedAuthenticationApproach
     **/
    @ApiModelProperty(value = "Specifies a character string with a maximum length of 40 characters. Usage: This field indicates whether the PSU was subject to SCA performed by the TPP")
    public OBAppliedAuthenticationApproachEnum getAppliedAuthenticationApproach() {
        return appliedAuthenticationApproach;
    }

    public void setAppliedAuthenticationApproach(OBAppliedAuthenticationApproachEnum appliedAuthenticationApproach) {
        this.appliedAuthenticationApproach = appliedAuthenticationApproach;
    }

    public OBWriteDomesticConsent3DataSCASupportData referencePaymentOrderId(String referencePaymentOrderId) {
        this.referencePaymentOrderId = referencePaymentOrderId;
        return this;
    }

    /**
     * Specifies a character string with a maximum length of 140 characters. Usage: If the payment is recurring then the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence.
     *
     * @return referencePaymentOrderId
     **/
    @Size(min = 1, max = 128)
    @ApiModelProperty(value = "Specifies a character string with a maximum length of 140 characters. Usage: If the payment is recurring then the transaction identifier of the previous payment occurrence so that the ASPSP can verify that the PISP, amount and the payee are the same as the previous occurrence.")
    public String getReferencePaymentOrderId() {
        return referencePaymentOrderId;
    }

    public void setReferencePaymentOrderId(String referencePaymentOrderId) {
        this.referencePaymentOrderId = referencePaymentOrderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticConsent3DataSCASupportData obWriteDomesticConsent3DataSCASupportData = (OBWriteDomesticConsent3DataSCASupportData) o;
        return Objects.equals(this.requestedSCAExemptionType, obWriteDomesticConsent3DataSCASupportData.requestedSCAExemptionType) &&
                Objects.equals(this.appliedAuthenticationApproach, obWriteDomesticConsent3DataSCASupportData.appliedAuthenticationApproach) &&
                Objects.equals(this.referencePaymentOrderId, obWriteDomesticConsent3DataSCASupportData.referencePaymentOrderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestedSCAExemptionType, appliedAuthenticationApproach, referencePaymentOrderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticConsent3DataSCASupportData {\n");

        sb.append("    requestedSCAExemptionType: ").append(toIndentedString(requestedSCAExemptionType)).append("\n");
        sb.append("    appliedAuthenticationApproach: ").append(toIndentedString(appliedAuthenticationApproach)).append("\n");
        sb.append("    referencePaymentOrderId: ").append(toIndentedString(referencePaymentOrderId)).append("\n");
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

