package com.application.userdept.controllers;

import com.application.userdept.entities.User;
import com.application.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/users")
public class UserController {
  @Autowired
  private UserRepository repository;
  @GetMapping
  public List<User> findAll(){
    List<User> result = repository.findAll();
    return result;
  }
  @GetMapping(value = "/{id}")
  public User findById(@PathVariable Long id){
    User result = repository.findById(id).get();
    return result;
  }

  @PostMapping
  public User insert(@RequestBody User user){
    User result = repository.save(user);
    return result;
  }
}
