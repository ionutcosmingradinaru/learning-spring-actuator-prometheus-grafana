package com.ionutgradinaru.learning.springactuatorprometheus.servicies;

import com.ionutgradinaru.learning.springactuatorprometheus.models.Person;
import com.ionutgradinaru.learning.springactuatorprometheus.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

  private final PersonRepository repository;

  @Autowired
  public PersonService(PersonRepository repository) {
    this.repository = repository;
  }

  public List<Person> getAll() {
    return repository.findAll();
  }

  public Person getById(final Integer id) {
    return repository
        .getPersonById(id)
        .orElseThrow(() -> new RuntimeException("A person with the given id doesn't exist."));
  }

  public Person save(final Person person) {
    return repository.save(person);
  }
}
