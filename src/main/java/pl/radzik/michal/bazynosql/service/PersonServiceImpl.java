package pl.radzik.michal.bazynosql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.radzik.michal.bazynosql.domain.Person;
import pl.radzik.michal.bazynosql.domain.PersonDB;
import pl.radzik.michal.bazynosql.mapper.PersonMapper;
import pl.radzik.michal.bazynosql.repository.PersonRepository;


import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{


    private final PersonRepository personRepository;

    private final PersonMapper personMapper;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    public void save(List<Person> persons) {
        for (Person person : persons) {
            personRepository.save(personMapper.toDao(person));
        }
    }

    public List<PersonDB> getAllPersons() {
        return personRepository.findAll();
    }
}
