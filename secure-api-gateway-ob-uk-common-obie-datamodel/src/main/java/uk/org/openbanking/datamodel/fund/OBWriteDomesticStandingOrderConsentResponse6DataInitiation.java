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

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import uk.org.openbanking.datamodel.common.OBSupplementaryData1;
import uk.org.openbanking.datamodel.fund.OBWriteDomestic2DataInitiationDebtorAccount;
import uk.org.openbanking.datamodel.fund.OBWriteDomesticStandingOrder3DataInitiationCreditorAccount;
import uk.org.openbanking.datamodel.fund.OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount;
import uk.org.openbanking.datamodel.fund.OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount;
import uk.org.openbanking.datamodel.fund.OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount;

import java.time.OffsetDateTime;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;

import jakarta.annotation.Generated;

/**
 * The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a domestic standing order.
 */

@Schema(name = "OBWriteDomesticStandingOrderConsentResponse6_Data_Initiation", description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds from the debtor account to a creditor for a domestic standing order.")
@JsonTypeName("OBWriteDomesticStandingOrderConsentResponse6_Data_Initiation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBWriteDomesticStandingOrderConsentResponse6DataInitiation {

    private String frequency;

    private String reference;

    private String numberOfPayments;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime firstPaymentDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime recurringPaymentDateTime;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private DateTime finalPaymentDateTime;

    private OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount firstPaymentAmount;

    private OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount recurringPaymentAmount;

    private OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount finalPaymentAmount;

    private OBWriteDomestic2DataInitiationDebtorAccount debtorAccount;

    private OBWriteDomesticStandingOrder3DataInitiationCreditorAccount creditorAccount;

    private OBSupplementaryData1 supplementaryData;

    public OBWriteDomesticStandingOrderConsentResponse6DataInitiation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OBWriteDomesticStandingOrderConsentResponse6DataInitiation(String frequency, DateTime firstPaymentDateTime, OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount firstPaymentAmount, OBWriteDomesticStandingOrder3DataInitiationCreditorAccount creditorAccount) {
        this.frequency = frequency;
        this.firstPaymentDateTime = firstPaymentDateTime;
        this.firstPaymentAmount = firstPaymentAmount;
        this.creditorAccount = creditorAccount;
    }

    public OBWriteDomesticStandingOrderConsentResponse6DataInitiation frequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Individual Definitions: EvryDay - Every day EvryWorkgDay - Every working day IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-5 to -1, 1 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED).  ENGLISH = Paid on the 25th March, 24th June, 29th September and 25th December.  SCOTTISH = Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED = Paid on the 20th March, 19th June, 24th September and 20th December.  Individual Patterns: EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: EvryDay EvryWorkgDay IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$
     *
     * @return frequency
     */
    @NotNull
    @Pattern(regexp = "^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$")
    @Schema(name = "Frequency", description = "Individual Definitions: EvryDay - Every day EvryWorkgDay - Every working day IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07) WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07) IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-5 to -1, 1 to 31) QtrDay - Quarterly (either ENGLISH, SCOTTISH, or RECEIVED).  ENGLISH = Paid on the 25th March, 24th June, 29th September and 25th December.  SCOTTISH = Paid on the 2nd February, 15th May, 1st August and 11th November. RECEIVED = Paid on the 20th March, 19th June, 24th September and 20th December.  Individual Patterns: EvryDay (ScheduleCode) EvryWorkgDay (ScheduleCode) IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek) WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek) IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) ScheduleCode + QuarterDay The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: EvryDay EvryWorkgDay IntrvlWkDay:0[1-9]:0[1-7] WkInMnthDay:0[1-5]:0[1-7] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Full Regular Expression: ^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("Frequency")
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public OBWriteDomesticStandingOrderConsentResponse6DataInitiation reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
     *
     * @return reference
     */
    @Size(min = 1, max = 35)
    @Schema(name = "Reference", description = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("Reference")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBWriteDomesticStandingOrderConsentResponse6DataInitiation numberOfPayments(String numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
        return this;
    }

    /**
     * Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.
     *
     * @return numberOfPayments
     */
    @Size(min = 1, max = 35)
    @Schema(name = "NumberOfPayments", description = "Number of the payments that will be made in completing this frequency sequence including any executed since the sequence start date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("NumberOfPayments")
    public String getNumberOfPayments() {
        return numberOfPayments;
    }

    public void setNumberOfPayments(String numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    public OBWriteDomesticStandingOrderConsentResponse6DataInitiation firstPaymentDateTime(DateTime firstPaymentDateTime) {
        this.firstPaymentDateTime = firstPaymentDateTime;
        return this;
    }

    /**
     * The date on which the first payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return firstPaymentDateTime
     */
    @NotNull
    @Valid
    @Schema(name = "FirstPaymentDateTime", description = "The date on which the first payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FirstPaymentDateTime")
    public DateTime getFirstPaymentDateTime() {
        return firstPaymentDateTime;
    }

    public void setFirstPaymentDateTime(DateTime firstPaymentDateTime) {
        this.firstPaymentDateTime = firstPaymentDateTime;
    }

    public OBWriteDomesticStandingOrderConsentResponse6DataInitiation recurringPaymentDateTime(DateTime recurringPaymentDateTime) {
        this.recurringPaymentDateTime = recurringPaymentDateTime;
        return this;
    }

    /**
     * The date on which the first recurring payment for a Standing Order schedule will be made.  Usage: This must be populated only if the first recurring date is different to the first payment date.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return recurringPaymentDateTime
     */
    @Valid
    @Schema(name = "RecurringPaymentDateTime", description = "The date on which the first recurring payment for a Standing Order schedule will be made.  Usage: This must be populated only if the first recurring date is different to the first payment date.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("RecurringPaymentDateTime")
    public DateTime getRecurringPaymentDateTime() {
        return recurringPaymentDateTime;
    }

    public void setRecurringPaymentDateTime(DateTime recurringPaymentDateTime) {
        this.recurringPaymentDateTime = recurringPaymentDateTime;
    }

    public OBWriteDomesticStandingOrderConsentResponse6DataInitiation finalPaymentDateTime(DateTime finalPaymentDateTime) {
        this.finalPaymentDateTime = finalPaymentDateTime;
        return this;
    }

    /**
     * The date on which the final payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return finalPaymentDateTime
     */
    @Valid
    @Schema(name = "FinalPaymentDateTime", description = "The date on which the final payment for a Standing Order schedule will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FinalPaymentDateTime")
    public DateTime getFinalPaymentDateTime() {
        return finalPaymentDateTime;
    }

    public void setFinalPaymentDateTime(DateTime finalPaymentDateTime) {
        this.finalPaymentDateTime = finalPaymentDateTime;
    }

    public OBWriteDomesticStandingOrderConsentResponse6DataInitiation firstPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount firstPaymentAmount) {
        this.firstPaymentAmount = firstPaymentAmount;
        return this;
    }

    /**
     * Get firstPaymentAmount
     *
     * @return firstPaymentAmount
     */
    @NotNull
    @Valid
    @Schema(name = "FirstPaymentAmount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("FirstPaymentAmount")
    public OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount getFirstPaymentAmount() {
        return firstPaymentAmount;
    }

    public void setFirstPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationFirstPaymentAmount firstPaymentAmount) {
        this.firstPaymentAmount = firstPaymentAmount;
    }

    public OBWriteDomesticStandingOrderConsentResponse6DataInitiation recurringPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount recurringPaymentAmount) {
        this.recurringPaymentAmount = recurringPaymentAmount;
        return this;
    }

    /**
     * Get recurringPaymentAmount
     *
     * @return recurringPaymentAmount
     */
    @Valid
    @Schema(name = "RecurringPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("RecurringPaymentAmount")
    public OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount getRecurringPaymentAmount() {
        return recurringPaymentAmount;
    }

    public void setRecurringPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationRecurringPaymentAmount recurringPaymentAmount) {
        this.recurringPaymentAmount = recurringPaymentAmount;
    }

    public OBWriteDomesticStandingOrderConsentResponse6DataInitiation finalPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount finalPaymentAmount) {
        this.finalPaymentAmount = finalPaymentAmount;
        return this;
    }

    /**
     * Get finalPaymentAmount
     *
     * @return finalPaymentAmount
     */
    @Valid
    @Schema(name = "FinalPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("FinalPaymentAmount")
    public OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount getFinalPaymentAmount() {
        return finalPaymentAmount;
    }

    public void setFinalPaymentAmount(OBWriteDomesticStandingOrder3DataInitiationFinalPaymentAmount finalPaymentAmount) {
        this.finalPaymentAmount = finalPaymentAmount;
    }

    public OBWriteDomesticStandingOrderConsentResponse6DataInitiation debtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
        return this;
    }

    /**
     * Get debtorAccount
     *
     * @return debtorAccount
     */
    @Valid
    @Schema(name = "DebtorAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("DebtorAccount")
    public OBWriteDomestic2DataInitiationDebtorAccount getDebtorAccount() {
        return debtorAccount;
    }

    public void setDebtorAccount(OBWriteDomestic2DataInitiationDebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    public OBWriteDomesticStandingOrderConsentResponse6DataInitiation creditorAccount(OBWriteDomesticStandingOrder3DataInitiationCreditorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
        return this;
    }

    /**
     * Get creditorAccount
     *
     * @return creditorAccount
     */
    @NotNull
    @Valid
    @Schema(name = "CreditorAccount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("CreditorAccount")
    public OBWriteDomesticStandingOrder3DataInitiationCreditorAccount getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBWriteDomesticStandingOrder3DataInitiationCreditorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    public OBWriteDomesticStandingOrderConsentResponse6DataInitiation supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Get supplementaryData
     *
     * @return supplementaryData
     */
    @Valid
    @Schema(name = "SupplementaryData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("SupplementaryData")
    public OBSupplementaryData1 getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticStandingOrderConsentResponse6DataInitiation obWriteDomesticStandingOrderConsentResponse6DataInitiation = (OBWriteDomesticStandingOrderConsentResponse6DataInitiation) o;
        return Objects.equals(this.frequency, obWriteDomesticStandingOrderConsentResponse6DataInitiation.frequency) &&
                Objects.equals(this.reference, obWriteDomesticStandingOrderConsentResponse6DataInitiation.reference) &&
                Objects.equals(this.numberOfPayments, obWriteDomesticStandingOrderConsentResponse6DataInitiation.numberOfPayments) &&
                Objects.equals(this.firstPaymentDateTime, obWriteDomesticStandingOrderConsentResponse6DataInitiation.firstPaymentDateTime) &&
                Objects.equals(this.recurringPaymentDateTime, obWriteDomesticStandingOrderConsentResponse6DataInitiation.recurringPaymentDateTime) &&
                Objects.equals(this.finalPaymentDateTime, obWriteDomesticStandingOrderConsentResponse6DataInitiation.finalPaymentDateTime) &&
                Objects.equals(this.firstPaymentAmount, obWriteDomesticStandingOrderConsentResponse6DataInitiation.firstPaymentAmount) &&
                Objects.equals(this.recurringPaymentAmount, obWriteDomesticStandingOrderConsentResponse6DataInitiation.recurringPaymentAmount) &&
                Objects.equals(this.finalPaymentAmount, obWriteDomesticStandingOrderConsentResponse6DataInitiation.finalPaymentAmount) &&
                Objects.equals(this.debtorAccount, obWriteDomesticStandingOrderConsentResponse6DataInitiation.debtorAccount) &&
                Objects.equals(this.creditorAccount, obWriteDomesticStandingOrderConsentResponse6DataInitiation.creditorAccount) &&
                Objects.equals(this.supplementaryData, obWriteDomesticStandingOrderConsentResponse6DataInitiation.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frequency, reference, numberOfPayments, firstPaymentDateTime, recurringPaymentDateTime, finalPaymentDateTime, firstPaymentAmount, recurringPaymentAmount, finalPaymentAmount, debtorAccount, creditorAccount, supplementaryData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticStandingOrderConsentResponse6DataInitiation {\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
        sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
        sb.append("    recurringPaymentDateTime: ").append(toIndentedString(recurringPaymentDateTime)).append("\n");
        sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
        sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
        sb.append("    recurringPaymentAmount: ").append(toIndentedString(recurringPaymentAmount)).append("\n");
        sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
        sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

