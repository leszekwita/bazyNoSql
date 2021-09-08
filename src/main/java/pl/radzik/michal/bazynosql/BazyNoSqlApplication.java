package pl.radzik.michal.bazynosql;

import com.opencsv.exceptions.CsvException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


@SpringBootApplication
public class BazyNoSqlApplication {


    public static void main(String[] args) throws IOException, CsvException {
        SpringApplication.run(BazyNoSqlApplication.class, args);
    }




}
