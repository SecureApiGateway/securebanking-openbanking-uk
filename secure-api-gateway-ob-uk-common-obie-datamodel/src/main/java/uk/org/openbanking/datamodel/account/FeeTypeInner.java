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
package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import jakarta.annotation.Generated;

/**
 * Overdraft fee type
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum FeeTypeInner {

    ARRANGEDOVERDRAFT("ArrangedOverdraft"),

    ANNUALREVIEW("AnnualReview"),

    EMERGENCYBORROWING("EmergencyBorrowing"),

    BORROWINGITEM("BorrowingItem"),

    OVERDRAFTRENEWAL("OverdraftRenewal"),

    OVERDRAFTSETUP("OverdraftSetup"),

    SURCHARGE("Surcharge"),

    TEMPOVERDRAFT("TempOverdraft"),

    UNAUTHORISEDBORROWING("UnauthorisedBorrowing"),

    UNAUTHORISEDPAIDTRANS("UnauthorisedPaidTrans"),

    OTHER("Other"),

    UNAUTHORISEDUNPAIDTRANS("UnauthorisedUnpaidTrans");

    private String value;

    FeeTypeInner(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static FeeTypeInner fromValue(String value) {
        for (FeeTypeInner b : FeeTypeInner.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

