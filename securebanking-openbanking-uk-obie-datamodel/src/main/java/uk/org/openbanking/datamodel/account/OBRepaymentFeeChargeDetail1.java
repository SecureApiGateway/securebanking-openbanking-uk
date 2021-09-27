/**
 * Copyright © 2021 ForgeRock AS (obst@forgerock.com)
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
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details about specific fees/charges that are applied for repayment
 */
@ApiModel(description = "Details about specific fees/charges that are applied for repayment")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-23T11:27:41.089+01:00")
public class OBRepaymentFeeChargeDetail1 {
    @JsonProperty("FeeType")
    private OBFeeType1Code feeType = null;

    @JsonProperty("NegotiableIndicator")
    private Boolean negotiableIndicator = null;

    @JsonProperty("FeeAmount")
    private BigDecimal feeAmount = null;

    @JsonProperty("FeeRate")
    private BigDecimal feeRate = null;

    @JsonProperty("FeeRateType")
    private OBInterestRateType1Code feeRateType = null;

    @JsonProperty("ApplicationFrequency")
    private OBFeeFrequency1Code applicationFrequency = null;

    @JsonProperty("CalculationFrequency")
    private OBFeeFrequency1Code calculationFrequency = null;

    @JsonProperty("Notes")
    private List<String> notes = null;

    @JsonProperty("OtherFeeType")
    private OBOtherFeeChargeDetailType otherFeeType = null;

    @JsonProperty("OtherFeeRateType")
    private OBOtherCodeType1 otherFeeRateType = null;

    @JsonProperty("OtherApplicationFrequency")
    private OBOtherCodeType1 otherApplicationFrequency = null;

    @JsonProperty("OtherCalculationFrequency")
    private OBOtherCodeType1 otherCalculationFrequency = null;

    public OBRepaymentFeeChargeDetail1 feeType(OBFeeType1Code feeType) {
        this.feeType = feeType;
        return this;
    }

    /**
     * Get feeType
     *
     * @return feeType
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBFeeType1Code getFeeType() {
        return feeType;
    }

    public void setFeeType(OBFeeType1Code feeType) {
        this.feeType = feeType;
    }

    public OBRepaymentFeeChargeDetail1 negotiableIndicator(Boolean negotiableIndicator) {
        this.negotiableIndicator = negotiableIndicator;
        return this;
    }

    /**
     * Fee/charge which is usually negotiable rather than a fixed amount
     *
     * @return negotiableIndicator
     **/
    @ApiModelProperty(value = "Fee/charge which is usually negotiable rather than a fixed amount")
    public Boolean isNegotiableIndicator() {
        return negotiableIndicator;
    }

    public void setNegotiableIndicator(Boolean negotiableIndicator) {
        this.negotiableIndicator = negotiableIndicator;
    }

    public OBRepaymentFeeChargeDetail1 feeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    /**
     * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
     *
     * @return feeAmount
     **/
    @Valid
    @ApiModelProperty(value = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public OBRepaymentFeeChargeDetail1 feeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
        return this;
    }

    /**
     * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
     *
     * @return feeRate
     **/
    @Valid
    @ApiModelProperty(value = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)")
    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    public OBRepaymentFeeChargeDetail1 feeRateType(OBInterestRateType1Code feeRateType) {
        this.feeRateType = feeRateType;
        return this;
    }

    /**
     * Get feeRateType
     *
     * @return feeRateType
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBInterestRateType1Code getFeeRateType() {
        return feeRateType;
    }

    public void setFeeRateType(OBInterestRateType1Code feeRateType) {
        this.feeRateType = feeRateType;
    }

    public OBRepaymentFeeChargeDetail1 applicationFrequency(OBFeeFrequency1Code applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
        return this;
    }

    /**
     * Get applicationFrequency
     *
     * @return applicationFrequency
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBFeeFrequency1Code getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(OBFeeFrequency1Code applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public OBRepaymentFeeChargeDetail1 calculationFrequency(OBFeeFrequency1Code calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
        return this;
    }

    /**
     * Get calculationFrequency
     *
     * @return calculationFrequency
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBFeeFrequency1Code getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(OBFeeFrequency1Code calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    public OBRepaymentFeeChargeDetail1 notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBRepaymentFeeChargeDetail1 addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the fee/charge details.
     *
     * @return notes
     **/
    @ApiModelProperty(value = "Optional additional notes to supplement the fee/charge details.")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public OBRepaymentFeeChargeDetail1 otherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
        this.otherFeeType = otherFeeType;
        return this;
    }

    /**
     * Get otherFeeType
     *
     * @return otherFeeType
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBOtherFeeChargeDetailType getOtherFeeType() {
        return otherFeeType;
    }

    public void setOtherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
        this.otherFeeType = otherFeeType;
    }

    public OBRepaymentFeeChargeDetail1 otherFeeRateType(OBOtherCodeType1 otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
        return this;
    }

    /**
     * Get otherFeeRateType
     *
     * @return otherFeeRateType
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBOtherCodeType1 getOtherFeeRateType() {
        return otherFeeRateType;
    }

    public void setOtherFeeRateType(OBOtherCodeType1 otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
    }

    public OBRepaymentFeeChargeDetail1 otherApplicationFrequency(OBOtherCodeType1 otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
        return this;
    }

    /**
     * Get otherApplicationFrequency
     *
     * @return otherApplicationFrequency
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBOtherCodeType1 getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    public void setOtherApplicationFrequency(OBOtherCodeType1 otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    public OBRepaymentFeeChargeDetail1 otherCalculationFrequency(OBOtherCodeType1 otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
        return this;
    }

    /**
     * Get otherCalculationFrequency
     *
     * @return otherCalculationFrequency
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBOtherCodeType1 getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    public void setOtherCalculationFrequency(OBOtherCodeType1 otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBRepaymentFeeChargeDetail1 obRepaymentFeeChargeDetail1 = (OBRepaymentFeeChargeDetail1) o;
        return Objects.equals(this.feeType, obRepaymentFeeChargeDetail1.feeType) &&
                Objects.equals(this.negotiableIndicator, obRepaymentFeeChargeDetail1.negotiableIndicator) &&
                Objects.equals(this.feeAmount, obRepaymentFeeChargeDetail1.feeAmount) &&
                Objects.equals(this.feeRate, obRepaymentFeeChargeDetail1.feeRate) &&
                Objects.equals(this.feeRateType, obRepaymentFeeChargeDetail1.feeRateType) &&
                Objects.equals(this.applicationFrequency, obRepaymentFeeChargeDetail1.applicationFrequency) &&
                Objects.equals(this.calculationFrequency, obRepaymentFeeChargeDetail1.calculationFrequency) &&
                Objects.equals(this.notes, obRepaymentFeeChargeDetail1.notes) &&
                Objects.equals(this.otherFeeType, obRepaymentFeeChargeDetail1.otherFeeType) &&
                Objects.equals(this.otherFeeRateType, obRepaymentFeeChargeDetail1.otherFeeRateType) &&
                Objects.equals(this.otherApplicationFrequency, obRepaymentFeeChargeDetail1.otherApplicationFrequency) &&
                Objects.equals(this.otherCalculationFrequency, obRepaymentFeeChargeDetail1.otherCalculationFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, negotiableIndicator, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBRepaymentFeeChargeDetail1 {\n");

        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
        sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
        sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
        sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
        sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
        sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
        sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
        sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
        sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
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

