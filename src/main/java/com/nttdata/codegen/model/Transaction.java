package com.nttdata.codegen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * Transaction
 *
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-20T21:35:28.437065300-05:00[America/Bogota]")
public class Transaction implements Serializable {

  private static final long serialVersionUID = 1L;

  private String productType;

  private Long productId;

  private Long customerId;

  private String transactionType;

  private Float amount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate transactionDate;

  /**
   * Tipo de cliente asociado a la transacción.
   */
  public enum CustomerTypeEnum {
    INDIVIDUAL("individual"),
    
    BUSINESS("business");

    private String value;

    CustomerTypeEnum(String value) {
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
    public static CustomerTypeEnum fromValue(String value) {
      for (CustomerTypeEnum b : CustomerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CustomerTypeEnum customerType;

  private Float balance;

  /**
   * Default constructor
   * @deprecated Use {@link Transaction#Transaction(String, Long, Long, String, Float, LocalDate, CustomerTypeEnum, Float)}
   */
  @Deprecated
  public Transaction() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Transaction(String productType, Long productId, Long customerId, String transactionType, Float amount, LocalDate transactionDate, CustomerTypeEnum customerType, Float balance) {
    this.productType = productType;
    this.productId = productId;
    this.customerId = customerId;
    this.transactionType = transactionType;
    this.amount = amount;
    this.transactionDate = transactionDate;
    this.customerType = customerType;
    this.balance = balance;
  }

  public Transaction productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Tipo de producto asociado a la transacción.
   * @return productType
  */
  @NotNull 
  @Schema(name = "productType", description = "Tipo de producto asociado a la transacción.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("productType")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public Transaction productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * ID del producto asociado a la transacción.
   * @return productId
  */
  @NotNull 
  @Schema(name = "productId", description = "ID del producto asociado a la transacción.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("productId")
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public Transaction customerId(Long customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * ID del cliente asociado a la transacción.
   * @return customerId
  */
  @NotNull 
  @Schema(name = "customerId", description = "ID del cliente asociado a la transacción.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customerId")
  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public Transaction transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Tipo de transacción.
   * @return transactionType
  */
  @NotNull 
  @Schema(name = "transactionType", description = "Tipo de transacción.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transactionType")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public Transaction amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Monto de la transacción.
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", description = "Monto de la transacción.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public Transaction transactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  /**
   * Fecha de la transacción.
   * @return transactionDate
  */
  @NotNull @Valid 
  @Schema(name = "transactionDate", description = "Fecha de la transacción.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transactionDate")
  public LocalDate getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Transaction customerType(CustomerTypeEnum customerType) {
    this.customerType = customerType;
    return this;
  }

  /**
   * Tipo de cliente asociado a la transacción.
   * @return customerType
  */
  @NotNull 
  @Schema(name = "customerType", description = "Tipo de cliente asociado a la transacción.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customerType")
  public CustomerTypeEnum getCustomerType() {
    return customerType;
  }

  public void setCustomerType(CustomerTypeEnum customerType) {
    this.customerType = customerType;
  }

  public Transaction balance(Float balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Saldo después de la transacción.
   * @return balance
  */
  @NotNull 
  @Schema(name = "balance", description = "Saldo después de la transacción.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("balance")
  public Float getBalance() {
    return balance;
  }

  public void setBalance(Float balance) {
    this.balance = balance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction Transaction = (Transaction) o;
    return Objects.equals(this.productType, Transaction.productType) &&
        Objects.equals(this.productId, Transaction.productId) &&
        Objects.equals(this.customerId, Transaction.customerId) &&
        Objects.equals(this.transactionType, Transaction.transactionType) &&
        Objects.equals(this.amount, Transaction.amount) &&
        Objects.equals(this.transactionDate, Transaction.transactionDate) &&
        Objects.equals(this.customerType, Transaction.customerType) &&
        Objects.equals(this.balance, Transaction.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productType, productId, customerId, transactionType, amount, transactionDate, customerType, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

