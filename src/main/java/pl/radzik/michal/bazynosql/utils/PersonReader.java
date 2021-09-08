package pl.radzik.michal.bazynosql.utils;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;
import pl.radzik.michal.bazynosql.domain.Person;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class PersonReader {

    public static List<Person> readPerson () throws IOException, CsvException {

        String fileName = "C:\\Users\\Michal\\IdeaProjects\\xxx\\bazyNoSql\\src\\main\\java\\pl\\radzik\\michal\\bazynosql\\person.csv";

        List<Person> persons = new CsvToBeanBuilder(new FileReader(fileName))
                .withType(Person.class)
                .build()
                .parse();
        return persons;
    }
}
