package br.com.crud.crud.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.crud.crud.models.CustomerModelGet;

public interface CustomerRepositoryGet extends JpaRepository<CustomerModelGet, Long> {
  @Query(value = "select * from customers c where c.name ilike concat('%', ?1,'%')", nativeQuery = true)
  Optional<CustomerModelGet> findByName(String name);

  @Query(value = "select * from customers c where c.address ilike concat('%', ?1,'%')", nativeQuery = true)
  Optional<CustomerModelGet> findByAddress(String address);
}