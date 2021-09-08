package pl.radzik.michal.bazynosql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.radzik.michal.bazynosql.domain.PersonDB;

@Repository
public interface PersonRepository extends MongoRepository<PersonDB, String> {
}


