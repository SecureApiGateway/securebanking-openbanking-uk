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

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Set of elements to describe the card instrument used in the transaction.
 */

@Schema(name = "OBTransactionCardInstrument1", description = "Set of elements to describe the card instrument used in the transaction.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OBTransactionCardInstrument1 {

  /**
   * Name of the card scheme.
   */
  public enum CardSchemeNameEnum {
    AMERICANEXPRESS("AmericanExpress"),
    
    DINERS("Diners"),
    
    DISCOVER("Discover"),
    
    MASTERCARD("MasterCard"),
    
    VISA("VISA");

    private String value;

    CardSchemeNameEnum(String value) {
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
    public static CardSchemeNameEnum fromValue(String value) {
      for (CardSchemeNameEnum b : CardSchemeNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CardSchemeNameEnum cardSchemeName;

  /**
   * The card authorisation type.
   */
  public enum AuthorisationTypeEnum {
    CONSUMERDEVICE("ConsumerDevice"),
    
    CONTACTLESS("Contactless"),
    
    NONE("None"),
    
    PIN("PIN");

    private String value;

    AuthorisationTypeEnum(String value) {
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
    public static AuthorisationTypeEnum fromValue(String value) {
      for (AuthorisationTypeEnum b : AuthorisationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AuthorisationTypeEnum authorisationType;

  private String name;

  private String identification;

  public OBTransactionCardInstrument1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBTransactionCardInstrument1(CardSchemeNameEnum cardSchemeName) {
    this.cardSchemeName = cardSchemeName;
  }

  public OBTransactionCardInstrument1 cardSchemeName(CardSchemeNameEnum cardSchemeName) {
    this.cardSchemeName = cardSchemeName;
    return this;
  }

  /**
   * Name of the card scheme.
   * @return cardSchemeName
  */
  @NotNull 
  @Schema(name = "CardSchemeName", description = "Name of the card scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CardSchemeName")
  public CardSchemeNameEnum getCardSchemeName() {
    return cardSchemeName;
  }

  public void setCardSchemeName(CardSchemeNameEnum cardSchemeName) {
    this.cardSchemeName = cardSchemeName;
  }

  public OBTransactionCardInstrument1 authorisationType(AuthorisationTypeEnum authorisationType) {
    this.authorisationType = authorisationType;
    return this;
  }

  /**
   * The card authorisation type.
   * @return authorisationType
  */
  
  @Schema(name = "AuthorisationType", description = "The card authorisation type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AuthorisationType")
  public AuthorisationTypeEnum getAuthorisationType() {
    return authorisationType;
  }

  public void setAuthorisationType(AuthorisationTypeEnum authorisationType) {
    this.authorisationType = authorisationType;
  }

  public OBTransactionCardInstrument1 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the cardholder using the card instrument.
   * @return name
  */
  @Size(min = 1, max = 70) 
  @Schema(name = "Name", description = "Name of the cardholder using the card instrument.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBTransactionCardInstrument1 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Identification assigned by an institution to identify the card instrument used in the transaction. This identification is known by the account owner, and may be masked.
   * @return identification
  */
  @Size(min = 1, max = 34) 
  @Schema(name = "Identification", description = "Identification assigned by an institution to identify the card instrument used in the transaction. This identification is known by the account owner, and may be masked.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBTransactionCardInstrument1 obTransactionCardInstrument1 = (OBTransactionCardInstrument1) o;
    return Objects.equals(this.cardSchemeName, obTransactionCardInstrument1.cardSchemeName) &&
        Objects.equals(this.authorisationType, obTransactionCardInstrument1.authorisationType) &&
        Objects.equals(this.name, obTransactionCardInstrument1.name) &&
        Objects.equals(this.identification, obTransactionCardInstrument1.identification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardSchemeName, authorisationType, name, identification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransactionCardInstrument1 {\n");
    sb.append("    cardSchemeName: ").append(toIndentedString(cardSchemeName)).append("\n");
    sb.append("    authorisationType: ").append(toIndentedString(authorisationType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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

