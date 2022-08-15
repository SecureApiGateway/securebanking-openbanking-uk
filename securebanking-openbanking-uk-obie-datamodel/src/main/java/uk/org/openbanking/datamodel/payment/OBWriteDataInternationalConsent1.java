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
package uk.org.openbanking.datamodel.payment;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * OBWriteDataInternationalConsent1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen")

public class OBWriteDataInternationalConsent1 {
    @JsonProperty("Initiation")
    private OBInternational1 initiation = null;

    @JsonProperty("Authorisation")
    private OBAuthorisation1 authorisation = null;

    public OBWriteDataInternationalConsent1 initiation(OBInternational1 initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBInternational1 getInitiation() {
        return initiation;
    }

    public void setInitiation(OBInternational1 initiation) {
        this.initiation = initiation;
    }

    public OBWriteDataInternationalConsent1 authorisation(OBAuthorisation1 authorisation) {
        this.authorisation = authorisation;
        return this;
    }

    /**
     * Get authorisation
     *
     * @return authorisation
     **/
    @ApiModelProperty(value = "")

    @Valid

    public OBAuthorisation1 getAuthorisation() {
        return authorisation;
    }

    public void setAuthorisation(OBAuthorisation1 authorisation) {
        this.authorisation = authorisation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDataInternationalConsent1 obWriteDataInternationalConsent1 = (OBWriteDataInternationalConsent1) o;
        return Objects.equals(this.initiation, obWriteDataInternationalConsent1.initiation) &&
                Objects.equals(this.authorisation, obWriteDataInternationalConsent1.authorisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initiation, authorisation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDataInternationalConsent1 {\n");

        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
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

