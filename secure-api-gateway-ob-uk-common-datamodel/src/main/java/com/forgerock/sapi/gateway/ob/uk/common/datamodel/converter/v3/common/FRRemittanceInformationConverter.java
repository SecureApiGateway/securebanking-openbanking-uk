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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.v3.common;

import static com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.ConversionUtils.convertListToSingleString;

import java.util.List;
import java.util.stream.Collectors;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.*;

import uk.org.openbanking.datamodel.v3.payment.OBWriteDomestic2DataInitiationRemittanceInformation;
import uk.org.openbanking.datamodel.v3.vrp.OBDomesticVRPInitiationRemittanceInformation;
import uk.org.openbanking.datamodel.v3.vrp.OBVRPRemittanceInformation;
import uk.org.openbanking.datamodel.v4.common.ExternalCreditorReferenceType1Code;
import uk.org.openbanking.datamodel.v4.common.ExternalDocumentType1Code;
import uk.org.openbanking.datamodel.v4.payment.OBReferredDocumentInformation;
import uk.org.openbanking.datamodel.v4.payment.OBRemittanceInformation2;
import uk.org.openbanking.datamodel.v4.payment.OBRemittanceInformationStructured;
import uk.org.openbanking.datamodel.v4.payment.OBRemittanceInformationStructuredCreditorReferenceInformation;

public class FRRemittanceInformationConverter {

    public static FRRemittanceInformation toFRRemittanceInformation(OBWriteDomestic2DataInitiationRemittanceInformation remittanceInformation) {
        return remittanceInformation == null ? null : FRRemittanceInformation.builder()
                .unstructured(List.of(remittanceInformation.getUnstructured()))
                .reference(remittanceInformation.getReference())
                .build();
    }

    public static FRRemittanceInformation toFRRemittanceInformation(OBRemittanceInformation2 remittanceInformation) {
        return remittanceInformation == null ? null : FRRemittanceInformation.builder()
                .structured(toFRRemittanceInformationStructured(remittanceInformation.getStructured()))
                .unstructured(remittanceInformation.getUnstructured())
                .build();
    }

    public static FRRemittanceInformation toFRRemittanceInformation(OBDomesticVRPInitiationRemittanceInformation remittanceInformation) {
        return remittanceInformation == null ? null : FRRemittanceInformation.builder()
                .unstructured(List.of(remittanceInformation.getUnstructured()))
                .reference(remittanceInformation.getReference())
                .build();
    }

    public static FRRemittanceInformation toFRRemittanceInformation(OBVRPRemittanceInformation remittanceInformation) {
        return remittanceInformation == null ? null : FRRemittanceInformation.builder()
                .unstructured(List.of(remittanceInformation.getUnstructured()))
                .reference(remittanceInformation.getReference())
                .build();
    }

    public static OBRemittanceInformation2 toOBRemittanceInformation2(FRRemittanceInformation remittanceInformation) {
        return remittanceInformation == null ? null : new OBRemittanceInformation2()
                .structured(toOBRemittanceInformationStructured(remittanceInformation.getStructured()))
                .unstructured(remittanceInformation.getUnstructured());
    }

    public static OBWriteDomestic2DataInitiationRemittanceInformation toOBWriteDomestic2DataInitiationRemittanceInformation(FRRemittanceInformation remittanceInformation) {
        return remittanceInformation == null ? null : new OBWriteDomestic2DataInitiationRemittanceInformation()
                .unstructured(convertListToSingleString(remittanceInformation.getUnstructured()))
                .reference(remittanceInformation.getReference());
    }

    public static OBVRPRemittanceInformation toOBVRPRemittanceInformation(FRRemittanceInformation remittanceInformation) {
        return remittanceInformation == null ? null : new OBVRPRemittanceInformation()
                .reference(remittanceInformation.getReference())
                .unstructured(convertListToSingleString(remittanceInformation.getUnstructured()));
    }

    public static OBDomesticVRPInitiationRemittanceInformation toOBDomesticVRPInitiationRemittanceInformation(
            FRRemittanceInformation remittanceInformation
    ) {
        return remittanceInformation == null ? null : new OBDomesticVRPInitiationRemittanceInformation()
                .reference(remittanceInformation.getReference())
                // Convert the unstructured field to a single element, in v3 only a single value is allowed whereas v4 permits a list
                .unstructured(convertListToSingleString(remittanceInformation.getUnstructured()));
    }

    public static List<FRRemittanceInformationStructured> toFRRemittanceInformationStructured(List<OBRemittanceInformationStructured> remittanceInformationStructured) {
        return remittanceInformationStructured == null ? null : remittanceInformationStructured.stream()
                .map(structured -> FRRemittanceInformationStructured.builder()
                        .referredDocumentInformation(toFRReferredDocumentInformation(structured.getReferredDocumentInformation()))
                        .creditorReferenceInformation(toFRRemittanceInformationStructuredCreditorReferenceInformation(structured.getCreditorReferenceInformation()))
                        .referredDocumentAmount(structured.getReferredDocumentAmount())
                        .invoicee(structured.getInvoicee())
                        .invoicer(structured.getInvoicer())
                        .taxRemittance(structured.getTaxRemittance())
                        .additionalRemittanceInformation(structured.getAdditionalRemittanceInformation())
                        .build()).collect(Collectors.toList());
    }

    public static List<FRReferredDocumentInformation> toFRReferredDocumentInformation(List<OBReferredDocumentInformation> referredDocumentInformation) {
        return referredDocumentInformation == null ? null : referredDocumentInformation.stream()
                .map(documentInformation -> FRReferredDocumentInformation.builder()
                        .code(FRExternalDocumentTypeCode.fromValue(documentInformation.getCode().getValue()))
                        .issuer(documentInformation.getIssuer())
                        .number(documentInformation.getNumber())
                        .relatedDate(documentInformation.getRelatedDate())
                        .lineDetails(documentInformation.getLineDetails())
                        .build()).collect(Collectors.toList());
    }

    public static List<OBRemittanceInformationStructured> toOBRemittanceInformationStructured(List<FRRemittanceInformationStructured> remittanceInformationStructured) {
        return remittanceInformationStructured == null ? null : remittanceInformationStructured.stream()
                .map(structured -> new OBRemittanceInformationStructured()
                        .referredDocumentInformation(toOBReferredDocumentInformation(structured.getReferredDocumentInformation()))
                        .referredDocumentAmount(structured.getReferredDocumentAmount())
                        .creditorReferenceInformation(toOBRemittanceInformationStructuredCreditorReferenceInformation(structured.getCreditorReferenceInformation()))
                        .invoicee(structured.getInvoicee())
                        .invoicer(structured.getInvoicer())
                        .taxRemittance(structured.getTaxRemittance())
                        .additionalRemittanceInformation(structured.getAdditionalRemittanceInformation())).collect(Collectors.toList());
    }

    public static List<OBReferredDocumentInformation> toOBReferredDocumentInformation(List<FRReferredDocumentInformation> referredDocumentInformation) {
        return referredDocumentInformation == null ? null : referredDocumentInformation.stream()
                .map(documentInformation -> new OBReferredDocumentInformation()
                        .code(ExternalDocumentType1Code.fromValue(documentInformation.getCode().getValue()))
                        .issuer(documentInformation.getIssuer())
                        .number(documentInformation.getNumber())
                        .relatedDate(documentInformation.getRelatedDate())
                        .lineDetails(documentInformation.getLineDetails())).collect(Collectors.toList());
    }

    public static FRRemittanceInformationStructuredCreditorReferenceInformation toFRRemittanceInformationStructuredCreditorReferenceInformation(OBRemittanceInformationStructuredCreditorReferenceInformation creditorReferenceInformation) {
        return creditorReferenceInformation == null ? null : FRRemittanceInformationStructuredCreditorReferenceInformation.builder()
                .code(FRExternalCreditorReferenceTypeCode.fromValue(creditorReferenceInformation.getCode().getValue()))
                .issuer(creditorReferenceInformation.getIssuer())
                .reference(creditorReferenceInformation.getReference())
                .build();
    }

    public static OBRemittanceInformationStructuredCreditorReferenceInformation toOBRemittanceInformationStructuredCreditorReferenceInformation(FRRemittanceInformationStructuredCreditorReferenceInformation creditorReferenceInformation) {
        return creditorReferenceInformation == null ? null : new OBRemittanceInformationStructuredCreditorReferenceInformation()
                .code(ExternalCreditorReferenceType1Code.fromValue(creditorReferenceInformation.getCode().getValue()))
                .issuer(creditorReferenceInformation.getIssuer())
                .reference(creditorReferenceInformation.getReference());
    }

}
