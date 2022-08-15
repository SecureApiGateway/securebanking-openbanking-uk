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
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import uk.org.openbanking.datamodel.common.OBPostalAddress6;

/**
 * Party to which an amount of money is due.
 */
@ApiModel(description = "Party to which an amount of money is due.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class OBWriteInternational2DataInitiationCreditor {
    @JsonProperty("Name")
    private String name = null;

    @JsonProperty("PostalAddress")
    private OBPostalAddress6 postalAddress = null;

    public OBWriteInternational2DataInitiationCreditor name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name by which a party is known and which is usually used to identify that party.
     *
     * @return name
     **/
    @Size(min = 1, max = 140)
    @ApiModelProperty(value = "Name by which a party is known and which is usually used to identify that party.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBWriteInternational2DataInitiationCreditor postalAddress(OBPostalAddress6 postalAddress) {
        this.postalAddress = postalAddress;
        return this;
    }

    /**
     * Get postalAddress
     *
     * @return postalAddress
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBPostalAddress6 getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(OBPostalAddress6 postalAddress) {
        this.postalAddress = postalAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternational2DataInitiationCreditor obWriteInternational2DataInitiationCreditor = (OBWriteInternational2DataInitiationCreditor) o;
        return Objects.equals(this.name, obWriteInternational2DataInitiationCreditor.name) &&
                Objects.equals(this.postalAddress, obWriteInternational2DataInitiationCreditor.postalAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, postalAddress);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternational2DataInitiationCreditor {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
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

