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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tier Band Details
 */
@ApiModel(description = "Tier Band Details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class OBLoanInterestTierBand1 {
    @JsonProperty("Identification")
    private String identification = null;

    @JsonProperty("TierValueMinimum")
    private BigDecimal tierValueMinimum = null;

    @JsonProperty("TierValueMaximum")
    private BigDecimal tierValueMaximum = null;

    @JsonProperty("TierValueMinTerm")
    private BigDecimal tierValueMinTerm = null;

    @JsonProperty("MinTermPeriod")
    private OBPeriod1Code minTermPeriod = null;

    @JsonProperty("TierValueMaxTerm")
    private BigDecimal tierValueMaxTerm = null;

    @JsonProperty("MaxTermPeriod")
    private OBPeriod1Code maxTermPeriod = null;

    @JsonProperty("FixedVariableInterestRateType")
    private OBInterestFixedVariableType1Code fixedVariableInterestRateType = null;

    @JsonProperty("RepAPR")
    private BigDecimal repAPR = null;

    @JsonProperty("LoanProviderInterestRateType")
    private OBInterestRateType1Code loanProviderInterestRateType = null;

    @JsonProperty("LoanProviderInterestRate")
    private BigDecimal loanProviderInterestRate = null;

    @JsonProperty("Notes")
    private List<String> notes = null;

    @JsonProperty("OtherLoanProviderInterestRateType")
    private OBOtherCodeType1 otherLoanProviderInterestRateType = null;

    @JsonProperty("LoanInterestFeesCharges")
    private List<OBLoanInterestFeesCharges1> loanInterestFeesCharges = null;

    public OBLoanInterestTierBand1 identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Tier Band for a SME Loan.
     *
     * @return identification
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a SME Loan.")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBLoanInterestTierBand1 tierValueMinimum(BigDecimal tierValueMinimum) {
        this.tierValueMinimum = tierValueMinimum;
        return this;
    }

    /**
     * Minimum loan value for which the loan interest tier applies.
     *
     * @return tierValueMinimum
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Minimum loan value for which the loan interest tier applies.")
    public BigDecimal getTierValueMinimum() {
        return tierValueMinimum;
    }

    public void setTierValueMinimum(BigDecimal tierValueMinimum) {
        this.tierValueMinimum = tierValueMinimum;
    }

    public OBLoanInterestTierBand1 tierValueMaximum(BigDecimal tierValueMaximum) {
        this.tierValueMaximum = tierValueMaximum;
        return this;
    }

    /**
     * Minimum loan value for which the loan interest tier applies.
     *
     * @return tierValueMaximum
     **/
    @Valid
    @ApiModelProperty(value = "Minimum loan value for which the loan interest tier applies.")
    public BigDecimal getTierValueMaximum() {
        return tierValueMaximum;
    }

    public void setTierValueMaximum(BigDecimal tierValueMaximum) {
        this.tierValueMaximum = tierValueMaximum;
    }

    public OBLoanInterestTierBand1 tierValueMinTerm(BigDecimal tierValueMinTerm) {
        this.tierValueMinTerm = tierValueMinTerm;
        return this;
    }

    /**
     * Minimum loan value for which the loan interest tier applies.
     *
     * @return tierValueMinTerm
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Minimum loan value for which the loan interest tier applies.")
    public BigDecimal getTierValueMinTerm() {
        return tierValueMinTerm;
    }

    public void setTierValueMinTerm(BigDecimal tierValueMinTerm) {
        this.tierValueMinTerm = tierValueMinTerm;
    }

    public OBLoanInterestTierBand1 minTermPeriod(OBPeriod1Code minTermPeriod) {
        this.minTermPeriod = minTermPeriod;
        return this;
    }

    /**
     * Get minTermPeriod
     *
     * @return minTermPeriod
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBPeriod1Code getMinTermPeriod() {
        return minTermPeriod;
    }

    public void setMinTermPeriod(OBPeriod1Code minTermPeriod) {
        this.minTermPeriod = minTermPeriod;
    }

    public OBLoanInterestTierBand1 tierValueMaxTerm(BigDecimal tierValueMaxTerm) {
        this.tierValueMaxTerm = tierValueMaxTerm;
        return this;
    }

    /**
     * Minimum loan value for which the loan interest tier applies.
     *
     * @return tierValueMaxTerm
     **/
    @Valid
    @ApiModelProperty(value = "Minimum loan value for which the loan interest tier applies.")
    public BigDecimal getTierValueMaxTerm() {
        return tierValueMaxTerm;
    }

    public void setTierValueMaxTerm(BigDecimal tierValueMaxTerm) {
        this.tierValueMaxTerm = tierValueMaxTerm;
    }

    public OBLoanInterestTierBand1 maxTermPeriod(OBPeriod1Code maxTermPeriod) {
        this.maxTermPeriod = maxTermPeriod;
        return this;
    }

    /**
     * Get maxTermPeriod
     *
     * @return maxTermPeriod
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBPeriod1Code getMaxTermPeriod() {
        return maxTermPeriod;
    }

    public void setMaxTermPeriod(OBPeriod1Code maxTermPeriod) {
        this.maxTermPeriod = maxTermPeriod;
    }

    public OBLoanInterestTierBand1 fixedVariableInterestRateType(OBInterestFixedVariableType1Code fixedVariableInterestRateType) {
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
        return this;
    }

    /**
     * Get fixedVariableInterestRateType
     *
     * @return fixedVariableInterestRateType
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBInterestFixedVariableType1Code getFixedVariableInterestRateType() {
        return fixedVariableInterestRateType;
    }

    public void setFixedVariableInterestRateType(OBInterestFixedVariableType1Code fixedVariableInterestRateType) {
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    }

    public OBLoanInterestTierBand1 repAPR(BigDecimal repAPR) {
        this.repAPR = repAPR;
        return this;
    }

    /**
     * Minimum loan value for which the loan interest tier applies.
     *
     * @return repAPR
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "Minimum loan value for which the loan interest tier applies.")
    public BigDecimal getRepAPR() {
        return repAPR;
    }

    public void setRepAPR(BigDecimal repAPR) {
        this.repAPR = repAPR;
    }

    public OBLoanInterestTierBand1 loanProviderInterestRateType(OBInterestRateType1Code loanProviderInterestRateType) {
        this.loanProviderInterestRateType = loanProviderInterestRateType;
        return this;
    }

    /**
     * Get loanProviderInterestRateType
     *
     * @return loanProviderInterestRateType
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBInterestRateType1Code getLoanProviderInterestRateType() {
        return loanProviderInterestRateType;
    }

    public void setLoanProviderInterestRateType(OBInterestRateType1Code loanProviderInterestRateType) {
        this.loanProviderInterestRateType = loanProviderInterestRateType;
    }

    public OBLoanInterestTierBand1 loanProviderInterestRate(BigDecimal loanProviderInterestRate) {
        this.loanProviderInterestRate = loanProviderInterestRate;
        return this;
    }

    /**
     * Minimum loan value for which the loan interest tier applies.
     *
     * @return loanProviderInterestRate
     **/
    @Valid
    @ApiModelProperty(value = "Minimum loan value for which the loan interest tier applies.")
    public BigDecimal getLoanProviderInterestRate() {
        return loanProviderInterestRate;
    }

    public void setLoanProviderInterestRate(BigDecimal loanProviderInterestRate) {
        this.loanProviderInterestRate = loanProviderInterestRate;
    }

    public OBLoanInterestTierBand1 notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBLoanInterestTierBand1 addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the Tier Band details
     *
     * @return notes
     **/
    @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band details")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public OBLoanInterestTierBand1 otherLoanProviderInterestRateType(OBOtherCodeType1 otherLoanProviderInterestRateType) {
        this.otherLoanProviderInterestRateType = otherLoanProviderInterestRateType;
        return this;
    }

    /**
     * Get otherLoanProviderInterestRateType
     *
     * @return otherLoanProviderInterestRateType
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBOtherCodeType1 getOtherLoanProviderInterestRateType() {
        return otherLoanProviderInterestRateType;
    }

    public void setOtherLoanProviderInterestRateType(OBOtherCodeType1 otherLoanProviderInterestRateType) {
        this.otherLoanProviderInterestRateType = otherLoanProviderInterestRateType;
    }

    public OBLoanInterestTierBand1 loanInterestFeesCharges(List<OBLoanInterestFeesCharges1> loanInterestFeesCharges) {
        this.loanInterestFeesCharges = loanInterestFeesCharges;
        return this;
    }

    public OBLoanInterestTierBand1 addLoanInterestFeesChargesItem(OBLoanInterestFeesCharges1 loanInterestFeesChargesItem) {
        if (this.loanInterestFeesCharges == null) {
            this.loanInterestFeesCharges = new ArrayList<OBLoanInterestFeesCharges1>();
        }
        this.loanInterestFeesCharges.add(loanInterestFeesChargesItem);
        return this;
    }

    /**
     * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
     *
     * @return loanInterestFeesCharges
     **/
    @Valid
    @ApiModelProperty(value = "Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits")
    public List<OBLoanInterestFeesCharges1> getLoanInterestFeesCharges() {
        return loanInterestFeesCharges;
    }

    public void setLoanInterestFeesCharges(List<OBLoanInterestFeesCharges1> loanInterestFeesCharges) {
        this.loanInterestFeesCharges = loanInterestFeesCharges;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBLoanInterestTierBand1 obLoanInterestTierBand1 = (OBLoanInterestTierBand1) o;
        return Objects.equals(this.identification, obLoanInterestTierBand1.identification) &&
                Objects.equals(this.tierValueMinimum, obLoanInterestTierBand1.tierValueMinimum) &&
                Objects.equals(this.tierValueMaximum, obLoanInterestTierBand1.tierValueMaximum) &&
                Objects.equals(this.tierValueMinTerm, obLoanInterestTierBand1.tierValueMinTerm) &&
                Objects.equals(this.minTermPeriod, obLoanInterestTierBand1.minTermPeriod) &&
                Objects.equals(this.tierValueMaxTerm, obLoanInterestTierBand1.tierValueMaxTerm) &&
                Objects.equals(this.maxTermPeriod, obLoanInterestTierBand1.maxTermPeriod) &&
                Objects.equals(this.fixedVariableInterestRateType, obLoanInterestTierBand1.fixedVariableInterestRateType) &&
                Objects.equals(this.repAPR, obLoanInterestTierBand1.repAPR) &&
                Objects.equals(this.loanProviderInterestRateType, obLoanInterestTierBand1.loanProviderInterestRateType) &&
                Objects.equals(this.loanProviderInterestRate, obLoanInterestTierBand1.loanProviderInterestRate) &&
                Objects.equals(this.notes, obLoanInterestTierBand1.notes) &&
                Objects.equals(this.otherLoanProviderInterestRateType, obLoanInterestTierBand1.otherLoanProviderInterestRateType) &&
                Objects.equals(this.loanInterestFeesCharges, obLoanInterestTierBand1.loanInterestFeesCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, tierValueMinimum, tierValueMaximum, tierValueMinTerm, minTermPeriod, tierValueMaxTerm, maxTermPeriod, fixedVariableInterestRateType, repAPR, loanProviderInterestRateType, loanProviderInterestRate, notes, otherLoanProviderInterestRateType, loanInterestFeesCharges);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBLoanInterestTierBand1 {\n");

        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    tierValueMinimum: ").append(toIndentedString(tierValueMinimum)).append("\n");
        sb.append("    tierValueMaximum: ").append(toIndentedString(tierValueMaximum)).append("\n");
        sb.append("    tierValueMinTerm: ").append(toIndentedString(tierValueMinTerm)).append("\n");
        sb.append("    minTermPeriod: ").append(toIndentedString(minTermPeriod)).append("\n");
        sb.append("    tierValueMaxTerm: ").append(toIndentedString(tierValueMaxTerm)).append("\n");
        sb.append("    maxTermPeriod: ").append(toIndentedString(maxTermPeriod)).append("\n");
        sb.append("    fixedVariableInterestRateType: ").append(toIndentedString(fixedVariableInterestRateType)).append("\n");
        sb.append("    repAPR: ").append(toIndentedString(repAPR)).append("\n");
        sb.append("    loanProviderInterestRateType: ").append(toIndentedString(loanProviderInterestRateType)).append("\n");
        sb.append("    loanProviderInterestRate: ").append(toIndentedString(loanProviderInterestRate)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherLoanProviderInterestRateType: ").append(toIndentedString(otherLoanProviderInterestRateType)).append("\n");
        sb.append("    loanInterestFeesCharges: ").append(toIndentedString(loanInterestFeesCharges)).append("\n");
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

