package br.com.crud.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crud.crud.models.CityModel;

public interface CityRepository extends JpaRepository<CityModel, Long> {

}
