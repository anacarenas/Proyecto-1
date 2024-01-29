package com.nttdata.ms_customers.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Person
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-23T20:04:37.520989500-05:00[America/Bogota]")
@Data
@Document("person")
public class Person implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  private Long id;
  private String name;
  private String lastName;
  private Integer dni;
  private String email;
  private Integer telephone;

  /**
   * Tipo de cliente (individual o empresarial).
   */
  public enum TypeCustomerEnum {
    PERSONAL,
    BUSINESS

  }

  private TypeCustomerEnum typeCustomer;

  /**
   * Tipo de perfil (estándar o premium).
   */
  public enum TypeProfileEnum {
    GOLD,
    PREMIUM,
    VIP

  }

  private TypeProfileEnum typeProfile;

  /**
   * Default constructor
   * @deprecated Use {@link Person#Person(String, String, Integer, String, Integer, TypeCustomerEnum, TypeProfileEnum)}
   */
  @Deprecated
  public Person() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Person(String name, String lastName, Integer dni, String email, Integer telephone, TypeCustomerEnum typeCustomer, TypeProfileEnum typeProfile) {
    this.name = name;
    this.lastName = lastName;
    this.dni = dni;
    this.email = email;
    this.telephone = telephone;
    this.typeCustomer = typeCustomer;
    this.typeProfile = typeProfile;
  }

  public Person name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre de la persona.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Nombre de la persona.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Apellido de la persona.
   * @return lastName
  */
  @NotNull 
  @Schema(name = "lastName", description = "Apellido de la persona.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Person dni(Integer dni) {
    this.dni = dni;
    return this;
  }

  /**
   * Número de identificación personal.
   * @return dni
  */
  @NotNull 
  @Schema(name = "dni", description = "Número de identificación personal.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dni")
  public Integer getDni() {
    return dni;
  }

  public void setDni(Integer dni) {
    this.dni = dni;
  }

  public Person email(String email) {
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

  public Person telephone(Integer telephone) {
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

  public Person typeCustomer(TypeCustomerEnum typeCustomer) {
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

  public Person typeProfile(TypeProfileEnum typeProfile) {
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
    Person person = (Person) o;
    return Objects.equals(this.name, person.name) &&
        Objects.equals(this.lastName, person.lastName) &&
        Objects.equals(this.dni, person.dni) &&
        Objects.equals(this.email, person.email) &&
        Objects.equals(this.telephone, person.telephone) &&
        Objects.equals(this.typeCustomer, person.typeCustomer) &&
        Objects.equals(this.typeProfile, person.typeProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lastName, dni, email, telephone, typeCustomer, typeProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dni: ").append(toIndentedString(dni)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    typeCustomer: ").append(toIndentedString(typeCustomer)).append("\n");
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

