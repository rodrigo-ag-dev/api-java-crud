package br.com.crud.crud.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.crud.models.CustomerModel;
import br.com.crud.crud.models.CustomerModelGet;
import br.com.crud.crud.repositories.CustomerRepository;
import br.com.crud.crud.repositories.CustomerRepositoryGet;

@RestController
@RequestMapping("api/customers")
public class CustomerController {
  @Autowired
  private CustomerRepository customerRepository;
  @Autowired
  private CustomerRepositoryGet customerRepositoryGet;

  @GetMapping("/{id}")
  public Optional<CustomerModelGet> get(@PathVariable Long id) {
    return customerRepositoryGet.findById(id);
  }

  @GetMapping("/name/{name}")
  public List<CustomerModelGet> getName(@PathVariable String name) {
    return customerRepositoryGet.findByName(name);
  }

  @GetMapping("/address/{address}")
  public List<CustomerModelGet> getAddress(@PathVariable String address) {
    return customerRepositoryGet.findByAddress(address);
  }

  @GetMapping("/list")
  public List<CustomerModelGet> list() {
    return customerRepositoryGet.findAll(Sort.by(Sort.Direction.ASC, "id"));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> delete(@PathVariable Long id) {
    Optional<CustomerModel> customer = customerRepository.findById(id);
    if (customer.isEmpty())
      return ResponseEntity.notFound().build();
    customerRepository.deleteById(id);
    return ResponseEntity.ok().build();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Optional<CustomerModelGet> post(@RequestBody CustomerModel customerModel) {
    CustomerModel customer = customerRepository.save(customerModel);
    return customerRepositoryGet.findById(customer.getId());
  }
}
