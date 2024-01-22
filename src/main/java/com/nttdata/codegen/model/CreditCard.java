package com.nttdata.codegen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.nttdata.codegen.model.Transaction;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * CreditCard
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-20T21:35:28.437065300-05:00[America/Bogota]")
public class CreditCard implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;

  private Integer customerId;

  private String typeAccount;

  private String descriptTypeAccount;

  private Double creditAmount;

  private Double existingAmount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate creditDate;

  private String numberCard;

  /**
   * Tipo de cliente (individual o empresarial).
   */
  public enum TypeCustomerEnum {
    INDIVIDUAL("individual"),
    
    BUSINESS("business");

    private String value;

    TypeCustomerEnum(String value) {
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
    public static TypeCustomerEnum fromValue(String value) {
      for (TypeCustomerEnum b : TypeCustomerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeCustomerEnum typeCustomer;

  /**
   * Estado de la tarjeta (activo, inactivo, bloqueado).
   */
  public enum CardStatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive"),
    
    BLOCKED("blocked");

    private String value;

    CardStatusEnum(String value) {
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
    public static CardStatusEnum fromValue(String value) {
      for (CardStatusEnum b : CardStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CardStatusEnum cardStatus;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate expirationDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate issuedDate;

  @Valid
  private List<@Valid Transaction> transactions;

  /**
   * Default constructor
   * @deprecated Use {@link CreditCard#CreditCard(Integer, String, String, Double, Double, LocalDate, String, TypeCustomerEnum, LocalDate, LocalDate)}
   */
  @Deprecated
  public CreditCard() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreditCard(Integer customerId, String typeAccount, String descriptTypeAccount, Double creditAmount, Double existingAmount, LocalDate creditDate, String numberCard, TypeCustomerEnum typeCustomer, LocalDate expirationDate, LocalDate issuedDate) {
    this.customerId = customerId;
    this.typeAccount = typeAccount;
    this.descriptTypeAccount = descriptTypeAccount;
    this.creditAmount = creditAmount;
    this.existingAmount = existingAmount;
    this.creditDate = creditDate;
    this.numberCard = numberCard;
    this.typeCustomer = typeCustomer;
    this.expirationDate = expirationDate;
    this.issuedDate = issuedDate;
  }

  public CreditCard id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID único de la tarjeta de crédito.
   * @return id
  */
  
  @Schema(name = "id", description = "ID único de la tarjeta de crédito.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CreditCard customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * ID del cliente asociado.
   * @return customerId
  */
  @NotNull 
  @Schema(name = "customerId", description = "ID del cliente asociado.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customerId")
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public CreditCard typeAccount(String typeAccount) {
    this.typeAccount = typeAccount;
    return this;
  }

  /**
   * Tipo de cuenta asociada.
   * @return typeAccount
  */
  @NotNull 
  @Schema(name = "typeAccount", description = "Tipo de cuenta asociada.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeAccount")
  public String getTypeAccount() {
    return typeAccount;
  }

  public void setTypeAccount(String typeAccount) {
    this.typeAccount = typeAccount;
  }

  public CreditCard descriptTypeAccount(String descriptTypeAccount) {
    this.descriptTypeAccount = descriptTypeAccount;
    return this;
  }

  /**
   * Descripción del tipo de cuenta.
   * @return descriptTypeAccount
  */
  @NotNull 
  @Schema(name = "descriptTypeAccount", description = "Descripción del tipo de cuenta.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("descriptTypeAccount")
  public String getDescriptTypeAccount() {
    return descriptTypeAccount;
  }

  public void setDescriptTypeAccount(String descriptTypeAccount) {
    this.descriptTypeAccount = descriptTypeAccount;
  }

  public CreditCard creditAmount(Double creditAmount) {
    this.creditAmount = creditAmount;
    return this;
  }

  /**
   * Límite de crédito de la tarjeta.
   * @return creditAmount
  */
  @NotNull 
  @Schema(name = "creditAmount", description = "Límite de crédito de la tarjeta.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creditAmount")
  public Double getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(Double creditAmount) {
    this.creditAmount = creditAmount;
  }

  public CreditCard existingAmount(Double existingAmount) {
    this.existingAmount = existingAmount;
    return this;
  }

  /**
   * Monto actual utilizado en la tarjeta.
   * @return existingAmount
  */
  @NotNull 
  @Schema(name = "existingAmount", description = "Monto actual utilizado en la tarjeta.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("existingAmount")
  public Double getExistingAmount() {
    return existingAmount;
  }

  public void setExistingAmount(Double existingAmount) {
    this.existingAmount = existingAmount;
  }

  public CreditCard creditDate(LocalDate creditDate) {
    this.creditDate = creditDate;
    return this;
  }

  /**
   * Fecha de vencimiento del crédito.
   * @return creditDate
  */
  @NotNull @Valid 
  @Schema(name = "creditDate", description = "Fecha de vencimiento del crédito.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creditDate")
  public LocalDate getCreditDate() {
    return creditDate;
  }

  public void setCreditDate(LocalDate creditDate) {
    this.creditDate = creditDate;
  }

  public CreditCard numberCard(String numberCard) {
    this.numberCard = numberCard;
    return this;
  }

  /**
   * Número de tarjeta de crédito.
   * @return numberCard
  */
  @NotNull @Pattern(regexp = "^[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}$") 
  @Schema(name = "numberCard", description = "Número de tarjeta de crédito.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("numberCard")
  public String getNumberCard() {
    return numberCard;
  }

  public void setNumberCard(String numberCard) {
    this.numberCard = numberCard;
  }

  public CreditCard typeCustomer(TypeCustomerEnum typeCustomer) {
    this.typeCustomer = typeCustomer;
    return this;
  }

  /**
   * Tipo de cliente (individual o empresarial).
   * @return typeCustomer
  */
  @NotNull 
  @Schema(name = "typeCustomer", description = "Tipo de cliente (individual o empresarial).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeCustomer")
  public TypeCustomerEnum getTypeCustomer() {
    return typeCustomer;
  }

  public void setTypeCustomer(TypeCustomerEnum typeCustomer) {
    this.typeCustomer = typeCustomer;
  }

  public CreditCard cardStatus(CardStatusEnum cardStatus) {
    this.cardStatus = cardStatus;
    return this;
  }

  /**
   * Estado de la tarjeta (activo, inactivo, bloqueado).
   * @return cardStatus
  */
  
  @Schema(name = "cardStatus", description = "Estado de la tarjeta (activo, inactivo, bloqueado).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardStatus")
  public CardStatusEnum getCardStatus() {
    return cardStatus;
  }

  public void setCardStatus(CardStatusEnum cardStatus) {
    this.cardStatus = cardStatus;
  }

  public CreditCard expirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Fecha de caducidad de la tarjeta.
   * @return expirationDate
  */
  @NotNull @Valid 
  @Schema(name = "expirationDate", description = "Fecha de caducidad de la tarjeta.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expirationDate")
  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  public CreditCard issuedDate(LocalDate issuedDate) {
    this.issuedDate = issuedDate;
    return this;
  }

  /**
   * Fecha de emisión de la tarjeta.
   * @return issuedDate
  */
  @NotNull @Valid 
  @Schema(name = "issuedDate", description = "Fecha de emisión de la tarjeta.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issuedDate")
  public LocalDate getIssuedDate() {
    return issuedDate;
  }

  public void setIssuedDate(LocalDate issuedDate) {
    this.issuedDate = issuedDate;
  }

  public CreditCard transactions(List<@Valid Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public CreditCard addTransactionsItem(Transaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Lista de transacciones asociadas a la tarjeta de crédito.
   * @return transactions
  */
  @Valid 
  @Schema(name = "transactions", description = "Lista de transacciones asociadas a la tarjeta de crédito.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transactions")
  public List<@Valid Transaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<@Valid Transaction> transactions) {
    this.transactions = transactions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCard creditCard = (CreditCard) o;
    return Objects.equals(this.id, creditCard.id) &&
        Objects.equals(this.customerId, creditCard.customerId) &&
        Objects.equals(this.typeAccount, creditCard.typeAccount) &&
        Objects.equals(this.descriptTypeAccount, creditCard.descriptTypeAccount) &&
        Objects.equals(this.creditAmount, creditCard.creditAmount) &&
        Objects.equals(this.existingAmount, creditCard.existingAmount) &&
        Objects.equals(this.creditDate, creditCard.creditDate) &&
        Objects.equals(this.numberCard, creditCard.numberCard) &&
        Objects.equals(this.typeCustomer, creditCard.typeCustomer) &&
        Objects.equals(this.cardStatus, creditCard.cardStatus) &&
        Objects.equals(this.expirationDate, creditCard.expirationDate) &&
        Objects.equals(this.issuedDate, creditCard.issuedDate) &&
        Objects.equals(this.transactions, creditCard.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, typeAccount, descriptTypeAccount, creditAmount, existingAmount, creditDate, numberCard, typeCustomer, cardStatus, expirationDate, issuedDate, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCard {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    typeAccount: ").append(toIndentedString(typeAccount)).append("\n");
    sb.append("    descriptTypeAccount: ").append(toIndentedString(descriptTypeAccount)).append("\n");
    sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
    sb.append("    existingAmount: ").append(toIndentedString(existingAmount)).append("\n");
    sb.append("    creditDate: ").append(toIndentedString(creditDate)).append("\n");
    sb.append("    numberCard: ").append(toIndentedString(numberCard)).append("\n");
    sb.append("    typeCustomer: ").append(toIndentedString(typeCustomer)).append("\n");
    sb.append("    cardStatus: ").append(toIndentedString(cardStatus)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    issuedDate: ").append(toIndentedString(issuedDate)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

