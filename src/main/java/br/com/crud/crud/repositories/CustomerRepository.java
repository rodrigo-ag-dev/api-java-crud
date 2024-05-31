package br.com.crud.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crud.crud.models.CustomerModel;

public interface CustomerRepository extends JpaRepository<CustomerModel, Long> {
}