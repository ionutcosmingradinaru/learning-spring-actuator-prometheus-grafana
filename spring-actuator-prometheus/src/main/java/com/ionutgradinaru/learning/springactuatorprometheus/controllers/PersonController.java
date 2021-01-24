package com.ionutgradinaru.learning.springactuatorprometheus.controllers;

import com.ionutgradinaru.learning.springactuatorprometheus.models.Person;
import com.ionutgradinaru.learning.springactuatorprometheus.servicies.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

  private final PersonService service;

  @Autowired
  public PersonController(PersonService service) {
    this.service = service;
  }

  @GetMapping
  public List<Person> getAll() {
    return service.getAll();
  }

  @GetMapping("/{id}")
  public Person getById(@PathVariable(name = "id") final Integer id) {
    return service.getById(id);
  }

  @PostMapping
  public Person save(@RequestBody Person person) {
    return service.save(person);
  }
}
