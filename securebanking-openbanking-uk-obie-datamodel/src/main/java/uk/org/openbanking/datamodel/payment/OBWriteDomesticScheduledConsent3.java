/**
 * Copyright © 2020-2021 ForgeRock AS (obst@forgerock.com)
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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import uk.org.openbanking.datamodel.common.OBRisk1;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBWriteDomesticScheduledConsent3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T16:03:12.161+01:00")
public class OBWriteDomesticScheduledConsent3 {
    @JsonProperty("Data")
    private OBWriteDomesticScheduledConsent3Data data = null;

    @JsonProperty("Risk")
    private OBRisk1 risk = null;

    public OBWriteDomesticScheduledConsent3 data(OBWriteDomesticScheduledConsent3Data data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBWriteDomesticScheduledConsent3Data getData() {
        return data;
    }

    public void setData(OBWriteDomesticScheduledConsent3Data data) {
        this.data = data;
    }

    public OBWriteDomesticScheduledConsent3 risk(OBRisk1 risk) {
        this.risk = risk;
        return this;
    }

    /**
     * Get risk
     *
     * @return risk
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBRisk1 getRisk() {
        return risk;
    }

    public void setRisk(OBRisk1 risk) {
        this.risk = risk;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticScheduledConsent3 obWriteDomesticScheduledConsent3 = (OBWriteDomesticScheduledConsent3) o;
        return Objects.equals(this.data, obWriteDomesticScheduledConsent3.data) &&
                Objects.equals(this.risk, obWriteDomesticScheduledConsent3.risk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, risk);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticScheduledConsent3 {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
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

