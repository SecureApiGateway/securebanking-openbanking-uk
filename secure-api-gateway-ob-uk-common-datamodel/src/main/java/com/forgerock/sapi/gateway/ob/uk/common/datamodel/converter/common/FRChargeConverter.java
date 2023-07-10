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
package com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.common;

import static java.util.stream.Collectors.*;

import java.util.List;

import com.forgerock.sapi.gateway.ob.uk.common.datamodel.common.FRCharge;
import com.forgerock.sapi.gateway.ob.uk.common.datamodel.converter.mapper.FRModelMapper;

import uk.org.openbanking.datamodel.payment.OBWriteDomesticConsentResponse5DataCharges;

public class FRChargeConverter {

    public static FRCharge toFRCharge(OBWriteDomesticConsentResponse5DataCharges obCharge) {
        return FRModelMapper.map(obCharge, FRCharge.class);
    }

    public static List<FRCharge> toFRCharge(List<OBWriteDomesticConsentResponse5DataCharges> obCharges) {
        if (obCharges == null) {
            return null;
        }
        return obCharges.stream().map(FRChargeConverter::toFRCharge).collect(toList());
    }

    public static OBWriteDomesticConsentResponse5DataCharges toOBWriteDomesticConsentResponse5DataCharges(FRCharge frCharge) {
        return FRModelMapper.map(frCharge, OBWriteDomesticConsentResponse5DataCharges.class);
    }

    public static List<OBWriteDomesticConsentResponse5DataCharges> toOBWriteDomesticConsentResponse5DataCharges(List<FRCharge> frCharges) {
        if (frCharges == null) {
            return null;
        }
        return frCharges.stream().map(FRChargeConverter::toOBWriteDomesticConsentResponse5DataCharges).collect(toList());
    }

}
