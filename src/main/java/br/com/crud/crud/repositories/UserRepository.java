package br.com.crud.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crud.crud.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}