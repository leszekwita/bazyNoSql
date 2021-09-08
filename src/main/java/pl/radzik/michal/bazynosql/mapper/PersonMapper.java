package pl.radzik.michal.bazynosql.mapper;

import pl.radzik.michal.bazynosql.domain.Person;
import pl.radzik.michal.bazynosql.domain.PersonDB;

public interface PersonMapper {
    PersonDB toDao(Person person);
}
