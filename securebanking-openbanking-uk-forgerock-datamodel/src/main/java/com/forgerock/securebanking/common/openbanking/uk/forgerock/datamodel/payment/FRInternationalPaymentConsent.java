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
package com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.payment;

import com.forgerock.securebanking.common.openbanking.uk.forgerock.datamodel.tpp.Tpp;
import lombok.Builder;
import lombok.Data;
import org.joda.time.DateTime;

@Data
@Builder
public class FRInternationalPaymentConsent implements FRPaymentConsent {

    private String id;
    private FRConsentStatusCode status;
    private String accountId;
    private String userId;
    private Tpp pisp;
    private String pispId;
    private String pispName;
    private FRInternationalDataInitiation initiation;
    private FRPaymentRisk risk;
    private DateTime created;
    private DateTime statusUpdate;
}
