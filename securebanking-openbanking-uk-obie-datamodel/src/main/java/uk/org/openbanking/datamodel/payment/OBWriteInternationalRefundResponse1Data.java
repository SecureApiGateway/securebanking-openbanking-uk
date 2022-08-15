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
 * OpenAPI spec version: v3.1.4
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.payment;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * OBWriteInternationalRefundResponse1Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T14:14:13.501+01:00")
public class OBWriteInternationalRefundResponse1Data {
    @JsonProperty("Refund")
    private OBWriteInternationalRefundResponse1DataRefund refund = null;

    public OBWriteInternationalRefundResponse1Data refund(OBWriteInternationalRefundResponse1DataRefund refund) {
        this.refund = refund;
        return this;
    }

    /**
     * Get refund
     *
     * @return refund
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteInternationalRefundResponse1DataRefund getRefund() {
        return refund;
    }

    public void setRefund(OBWriteInternationalRefundResponse1DataRefund refund) {
        this.refund = refund;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalRefundResponse1Data obWriteInternationalRefundResponse1Data = (OBWriteInternationalRefundResponse1Data) o;
        return Objects.equals(this.refund, obWriteInternationalRefundResponse1Data.refund);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refund);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalRefundResponse1Data {\n");

        sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
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

