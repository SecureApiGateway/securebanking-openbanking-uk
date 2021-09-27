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
 * OpenAPI spec version: v3.1.7
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Overdraft fee type
 */
public enum OBOverdraftFeeType1Code {

    FBAO("FBAO"),

    FBAR("FBAR"),

    FBEB("FBEB"),

    FBIT("FBIT"),

    FBOR("FBOR"),

    FBOS("FBOS"),

    FBSC("FBSC"),

    FBTO("FBTO"),

    FBUB("FBUB"),

    FBUT("FBUT"),

    FTOT("FTOT"),

    FTUT("FTUT");

    private String value;

    OBOverdraftFeeType1Code(String value) {
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
    public static OBOverdraftFeeType1Code fromValue(String text) {
        for (OBOverdraftFeeType1Code b : OBOverdraftFeeType1Code.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}

