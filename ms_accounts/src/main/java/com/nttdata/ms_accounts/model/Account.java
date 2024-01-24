package com.nttdata.ms_accounts.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Account
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-23T08:30:55.149919600-05:00[America/Bogota]")
public class Account implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;

  private Long customerId;

  private String typeAccount;

  private String descriptTypeAccount;

  private Float amount;

  private Float maintance;

  @Valid
  private List<@Valid Transaction> transaction = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate operationDay;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateAccount;

  private String numberAccount;

  /**
   * Tipo de cliente asociado a la cuenta.
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
   * Default constructor
   * @deprecated Use {@link Account#Account(Long, String, String, Float, Float, List<@Valid Transaction>, LocalDate, LocalDate, String, TypeCustomerEnum)}
   */
  @Deprecated
  public Account() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Account(Long customerId, String typeAccount, String descriptTypeAccount, Float amount, Float maintance, List<@Valid Transaction> transaction, LocalDate operationDay, LocalDate dateAccount, String numberAccount, TypeCustomerEnum typeCustomer) {
    this.customerId = customerId;
    this.typeAccount = typeAccount;
    this.descriptTypeAccount = descriptTypeAccount;
    this.amount = amount;
    this.maintance = maintance;
    this.transaction = transaction;
    this.operationDay = operationDay;
    this.dateAccount = dateAccount;
    this.numberAccount = numberAccount;
    this.typeCustomer = typeCustomer;
  }

  public Account id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID único de la cuenta
   * @return id
  */
  
  @Schema(name = "id", description = "ID único de la cuenta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Account customerId(Long customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * ID del cliente asociado a la cuenta.
   * @return customerId
  */
  @NotNull 
  @Schema(name = "customerId", description = "ID del cliente asociado a la cuenta.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customerId")
  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public Account typeAccount(String typeAccount) {
    this.typeAccount = typeAccount;
    return this;
  }

  /**
   * Tipo de cuenta.
   * @return typeAccount
  */
  @NotNull 
  @Schema(name = "typeAccount", description = "Tipo de cuenta.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeAccount")
  public String getTypeAccount() {
    return typeAccount;
  }

  public void setTypeAccount(String typeAccount) {
    this.typeAccount = typeAccount;
  }

  public Account descriptTypeAccount(String descriptTypeAccount) {
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

  public Account amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Monto disponible en la cuenta.
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", description = "Monto disponible en la cuenta.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public Account maintance(Float maintance) {
    this.maintance = maintance;
    return this;
  }

  /**
   * Monto de mantenimiento de la cuenta.
   * @return maintance
  */
  @NotNull 
  @Schema(name = "maintance", description = "Monto de mantenimiento de la cuenta.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("maintance")
  public Float getMaintance() {
    return maintance;
  }

  public void setMaintance(Float maintance) {
    this.maintance = maintance;
  }

  public Account transaction(List<@Valid Transaction> transaction) {
    this.transaction = transaction;
    return this;
  }

  public Account addTransactionItem(Transaction transactionItem) {
    if (this.transaction == null) {
      this.transaction = new ArrayList<>();
    }
    this.transaction.add(transactionItem);
    return this;
  }

  /**
   * Lista de transacciones asociadas a la cuenta.
   * @return transaction
  */
  @NotNull @Valid 
  @Schema(name = "transaction", description = "Lista de transacciones asociadas a la cuenta.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transaction")
  public List<@Valid Transaction> getTransaction() {
    return transaction;
  }

  public void setTransaction(List<@Valid Transaction> transaction) {
    this.transaction = transaction;
  }

  public Account operationDay(LocalDate operationDay) {
    this.operationDay = operationDay;
    return this;
  }

  /**
   * Día de operación de la cuenta.
   * @return operationDay
  */
  @NotNull @Valid 
  @Schema(name = "operationDay", description = "Día de operación de la cuenta.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operationDay")
  public LocalDate getOperationDay() {
    return operationDay;
  }

  public void setOperationDay(LocalDate operationDay) {
    this.operationDay = operationDay;
  }

  public Account dateAccount(LocalDate dateAccount) {
    this.dateAccount = dateAccount;
    return this;
  }

  /**
   * Fecha de creación de la cuenta.
   * @return dateAccount
  */
  @NotNull @Valid 
  @Schema(name = "dateAccount", description = "Fecha de creación de la cuenta.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dateAccount")
  public LocalDate getDateAccount() {
    return dateAccount;
  }

  public void setDateAccount(LocalDate dateAccount) {
    this.dateAccount = dateAccount;
  }

  public Account numberAccount(String numberAccount) {
    this.numberAccount = numberAccount;
    return this;
  }

  /**
   * Número de cuenta.
   * @return numberAccount
  */
  @NotNull 
  @Schema(name = "numberAccount", description = "Número de cuenta.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("numberAccount")
  public String getNumberAccount() {
    return numberAccount;
  }

  public void setNumberAccount(String numberAccount) {
    this.numberAccount = numberAccount;
  }

  public Account typeCustomer(TypeCustomerEnum typeCustomer) {
    this.typeCustomer = typeCustomer;
    return this;
  }

  /**
   * Tipo de cliente asociado a la cuenta.
   * @return typeCustomer
  */
  @NotNull 
  @Schema(name = "typeCustomer", description = "Tipo de cliente asociado a la cuenta.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeCustomer")
  public TypeCustomerEnum getTypeCustomer() {
    return typeCustomer;
  }

  public void setTypeCustomer(TypeCustomerEnum typeCustomer) {
    this.typeCustomer = typeCustomer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.customerId, account.customerId) &&
        Objects.equals(this.typeAccount, account.typeAccount) &&
        Objects.equals(this.descriptTypeAccount, account.descriptTypeAccount) &&
        Objects.equals(this.amount, account.amount) &&
        Objects.equals(this.maintance, account.maintance) &&
        Objects.equals(this.transaction, account.transaction) &&
        Objects.equals(this.operationDay, account.operationDay) &&
        Objects.equals(this.dateAccount, account.dateAccount) &&
        Objects.equals(this.numberAccount, account.numberAccount) &&
        Objects.equals(this.typeCustomer, account.typeCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, typeAccount, descriptTypeAccount, amount, maintance, transaction, operationDay, dateAccount, numberAccount, typeCustomer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    typeAccount: ").append(toIndentedString(typeAccount)).append("\n");
    sb.append("    descriptTypeAccount: ").append(toIndentedString(descriptTypeAccount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    maintance: ").append(toIndentedString(maintance)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    operationDay: ").append(toIndentedString(operationDay)).append("\n");
    sb.append("    dateAccount: ").append(toIndentedString(dateAccount)).append("\n");
    sb.append("    numberAccount: ").append(toIndentedString(numberAccount)).append("\n");
    sb.append("    typeCustomer: ").append(toIndentedString(typeCustomer)).append("\n");
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

