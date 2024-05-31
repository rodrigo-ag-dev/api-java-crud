package br.com.crud.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.crud.models.CityModel;
import br.com.crud.crud.repositories.CityRepository;

@RestController
@RequestMapping("cities")
public class CityController {
  @Autowired
  private CityRepository cityRepository;

  @GetMapping
  public List<CityModel> get() {
    return cityRepository.findAll();
  }

  @PostMapping
  public CityModel post(@RequestBody CityModel cityModel) {
    var city = cityRepository.save(cityModel);
    return city;
  }
}