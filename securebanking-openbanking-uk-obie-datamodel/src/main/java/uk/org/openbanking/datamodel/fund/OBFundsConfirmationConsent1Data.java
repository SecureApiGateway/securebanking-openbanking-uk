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
 * Confirmation of Funds API Specification
 * Swagger for Confirmation of Funds API Specification
 *
 * OpenAPI spec version: 3.1.7
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.fund;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * OBFundsConfirmationConsent1Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class OBFundsConfirmationConsent1Data {
    @JsonProperty("DebtorAccount")
    private OBFundsConfirmationConsent1DataDebtorAccount debtorAccount = null;

    @JsonProperty("ExpirationDateTime")
    private DateTime expirationDateTime = null;

    public OBFundsConfirmationConsent1Data debtorAccount(OBFundsConfirmationConsent1DataDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }

    /**
     * Get debtorAccount
     *
     * @return debtorAccount
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBFundsConfirmationConsent1DataDebtorAccount getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBFundsConfirmationConsent1DataDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public OBFundsConfirmationConsent1Data expirationDateTime(DateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }

    /**
     * Specified date and time the funds confirmation authorisation will expire.  If this is not populated, the authorisation will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expirationDateTime
     **/
    @Valid
    @ApiModelProperty(value = "Specified date and time the funds confirmation authorisation will expire.  If this is not populated, the authorisation will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
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
        OBFundsConfirmationConsent1Data obFundsConfirmationConsent1Data = (OBFundsConfirmationConsent1Data) o;
        return Objects.equals(this.debtorAccount, obFundsConfirmationConsent1Data.debtorAccount) &&
                Objects.equals(this.expirationDateTime, obFundsConfirmationConsent1Data.expirationDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(debtorAccount, expirationDateTime);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBFundsConfirmationConsent1Data {\n");

        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
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

}

