package br.com.crud.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.crud.crud.models.UserModel;
import br.com.crud.crud.repositories.UserRepository;

@RestController
@RequestMapping("users")
public class UserController {
  @Autowired
  private UserRepository userRepository;

  @GetMapping
  public List<UserModel> get() {
    return userRepository.findAll();
  }

  @PostMapping
  public UserModel post(@RequestBody UserModel userModel) {
    var user = userRepository.save(userModel);
    return user;
  }

}
