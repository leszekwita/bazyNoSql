package pl.radzik.michal.bazynosql.mapper;

import org.springframework.stereotype.Component;
import pl.radzik.michal.bazynosql.domain.Person;
import pl.radzik.michal.bazynosql.domain.PersonDB;

@Component
public class PersonMapperImpl implements PersonMapper {

    public PersonDB toDao(Person person) {
        return PersonDB.builder()
                .id(person.getId())
                .firstName(person.getFirstName())
                .lastName(person.getLastName())
                .email(person.getEmail())
                .build();
    }
}
