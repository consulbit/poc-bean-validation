package net.consulbit.validation.service;

import net.consulbit.validation.domain.Person;
import net.consulbit.validation.helper.DummyData;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Piero on 26/01/2017.
 */
public class PersonService {

    public List<Person> findAll() {
//        try {
            return DummyData.getPeople();
//        } catch (ConstraintViolationException e) {
//            ConstraintValidationHelper.print(e);
//            throw new RuntimeException();
//        }
    }

    public java.util.List<Person> getPeopleByFirstName(String firstName) {
        return DummyData.getPeople().stream()
                .filter(p -> p.getFirstName().equals(firstName))
                .collect(Collectors.toList());
    }

    public java.util.List<Person> getPeopleByLastName(String lastName) {
        return DummyData.getPeople().stream()
                .filter(p -> p.getFirstName().equals(lastName))
                .collect(Collectors.toList());
    }
}
