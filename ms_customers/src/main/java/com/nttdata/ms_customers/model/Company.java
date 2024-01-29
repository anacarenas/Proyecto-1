package com.nttdata.ms_customers.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.annotation.Id;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Company
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-23T20:04:37.520989500-05:00[America/Bogota]")
public class Company implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  private Long id;
  private String companyName;
  private Long ruc;
  private String email;
  private Integer telephone;
  @Valid
  private List<String> headlines = new ArrayList<>();
  @Valid
  private List<String> signatories = new ArrayList<>();

  /**
   * Tipo de perfil (estándar o premium).
   */
  public enum TypeProfileEnum {
    STARTUP,
    CORPORATE

  }

  private TypeProfileEnum typeProfile;

  /**
   * Default constructor
   * @deprecated Use {@link Company#Company(String, Long, String, Integer, List<String>, List<String>, TypeProfileEnum)}
   */
  @Deprecated
  public Company() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Company(String companyName, Long ruc, String email, Integer telephone, List<String> headlines, List<String> signatories, TypeProfileEnum typeProfile) {
    this.companyName = companyName;
    this.ruc = ruc;
    this.email = email;
    this.telephone = telephone;
    this.headlines = headlines;
    this.signatories = signatories;
    this.typeProfile = typeProfile;
  }

  public Company companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Nombre de la empresa.
   * @return companyName
  */
  @NotNull 
  @Schema(name = "companyName", description = "Nombre de la empresa.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("companyName")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Company ruc(Long ruc) {
    this.ruc = ruc;
    return this;
  }

  /**
   * Registro Único de Contribuyentes.
   * @return ruc
  */
  @NotNull 
  @Schema(name = "ruc", description = "Registro Único de Contribuyentes.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ruc")
  public Long getRuc() {
    return ruc;
  }

  public void setRuc(Long ruc) {
    this.ruc = ruc;
  }

  public Company email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Dirección de correo electrónico.
   * @return email
  */
  @NotNull @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$") @javax.validation.constraints.Email
  @Schema(name = "email", description = "Dirección de correo electrónico.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Company telephone(Integer telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * Número de teléfono.
   * @return telephone
  */
  @NotNull 
  @Schema(name = "telephone", description = "Número de teléfono.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("telephone")
  public Integer getTelephone() {
    return telephone;
  }

  public void setTelephone(Integer telephone) {
    this.telephone = telephone;
  }

  public Company headlines(List<String> headlines) {
    this.headlines = headlines;
    return this;
  }

  public Company addHeadlinesItem(String headlinesItem) {
    if (this.headlines == null) {
      this.headlines = new ArrayList<>();
    }
    this.headlines.add(headlinesItem);
    return this;
  }

  /**
   * Lista de titulares de la empresa.
   * @return headlines
  */
  @NotNull 
  @Schema(name = "headlines", description = "Lista de titulares de la empresa.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("headlines")
  public List<String> getHeadlines() {
    return headlines;
  }

  public void setHeadlines(List<String> headlines) {
    this.headlines = headlines;
  }

  public Company signatories(List<String> signatories) {
    this.signatories = signatories;
    return this;
  }

  public Company addSignatoriesItem(String signatoriesItem) {
    if (this.signatories == null) {
      this.signatories = new ArrayList<>();
    }
    this.signatories.add(signatoriesItem);
    return this;
  }

  /**
   * Lista de firmantes autorizados.
   * @return signatories
  */
  @NotNull 
  @Schema(name = "signatories", description = "Lista de firmantes autorizados.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("signatories")
  public List<String> getSignatories() {
    return signatories;
  }

  public void setSignatories(List<String> signatories) {
    this.signatories = signatories;
  }

  public Company typeProfile(TypeProfileEnum typeProfile) {
    this.typeProfile = typeProfile;
    return this;
  }

  /**
   * Tipo de perfil (estándar o premium).
   * @return typeProfile
  */
  @NotNull 
  @Schema(name = "typeProfile", description = "Tipo de perfil (estándar o premium).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("typeProfile")
  public TypeProfileEnum getTypeProfile() {
    return typeProfile;
  }

  public void setTypeProfile(TypeProfileEnum typeProfile) {
    this.typeProfile = typeProfile;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.companyName, company.companyName) &&
        Objects.equals(this.ruc, company.ruc) &&
        Objects.equals(this.email, company.email) &&
        Objects.equals(this.telephone, company.telephone) &&
        Objects.equals(this.headlines, company.headlines) &&
        Objects.equals(this.signatories, company.signatories) &&
        Objects.equals(this.typeProfile, company.typeProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, ruc, email, telephone, headlines, signatories, typeProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    ruc: ").append(toIndentedString(ruc)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    headlines: ").append(toIndentedString(headlines)).append("\n");
    sb.append("    signatories: ").append(toIndentedString(signatories)).append("\n");
    sb.append("    typeProfile: ").append(toIndentedString(typeProfile)).append("\n");
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

