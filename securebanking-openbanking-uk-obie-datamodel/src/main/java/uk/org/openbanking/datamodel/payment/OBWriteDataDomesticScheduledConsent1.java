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
 * OBWriteDataDomesticScheduledConsent1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen")

public class OBWriteDataDomesticScheduledConsent1 {
    @JsonProperty("Permission")
    private OBExternalPermissions2Code permission = null;

    @JsonProperty("Initiation")
    private OBDomesticScheduled1 initiation = null;

    @JsonProperty("Authorisation")
    private OBAuthorisation1 authorisation = null;

    public OBWriteDataDomesticScheduledConsent1 permission(OBExternalPermissions2Code permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Get permission
     *
     * @return permission
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OBExternalPermissions2Code getPermission() {
        return permission;
    }

    public void setPermission(OBExternalPermissions2Code permission) {
        this.permission = permission;
    }

    public OBWriteDataDomesticScheduledConsent1 initiation(OBDomesticScheduled1 initiation) {
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

    public OBDomesticScheduled1 getInitiation() {
        return initiation;
    }

    public void setInitiation(OBDomesticScheduled1 initiation) {
        this.initiation = initiation;
    }

    public OBWriteDataDomesticScheduledConsent1 authorisation(OBAuthorisation1 authorisation) {
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
        OBWriteDataDomesticScheduledConsent1 obWriteDataDomesticScheduledConsent1 = (OBWriteDataDomesticScheduledConsent1) o;
        return Objects.equals(this.permission, obWriteDataDomesticScheduledConsent1.permission) &&
                Objects.equals(this.initiation, obWriteDataDomesticScheduledConsent1.initiation) &&
                Objects.equals(this.authorisation, obWriteDataDomesticScheduledConsent1.authorisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, initiation, authorisation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDataDomesticScheduledConsent1 {\n");

        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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

