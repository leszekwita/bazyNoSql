package pl.radzik.michal.bazynosql.controller;

import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.radzik.michal.bazynosql.service.PersonService;
import pl.radzik.michal.bazynosql.service.PersonServiceImpl;
import pl.radzik.michal.bazynosql.domain.Person;
import pl.radzik.michal.bazynosql.utils.PersonReader;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    List<Person> persons;

    private final PersonService personService;


    @Autowired
    public PersonController(PersonServiceImpl personServiceImpl) throws IOException, CsvException {
        this.personService = personServiceImpl;
        persons =  PersonReader.readPerson();
    }

    @GetMapping("/record")
    public ResponseEntity record() {
        personService.save(persons);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/read")
    public ResponseEntity read() {
        personService.getAllPersons();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
