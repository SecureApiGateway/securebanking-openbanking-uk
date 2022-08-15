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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * OBWritePaymentDetailsResponse1Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class OBWritePaymentDetailsResponse1Data {
    @JsonProperty("PaymentStatus")
    private List<OBWritePaymentDetailsResponse1DataPaymentStatus> paymentStatus = null;

    public OBWritePaymentDetailsResponse1Data paymentStatus(List<OBWritePaymentDetailsResponse1DataPaymentStatus> paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    public OBWritePaymentDetailsResponse1Data addPaymentStatusItem(OBWritePaymentDetailsResponse1DataPaymentStatus paymentStatusItem) {
        if (this.paymentStatus == null) {
            this.paymentStatus = new ArrayList<OBWritePaymentDetailsResponse1DataPaymentStatus>();
        }
        this.paymentStatus.add(paymentStatusItem);
        return this;
    }

    /**
     * Get paymentStatus
     *
     * @return paymentStatus
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBWritePaymentDetailsResponse1DataPaymentStatus> getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(List<OBWritePaymentDetailsResponse1DataPaymentStatus> paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWritePaymentDetailsResponse1Data obWritePaymentDetailsResponse1Data = (OBWritePaymentDetailsResponse1Data) o;
        return Objects.equals(this.paymentStatus, obWritePaymentDetailsResponse1Data.paymentStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentStatus);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWritePaymentDetailsResponse1Data {\n");

        sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
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

