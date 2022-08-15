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
 * Aggregated Event Polling API Specification
 * Swagger for Aggregated Event Polling API Specification
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.event;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * OBEventPollingResponse1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen")
public class OBEventPollingResponse1 {
    @JsonProperty("moreAvailable")
    private Boolean moreAvailable = null;

    @JsonProperty("sets")
    private Map<String, String> sets = new HashMap<String, String>();

    public OBEventPollingResponse1 moreAvailable(Boolean moreAvailable) {
        this.moreAvailable = moreAvailable;
        return this;
    }

    /**
     * A JSON boolean value that indicates if more unacknowledged event notifications are available to be returned.
     *
     * @return moreAvailable
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "A JSON boolean value that indicates if more unacknowledged event notifications are available to be returned.")
    public Boolean isMoreAvailable() {
        return moreAvailable;
    }

    public void setMoreAvailable(Boolean moreAvailable) {
        this.moreAvailable = moreAvailable;
    }

    public OBEventPollingResponse1 sets(Map<String, String> sets) {
        this.sets = sets;
        return this;
    }

    public OBEventPollingResponse1 putSetsItem(String key, String setsItem) {
        this.sets.put(key, setsItem);
        return this;
    }

    /**
     * A JSON object that contains zero or more nested JSON attributes. If there are no outstanding event notifications to be transmitted, the JSON object SHALL be empty.
     *
     * @return sets
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "A JSON object that contains zero or more nested JSON attributes. If there are no outstanding event notifications to be transmitted, the JSON object SHALL be empty.")
    public Map<String, String> getSets() {
        return sets;
    }

    public void setSets(Map<String, String> sets) {
        this.sets = sets;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventPollingResponse1 obEventPollingResponse1 = (OBEventPollingResponse1) o;
        return Objects.equals(this.moreAvailable, obEventPollingResponse1.moreAvailable) &&
                Objects.equals(this.sets, obEventPollingResponse1.sets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moreAvailable, sets);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventPollingResponse1 {\n");

        sb.append("    moreAvailable: ").append(toIndentedString(moreAvailable)).append("\n");
        sb.append("    sets: ").append(toIndentedString(sets)).append("\n");
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

