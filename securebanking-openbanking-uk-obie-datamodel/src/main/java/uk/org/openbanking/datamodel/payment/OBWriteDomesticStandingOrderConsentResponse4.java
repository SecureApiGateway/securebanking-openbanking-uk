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

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import uk.org.openbanking.datamodel.common.Links;
import uk.org.openbanking.datamodel.common.Meta;
import uk.org.openbanking.datamodel.common.OBRisk1;

/**
 * OBWriteDomesticStandingOrderConsentResponse4
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class OBWriteDomesticStandingOrderConsentResponse4 {
    @JsonProperty("Data")
    private OBWriteDomesticStandingOrderConsentResponse4Data data = null;

    @JsonProperty("Risk")
    private OBRisk1 risk = null;

    @JsonProperty("Links")
    private Links links = null;

    @JsonProperty("Meta")
    private Meta meta = null;

    public OBWriteDomesticStandingOrderConsentResponse4 data(OBWriteDomesticStandingOrderConsentResponse4Data data) {
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
    public OBWriteDomesticStandingOrderConsentResponse4Data getData() {
        return data;
    }

    public void setData(OBWriteDomesticStandingOrderConsentResponse4Data data) {
        this.data = data;
    }

    public OBWriteDomesticStandingOrderConsentResponse4 risk(OBRisk1 risk) {
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

    public OBWriteDomesticStandingOrderConsentResponse4 links(Links links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     *
     * @return links
     **/
    @Valid
    @ApiModelProperty(value = "")
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public OBWriteDomesticStandingOrderConsentResponse4 meta(Meta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * Get meta
     *
     * @return meta
     **/
    @Valid
    @ApiModelProperty(value = "")
    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticStandingOrderConsentResponse4 obWriteDomesticStandingOrderConsentResponse4 = (OBWriteDomesticStandingOrderConsentResponse4) o;
        return Objects.equals(this.data, obWriteDomesticStandingOrderConsentResponse4.data) &&
                Objects.equals(this.risk, obWriteDomesticStandingOrderConsentResponse4.risk) &&
                Objects.equals(this.links, obWriteDomesticStandingOrderConsentResponse4.links) &&
                Objects.equals(this.meta, obWriteDomesticStandingOrderConsentResponse4.meta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, risk, links, meta);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticStandingOrderConsentResponse4 {\n");

        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

