package com.ionutgradinaru.learning.springactuatorprometheus.repositories;

import com.ionutgradinaru.learning.springactuatorprometheus.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

  Optional<Person> getPersonById(final Integer id);
}
