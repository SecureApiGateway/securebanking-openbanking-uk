/*
 * Copyright © 2020-2024 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.fund;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import uk.org.openbanking.datamodel.common.OBReadRefundAccount;
import uk.org.openbanking.datamodel.fund.OBCashAccountDebtor4;
import uk.org.openbanking.datamodel.fund.OBPaymentConsentStatus;
import uk.org.openbanking.datamodel.fund.OBSCASupportData1;
import uk.org.openbanking.datamodel.fund.OBWriteDomesticConsent4DataAuthorisation;
import uk.org.openbanking.datamodel.fund.OBWriteDomesticConsentResponse5DataChargesInner;
import uk.org.openbanking.datamodel.fund.OBWriteDomesticScheduledConsent4DataPermission;
import uk.org.openbanking.datamodel.fund.OBWriteInternationalConsentResponse6DataExchangeRateInformation;
import uk.org.openbanking.datamodel.fund.OBWriteInternationalScheduledConsentResponse6DataInitiation;

import java.time.OffsetDateTime;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

import jakarta.annotation.Generated;

/**
 * OBWriteInternationalScheduledConsentResponse6Data
 */

@JsonTypeName("OBWriteInternationalScheduledConsentResponse6_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteInternationalScheduledConsentResponse6Data {

    private String consentId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime creationDateTime;

    private OBPaymentConsentStatus status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime statusUpdateDateTime;

    private OBWriteDomesticScheduledConsent4DataPermission permission;

    private OBReadRefundAccount readRefundAccount;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime cutOffDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime expectedExecutionDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime expectedSettlementDateTime;

    @Valid
    private List<@Valid OBWriteDomesticConsentResponse5DataChargesInner> charges;

    private OBWriteInternationalConsentResponse6DataExchangeRateInformation exchangeRateInformation;

    private OBWriteInternationalScheduledConsentResponse6DataInitiation initiation;

    private OBWriteDomesticConsent4DataAuthorisation authorisation;

    private OBSCASupportData1 scASupportData;

    private OBCashAccountDebtor4 debtor;

    public OBWriteInternationalScheduledConsentResponse6Data() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteInternationalScheduledConsentResponse6Data(String consentId, DateTime creationDateTime, OBPaymentConsentStatus status, DateTime statusUpdateDateTime, OBWriteDomesticScheduledConsent4DataPermission permission, OBWriteInternationalScheduledConsentResponse6DataInitiation initiation) {
        this.consentId = consentId;
        this.creationDateTime = creationDateTime;
        this.status = status;
        this.statusUpdateDateTime = statusUpdateDateTime;
        this.permission = permission;
        this.initiation = initiation;
    }

    public OBWriteInternationalScheduledConsentResponse6Data consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.
     *
     * @return consentId
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(name = "ConsentId", description = "OB: Unique identification as assigned by the ASPSP to uniquely identify the consent resource.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ConsentId")
    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    public OBWriteInternationalScheduledConsentResponse6Data creationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return creationDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "CreationDateTime", description = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CreationDateTime")
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public OBWriteInternationalScheduledConsentResponse6Data status(OBPaymentConsentStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @NotNull
    @Valid
    @Schema(name = "Status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Status")
    public OBPaymentConsentStatus getStatus() {
        return status;
    }

    public void setStatus(OBPaymentConsentStatus status) {
        this.status = status;
    }

    public OBWriteInternationalScheduledConsentResponse6Data statusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
        return this;
    }

    /**
     * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return statusUpdateDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "StatusUpdateDateTime", description = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("StatusUpdateDateTime")
    public DateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    public void setStatusUpdateDateTime(DateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    public OBWriteInternationalScheduledConsentResponse6Data permission(OBWriteDomesticScheduledConsent4DataPermission permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Get permission
     *
     * @return permission
     */
    @NotNull
    @Valid
    @Schema(name = "Permission", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Permission")
    public OBWriteDomesticScheduledConsent4DataPermission getPermission() {
        return permission;
    }

    public void setPermission(OBWriteDomesticScheduledConsent4DataPermission permission) {
        this.permission = permission;
    }

    public OBWriteInternationalScheduledConsentResponse6Data readRefundAccount(OBReadRefundAccount readRefundAccount) {
        this.readRefundAccount = readRefundAccount;
        return this;
    }

    /**
     * Get readRefundAccount
     *
     * @return readRefundAccount
     */
    @Valid
    @Schema(name = "ReadRefundAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ReadRefundAccount")
    public OBReadRefundAccount getReadRefundAccount() {
        return readRefundAccount;
    }

    public void setReadRefundAccount(OBReadRefundAccount readRefundAccount) {
        this.readRefundAccount = readRefundAccount;
    }

    public OBWriteInternationalScheduledConsentResponse6Data cutOffDateTime(DateTime cutOffDateTime) {
        this.cutOffDateTime = cutOffDateTime;
        return this;
    }

    /**
     * Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return cutOffDateTime
     */
    @Valid
    @Schema(name = "CutOffDateTime", description = "Specified cut-off date and time for the payment consent.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("CutOffDateTime")
    public DateTime getCutOffDateTime() {
        return cutOffDateTime;
    }

    public void setCutOffDateTime(DateTime cutOffDateTime) {
        this.cutOffDateTime = cutOffDateTime;
    }

    public OBWriteInternationalScheduledConsentResponse6Data expectedExecutionDateTime(DateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
        return this;
    }

    /**
     * Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expectedExecutionDateTime
     */
    @Valid
    @Schema(name = "ExpectedExecutionDateTime", description = "Expected execution date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExpectedExecutionDateTime")
    public DateTime getExpectedExecutionDateTime() {
        return expectedExecutionDateTime;
    }

    public void setExpectedExecutionDateTime(DateTime expectedExecutionDateTime) {
        this.expectedExecutionDateTime = expectedExecutionDateTime;
    }

    public OBWriteInternationalScheduledConsentResponse6Data expectedSettlementDateTime(DateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
        return this;
    }

    /**
     * Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return expectedSettlementDateTime
     */
    @Valid
    @Schema(name = "ExpectedSettlementDateTime", description = "Expected settlement date and time for the payment resource.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExpectedSettlementDateTime")
    public DateTime getExpectedSettlementDateTime() {
        return expectedSettlementDateTime;
    }

    public void setExpectedSettlementDateTime(DateTime expectedSettlementDateTime) {
        this.expectedSettlementDateTime = expectedSettlementDateTime;
    }

    public OBWriteInternationalScheduledConsentResponse6Data charges(List<@Valid OBWriteDomesticConsentResponse5DataChargesInner> charges) {
        this.charges = charges;
        return this;
    }

    public OBWriteInternationalScheduledConsentResponse6Data addChargesItem(OBWriteDomesticConsentResponse5DataChargesInner chargesItem) {
        if (this.charges == null) {
            this.charges = new ArrayList<>();
        }
        this.charges.add(chargesItem);
        return this;
    }

    /**
     * Get charges
     *
     * @return charges
     */
    @Valid
    @Schema(name = "Charges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Charges")
    public List<@Valid OBWriteDomesticConsentResponse5DataChargesInner> getCharges() {
        return charges;
    }

    public void setCharges(List<@Valid OBWriteDomesticConsentResponse5DataChargesInner> charges) {
        this.charges = charges;
    }

    public OBWriteInternationalScheduledConsentResponse6Data exchangeRateInformation(OBWriteInternationalConsentResponse6DataExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
        return this;
    }

    /**
     * Get exchangeRateInformation
     *
     * @return exchangeRateInformation
     */
    @Valid
    @Schema(name = "ExchangeRateInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ExchangeRateInformation")
    public OBWriteInternationalConsentResponse6DataExchangeRateInformation getExchangeRateInformation() {
        return exchangeRateInformation;
    }

    public void setExchangeRateInformation(OBWriteInternationalConsentResponse6DataExchangeRateInformation exchangeRateInformation) {
        this.exchangeRateInformation = exchangeRateInformation;
    }

    public OBWriteInternationalScheduledConsentResponse6Data initiation(OBWriteInternationalScheduledConsentResponse6DataInitiation initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     */
    @NotNull
    @Valid
    @Schema(name = "Initiation", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Initiation")
    public OBWriteInternationalScheduledConsentResponse6DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteInternationalScheduledConsentResponse6DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteInternationalScheduledConsentResponse6Data authorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
        this.authorisation = authorisation;
        return this;
    }

    /**
     * Get authorisation
     *
     * @return authorisation
     */
    @Valid
    @Schema(name = "Authorisation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Authorisation")
    public OBWriteDomesticConsent4DataAuthorisation getAuthorisation() {
        return authorisation;
    }

    public void setAuthorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
        this.authorisation = authorisation;
    }

    public OBWriteInternationalScheduledConsentResponse6Data scASupportData(OBSCASupportData1 scASupportData) {
        this.scASupportData = scASupportData;
        return this;
    }

    /**
     * Get scASupportData
     *
     * @return scASupportData
     */
    @Valid
    @Schema(name = "SCASupportData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SCASupportData")
    public OBSCASupportData1 getScASupportData() {
        return scASupportData;
    }

    public void setScASupportData(OBSCASupportData1 scASupportData) {
        this.scASupportData = scASupportData;
    }

    public OBWriteInternationalScheduledConsentResponse6Data debtor(OBCashAccountDebtor4 debtor) {
        this.debtor = debtor;
        return this;
    }

    /**
     * Get debtor
     *
     * @return debtor
     */
    @Valid
    @Schema(name = "Debtor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Debtor")
    public OBCashAccountDebtor4 getDebtor() {
        return debtor;
    }

    public void setDebtor(OBCashAccountDebtor4 debtor) {
        this.debtor = debtor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalScheduledConsentResponse6Data obWriteInternationalScheduledConsentResponse6Data = (OBWriteInternationalScheduledConsentResponse6Data) o;
        return Objects.equals(this.consentId, obWriteInternationalScheduledConsentResponse6Data.consentId) &&
                Objects.equals(this.creationDateTime, obWriteInternationalScheduledConsentResponse6Data.creationDateTime) &&
                Objects.equals(this.status, obWriteInternationalScheduledConsentResponse6Data.status) &&
                Objects.equals(this.statusUpdateDateTime, obWriteInternationalScheduledConsentResponse6Data.statusUpdateDateTime) &&
                Objects.equals(this.permission, obWriteInternationalScheduledConsentResponse6Data.permission) &&
                Objects.equals(this.readRefundAccount, obWriteInternationalScheduledConsentResponse6Data.readRefundAccount) &&
                Objects.equals(this.cutOffDateTime, obWriteInternationalScheduledConsentResponse6Data.cutOffDateTime) &&
                Objects.equals(this.expectedExecutionDateTime, obWriteInternationalScheduledConsentResponse6Data.expectedExecutionDateTime) &&
                Objects.equals(this.expectedSettlementDateTime, obWriteInternationalScheduledConsentResponse6Data.expectedSettlementDateTime) &&
                Objects.equals(this.charges, obWriteInternationalScheduledConsentResponse6Data.charges) &&
                Objects.equals(this.exchangeRateInformation, obWriteInternationalScheduledConsentResponse6Data.exchangeRateInformation) &&
                Objects.equals(this.initiation, obWriteInternationalScheduledConsentResponse6Data.initiation) &&
                Objects.equals(this.authorisation, obWriteInternationalScheduledConsentResponse6Data.authorisation) &&
                Objects.equals(this.scASupportData, obWriteInternationalScheduledConsentResponse6Data.scASupportData) &&
                Objects.equals(this.debtor, obWriteInternationalScheduledConsentResponse6Data.debtor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consentId, creationDateTime, status, statusUpdateDateTime, permission, readRefundAccount, cutOffDateTime, expectedExecutionDateTime, expectedSettlementDateTime, charges, exchangeRateInformation, initiation, authorisation, scASupportData, debtor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalScheduledConsentResponse6Data {\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    readRefundAccount: ").append(toIndentedString(readRefundAccount)).append("\n");
        sb.append("    cutOffDateTime: ").append(toIndentedString(cutOffDateTime)).append("\n");
        sb.append("    expectedExecutionDateTime: ").append(toIndentedString(expectedExecutionDateTime)).append("\n");
        sb.append("    expectedSettlementDateTime: ").append(toIndentedString(expectedSettlementDateTime)).append("\n");
        sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
        sb.append("    exchangeRateInformation: ").append(toIndentedString(exchangeRateInformation)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
        sb.append("    scASupportData: ").append(toIndentedString(scASupportData)).append("\n");
        sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
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

