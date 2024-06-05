package br.com.crud.crud.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "USERS")
public class UserModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonProperty(access = JsonProperty.Access.READ_ONLY)
  private Long id;
  private String name;
  private String email;
  private String password;
}
