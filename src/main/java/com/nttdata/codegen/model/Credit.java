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
 * Credit
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-20T21:35:28.437065300-05:00[America/Bogota]")
public class Credit implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;

  private Integer customerId;

  private String typeAccount;

  private String descriptTypeAccount;

  private Double creditAmount;

  private Double existingAmount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate creditDate;

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

  private Double interestRate;

  /**
   * Frecuencia de pago (mensual, trimestral, anual).
   */
  public enum PaymentFrequencyEnum {
    MONTHLY("monthly"),
    
    QUARTERLY("quarterly"),
    
    ANNUALLY("annually");

    private String value;

    PaymentFrequencyEnum(String value) {
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
    public static PaymentFrequencyEnum fromValue(String value) {
      for (PaymentFrequencyEnum b : PaymentFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PaymentFrequencyEnum paymentFrequency;

  private Integer installmentCount;

  private Integer remainingInstallments;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate nextPaymentDate;

  /**
   * Estado del crédito (activo, cerrado, vencido).
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    CLOSED("closed"),
    
    OVERDUE("overdue");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  /**
   * Default constructor
   * @deprecated Use {@link Credit#Credit(Integer, String, String, Double, Double, LocalDate, TypeCustomerEnum, Double, PaymentFrequencyEnum, Integer, Integer, LocalDate, StatusEnum)}
   */
  @Deprecated
  public Credit() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Credit(Integer customerId, String typeAccount, String descriptTypeAccount, Double creditAmount, Double existingAmount, LocalDate creditDate, TypeCustomerEnum typeCustomer, Double interestRate, PaymentFrequencyEnum paymentFrequency, Integer installmentCount, Integer remainingInstallments, LocalDate nextPaymentDate, StatusEnum status) {
    this.customerId = customerId;
    this.typeAccount = typeAccount;
    this.descriptTypeAccount = descriptTypeAccount;
    this.creditAmount = creditAmount;
    this.existingAmount = existingAmount;
    this.creditDate = creditDate;
    this.typeCustomer = typeCustomer;
    this.interestRate = interestRate;
    this.paymentFrequency = paymentFrequency;
    this.installmentCount = installmentCount;
    this.remainingInstallments = remainingInstallments;
    this.nextPaymentDate = nextPaymentDate;
    this.status = status;
  }

  public Credit id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID único del crédito.
   * @return id
  */
  
  @Schema(name = "id", description = "ID único del crédito.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Credit customerId(Integer customerId) {
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

  public Credit typeAccount(String typeAccount) {
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

  public Credit descriptTypeAccount(String descriptTypeAccount) {
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

  public Credit creditAmount(Double creditAmount) {
    this.creditAmount = creditAmount;
    return this;
  }

  /**
   * Monto total del crédito.
   * @return creditAmount
  */
  @NotNull 
  @Schema(name = "creditAmount", description = "Monto total del crédito.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creditAmount")
  public Double getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(Double creditAmount) {
    this.creditAmount = creditAmount;
  }

  public Credit existingAmount(Double existingAmount) {
    this.existingAmount = existingAmount;
    return this;
  }

  /**
   * Monto actual del crédito.
   * @return existingAmount
  */
  @NotNull 
  @Schema(name = "existingAmount", description = "Monto actual del crédito.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("existingAmount")
  public Double getExistingAmount() {
    return existingAmount;
  }

  public void setExistingAmount(Double existingAmount) {
    this.existingAmount = existingAmount;
  }

  public Credit creditDate(LocalDate creditDate) {
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

  public Credit typeCustomer(TypeCustomerEnum typeCustomer) {
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

  public Credit interestRate(Double interestRate) {
    this.interestRate = interestRate;
    return this;
  }

  /**
   * Tasa de interés aplicada al crédito.
   * @return interestRate
  */
  @NotNull 
  @Schema(name = "interestRate", description = "Tasa de interés aplicada al crédito.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("interestRate")
  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  public Credit paymentFrequency(PaymentFrequencyEnum paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
    return this;
  }

  /**
   * Frecuencia de pago (mensual, trimestral, anual).
   * @return paymentFrequency
  */
  @NotNull 
  @Schema(name = "paymentFrequency", description = "Frecuencia de pago (mensual, trimestral, anual).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paymentFrequency")
  public PaymentFrequencyEnum getPaymentFrequency() {
    return paymentFrequency;
  }

  public void setPaymentFrequency(PaymentFrequencyEnum paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
  }

  public Credit installmentCount(Integer installmentCount) {
    this.installmentCount = installmentCount;
    return this;
  }

  /**
   * Número total de cuotas del crédito.
   * @return installmentCount
  */
  @NotNull 
  @Schema(name = "installmentCount", description = "Número total de cuotas del crédito.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("installmentCount")
  public Integer getInstallmentCount() {
    return installmentCount;
  }

  public void setInstallmentCount(Integer installmentCount) {
    this.installmentCount = installmentCount;
  }

  public Credit remainingInstallments(Integer remainingInstallments) {
    this.remainingInstallments = remainingInstallments;
    return this;
  }

  /**
   * Número de cuotas restantes.
   * @return remainingInstallments
  */
  @NotNull 
  @Schema(name = "remainingInstallments", description = "Número de cuotas restantes.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("remainingInstallments")
  public Integer getRemainingInstallments() {
    return remainingInstallments;
  }

  public void setRemainingInstallments(Integer remainingInstallments) {
    this.remainingInstallments = remainingInstallments;
  }

  public Credit nextPaymentDate(LocalDate nextPaymentDate) {
    this.nextPaymentDate = nextPaymentDate;
    return this;
  }

  /**
   * Próxima fecha de pago.
   * @return nextPaymentDate
  */
  @NotNull @Valid 
  @Schema(name = "nextPaymentDate", description = "Próxima fecha de pago.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nextPaymentDate")
  public LocalDate getNextPaymentDate() {
    return nextPaymentDate;
  }

  public void setNextPaymentDate(LocalDate nextPaymentDate) {
    this.nextPaymentDate = nextPaymentDate;
  }

  public Credit status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Estado del crédito (activo, cerrado, vencido).
   * @return status
  */
  @NotNull 
  @Schema(name = "status", description = "Estado del crédito (activo, cerrado, vencido).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credit credit = (Credit) o;
    return Objects.equals(this.id, credit.id) &&
        Objects.equals(this.customerId, credit.customerId) &&
        Objects.equals(this.typeAccount, credit.typeAccount) &&
        Objects.equals(this.descriptTypeAccount, credit.descriptTypeAccount) &&
        Objects.equals(this.creditAmount, credit.creditAmount) &&
        Objects.equals(this.existingAmount, credit.existingAmount) &&
        Objects.equals(this.creditDate, credit.creditDate) &&
        Objects.equals(this.typeCustomer, credit.typeCustomer) &&
        Objects.equals(this.interestRate, credit.interestRate) &&
        Objects.equals(this.paymentFrequency, credit.paymentFrequency) &&
        Objects.equals(this.installmentCount, credit.installmentCount) &&
        Objects.equals(this.remainingInstallments, credit.remainingInstallments) &&
        Objects.equals(this.nextPaymentDate, credit.nextPaymentDate) &&
        Objects.equals(this.status, credit.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, typeAccount, descriptTypeAccount, creditAmount, existingAmount, creditDate, typeCustomer, interestRate, paymentFrequency, installmentCount, remainingInstallments, nextPaymentDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    typeAccount: ").append(toIndentedString(typeAccount)).append("\n");
    sb.append("    descriptTypeAccount: ").append(toIndentedString(descriptTypeAccount)).append("\n");
    sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
    sb.append("    existingAmount: ").append(toIndentedString(existingAmount)).append("\n");
    sb.append("    creditDate: ").append(toIndentedString(creditDate)).append("\n");
    sb.append("    typeCustomer: ").append(toIndentedString(typeCustomer)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    paymentFrequency: ").append(toIndentedString(paymentFrequency)).append("\n");
    sb.append("    installmentCount: ").append(toIndentedString(installmentCount)).append("\n");
    sb.append("    remainingInstallments: ").append(toIndentedString(remainingInstallments)).append("\n");
    sb.append("    nextPaymentDate: ").append(toIndentedString(nextPaymentDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

