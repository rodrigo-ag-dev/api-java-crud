package br.com.crud.crud.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class CustomerBase {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  protected Long id;
  protected String name;
  protected String address;
}