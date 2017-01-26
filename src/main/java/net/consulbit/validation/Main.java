package net.consulbit.validation;

import net.consulbit.validation.domain.Person;
import net.consulbit.validation.service.PersonService;

import java.util.List;

/**
 * Created by Piero on 26/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        List<Person> all = personService.findAll();

//        for (Person p: all) {
//            System.out.println(p);
//        }
    }
}
