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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.converter.payment;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.common.FRDataSCASupportData;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.common.FRDataSCASupportData.FRAppliedAuthenticationApproach;
import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.common.FRDataSCASupportData.FRRequestedSCAExemptionType;
import uk.org.openbanking.datamodel.payment.*;
import uk.org.openbanking.datamodel.payment.OBSCASupportData1.AppliedAuthenticationApproachEnum;
import uk.org.openbanking.datamodel.payment.OBSCASupportData1.RequestedSCAExemptionTypeEnum;

public class FRDataSCASupportDataConverter {

    // OB to FR
    public static FRDataSCASupportData toFRDataSCASupportData(OBWriteDomesticConsent3DataSCASupportData scASupportData) {
        return scASupportData == null ? null : FRDataSCASupportData.builder()
                .requestedSCAExemptionType(toFRRequestedSCAExemptionType(scASupportData.getRequestedSCAExemptionType()))
                .appliedAuthenticationApproach(toFRAppliedAuthenticationApproach(scASupportData.getAppliedAuthenticationApproach()))
                .referencePaymentOrderId(scASupportData.getReferencePaymentOrderId())
                .build();
    }

    public static FRDataSCASupportData toFRDataSCASupportData(OBWriteDomesticConsent4DataSCASupportData scASupportData) {
        return scASupportData == null ? null : FRDataSCASupportData.builder()
                .requestedSCAExemptionType(toFRRequestedSCAExemptionType(scASupportData.getRequestedSCAExemptionType()))
                .appliedAuthenticationApproach(toFRAppliedAuthenticationApproach(scASupportData.getAppliedAuthenticationApproach()))
                .referencePaymentOrderId(scASupportData.getReferencePaymentOrderId())
                .build();
    }

    public static FRDataSCASupportData toFRDataSCASupportData(OBSCASupportData1 scASupportData) {
        return scASupportData == null ? null : FRDataSCASupportData.builder()
                .requestedSCAExemptionType(toFRRequestedSCAExemptionType(scASupportData.getRequestedSCAExemptionType()))
                .appliedAuthenticationApproach(toFRAppliedAuthenticationApproach(scASupportData.getAppliedAuthenticationApproach()))
                .referencePaymentOrderId(scASupportData.getReferencePaymentOrderId())
                .build();
    }

    public static FRAppliedAuthenticationApproach toFRAppliedAuthenticationApproach(OBAppliedAuthenticationApproachEnum appliedAuthenticationApproach) {
        return appliedAuthenticationApproach == null ? null : FRAppliedAuthenticationApproach.valueOf(appliedAuthenticationApproach.name());
    }

    public static FRAppliedAuthenticationApproach toFRAppliedAuthenticationApproach(AppliedAuthenticationApproachEnum appliedAuthenticationApproach) {
        return appliedAuthenticationApproach == null ? null : FRAppliedAuthenticationApproach.fromValue(appliedAuthenticationApproach.getValue());
    }

    public static FRRequestedSCAExemptionType toFRRequestedSCAExemptionType(OBRequestedSCAExemptionTypeEnum requestedSCAExemptionType) {
        return requestedSCAExemptionType == null ? null : FRRequestedSCAExemptionType.valueOf(requestedSCAExemptionType.name());
    }

    public static FRRequestedSCAExemptionType toFRRequestedSCAExemptionType(RequestedSCAExemptionTypeEnum requestedSCAExemptionType) {
        return requestedSCAExemptionType == null ? null : FRRequestedSCAExemptionType.fromValue(requestedSCAExemptionType.getValue());
    }

    // FR to OB
    public static OBWriteDomesticConsent3DataSCASupportData toOBWriteDomesticConsent3DataSCASupportData(FRDataSCASupportData scASupportData) {
        return scASupportData == null ? null : new OBWriteDomesticConsent3DataSCASupportData()
                .requestedSCAExemptionType(toOBRequestedSCAExemptionTypeEnum(scASupportData.getRequestedSCAExemptionType()))
                .appliedAuthenticationApproach(toOBAppliedAuthenticationApproachEnum(scASupportData.getAppliedAuthenticationApproach()))
                .referencePaymentOrderId(scASupportData.getReferencePaymentOrderId());
    }

    public static OBWriteDomesticConsent4DataSCASupportData toOBWriteDomesticConsent4DataSCASupportData(FRDataSCASupportData scASupportData) {
        return scASupportData == null ? null : new OBWriteDomesticConsent4DataSCASupportData()
                .requestedSCAExemptionType(toOBRequestedSCAExemptionTypeEnum(scASupportData.getRequestedSCAExemptionType()))
                .appliedAuthenticationApproach(toOBAppliedAuthenticationApproachEnum(scASupportData.getAppliedAuthenticationApproach()))
                .referencePaymentOrderId(scASupportData.getReferencePaymentOrderId());
    }

    public static OBSCASupportData1 toOBSCASupportData1(FRDataSCASupportData scASupportData) {
        return scASupportData == null ? null : new OBSCASupportData1()
                .requestedSCAExemptionType(toRequestedSCAExemptionTypeEnum(scASupportData.getRequestedSCAExemptionType()))
                .appliedAuthenticationApproach(toAppliedAuthenticationApproachEnum(scASupportData.getAppliedAuthenticationApproach()))
                .referencePaymentOrderId(scASupportData.getReferencePaymentOrderId());
    }

    public static RequestedSCAExemptionTypeEnum toRequestedSCAExemptionTypeEnum(FRRequestedSCAExemptionType requestedSCAExemptionType) {
        return requestedSCAExemptionType == null ? null : RequestedSCAExemptionTypeEnum.fromValue(requestedSCAExemptionType.getValue());
    }

    public static OBRequestedSCAExemptionTypeEnum toOBRequestedSCAExemptionTypeEnum(FRRequestedSCAExemptionType requestedSCAExemptionType) {
        return requestedSCAExemptionType == null ? null : OBRequestedSCAExemptionTypeEnum.valueOf(requestedSCAExemptionType.name());
    }

    public static OBAppliedAuthenticationApproachEnum toOBAppliedAuthenticationApproachEnum(FRAppliedAuthenticationApproach appliedAuthenticationApproach) {
        return appliedAuthenticationApproach == null ? null : OBAppliedAuthenticationApproachEnum.valueOf(appliedAuthenticationApproach.name());
    }

    public static AppliedAuthenticationApproachEnum toAppliedAuthenticationApproachEnum(FRAppliedAuthenticationApproach appliedAuthenticationApproach) {
        return appliedAuthenticationApproach == null ? null : AppliedAuthenticationApproachEnum.fromValue(appliedAuthenticationApproach.getValue());
    }
}
