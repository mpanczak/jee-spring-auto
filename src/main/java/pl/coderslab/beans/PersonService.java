package pl.coderslab.beans;

import org.springframework.stereotype.Component;

@Component
public class PersonService {
    PersonRepository personRepo = new PersonRepository();

    public PersonRepository getPersonRepo() {
        return personRepo;
    }
}
