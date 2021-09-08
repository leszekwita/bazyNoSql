package pl.radzik.michal.bazynosql.service;

import pl.radzik.michal.bazynosql.domain.Person;
import pl.radzik.michal.bazynosql.domain.PersonDB;

import java.util.List;

public interface PersonService {

    void save(List<Person> persons);

    List<PersonDB> getAllPersons();
}
