/**
 * Copyright © 2020 ForgeRock AS (obst@forgerock.com)
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
package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBScheduledPayment3Basic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-19T10:04:10.581299+01:00[Europe/London]")

public class OBScheduledPayment3Basic {
    @JsonProperty("AccountId")
    private String accountId;

    @JsonProperty("ScheduledPaymentId")
    private String scheduledPaymentId;

    @JsonProperty("ScheduledPaymentDateTime")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private DateTime scheduledPaymentDateTime;

    @JsonProperty("ScheduledType")
    private OBExternalScheduleType1Code scheduledType;

    @JsonProperty("Reference")
    private String reference;

    @JsonProperty("DebtorReference")
    private String debtorReference;

    @JsonProperty("InstructedAmount")
    private OBActiveOrHistoricCurrencyAndAmount1 instructedAmount;

    public OBScheduledPayment3Basic accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
     *
     * @return accountId
     */
    @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
    @NotNull
    @Size(min = 1, max = 40)
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBScheduledPayment3Basic scheduledPaymentId(String scheduledPaymentId) {
        this.scheduledPaymentId = scheduledPaymentId;
        return this;
    }

    /**
     * A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.
     *
     * @return scheduledPaymentId
     */
    @ApiModelProperty(value = "A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.")
    @Size(min = 1, max = 40)
    public String getScheduledPaymentId() {
        return scheduledPaymentId;
    }

    public void setScheduledPaymentId(String scheduledPaymentId) {
        this.scheduledPaymentId = scheduledPaymentId;
    }

    public OBScheduledPayment3Basic scheduledPaymentDateTime(DateTime scheduledPaymentDateTime) {
        this.scheduledPaymentDateTime = scheduledPaymentDateTime;
        return this;
    }

    /**
     * The date on which the scheduled payment will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     *
     * @return scheduledPaymentDateTime
     */
    @ApiModelProperty(required = true, value = "The date on which the scheduled payment will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
    @NotNull
    @Valid
    public DateTime getScheduledPaymentDateTime() {
        return scheduledPaymentDateTime;
    }

    public void setScheduledPaymentDateTime(DateTime scheduledPaymentDateTime) {
        this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    }

    public OBScheduledPayment3Basic scheduledType(OBExternalScheduleType1Code scheduledType) {
        this.scheduledType = scheduledType;
        return this;
    }

    /**
     * Get scheduledType
     *
     * @return scheduledType
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public OBExternalScheduleType1Code getScheduledType() {
        return scheduledType;
    }

    public void setScheduledType(OBExternalScheduleType1Code scheduledType) {
        this.scheduledType = scheduledType;
    }

    public OBScheduledPayment3Basic reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
     *
     * @return reference
     */
    @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")
    @Size(min = 1, max = 35)
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBScheduledPayment3Basic debtorReference(String debtorReference) {
        this.debtorReference = debtorReference;
        return this;
    }

    /**
     * A reference value provided by the PSU to the PISP while setting up the scheduled payment.
     *
     * @return debtorReference
     */
    @ApiModelProperty(value = "A reference value provided by the PSU to the PISP while setting up the scheduled payment.")
    @Size(min = 1, max = 35)
    public String getDebtorReference() {
        return debtorReference;
    }

    public void setDebtorReference(String debtorReference) {
        this.debtorReference = debtorReference;
    }

    public OBScheduledPayment3Basic instructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
        this.instructedAmount = instructedAmount;
        return this;
    }

    /**
     * Get instructedAmount
     *
     * @return instructedAmount
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    @Valid
    public OBActiveOrHistoricCurrencyAndAmount1 getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBScheduledPayment3Basic obScheduledPayment3Basic = (OBScheduledPayment3Basic) o;
        return Objects.equals(this.accountId, obScheduledPayment3Basic.accountId) &&
                Objects.equals(this.scheduledPaymentId, obScheduledPayment3Basic.scheduledPaymentId) &&
                Objects.equals(this.scheduledPaymentDateTime, obScheduledPayment3Basic.scheduledPaymentDateTime) &&
                Objects.equals(this.scheduledType, obScheduledPayment3Basic.scheduledType) &&
                Objects.equals(this.reference, obScheduledPayment3Basic.reference) &&
                Objects.equals(this.debtorReference, obScheduledPayment3Basic.debtorReference) &&
                Objects.equals(this.instructedAmount, obScheduledPayment3Basic.instructedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, scheduledPaymentId, scheduledPaymentDateTime, scheduledType, reference, debtorReference, instructedAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBScheduledPayment3Basic {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    scheduledPaymentId: ").append(toIndentedString(scheduledPaymentId)).append("\n");
        sb.append("    scheduledPaymentDateTime: ").append(toIndentedString(scheduledPaymentDateTime)).append("\n");
        sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    debtorReference: ").append(toIndentedString(debtorReference)).append("\n");
        sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
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

