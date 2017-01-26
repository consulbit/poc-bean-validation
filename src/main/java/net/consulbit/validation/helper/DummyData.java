package net.consulbit.validation.helper;

import net.consulbit.validation.domain.Person;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Piero on 26/01/2017.
 */
public class DummyData {

    private static List<Person> people = new ArrayList<>();
    private static ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private static Validator validator = validatorFactory.getValidator();

    static {
        Person piero = new Person("Piero", "Cascio", LocalDate.of(1975, Month.JULY, 31));
//        piero.setEmail("wrongOne$test.com");
//        piero.setAddress(new Address("Something", "BKR 4019", "Birkirkara", "Malta"));
        people.add(piero);

        Person matthew = new Person("Matthew", "Cachia", LocalDate.of(2000, Month.JANUARY, 1));
        people.add(matthew);

        Person graziella = new Person("Graziella", "Ellul", LocalDate.of(2000, Month.DECEMBER, 26));
        people.add(graziella);

        Person joseph = new Person("Joseph", "Masini", LocalDate.of(2000, Month.JANUARY, 1));
        people.add(joseph);

        Person gordon = new Person("Gordon", "Farrugia", LocalDate.of(2000, Month.JANUARY, 1));
        people.add(gordon);

        Person jp = new Person("JP", "Attard", LocalDate.of(2000, Month.JANUARY, 1));
        people.add(jp);
    }

    public static List<Person> getPeople() {
        final StringBuilder validationError = new StringBuilder();
        for (Person p : people) {
            Set<ConstraintViolation<Person>> validationConstraints = validator.validate(p);
            if ((validationConstraints.size() > 0)) {
                for (ConstraintViolation violation : validationConstraints) {
                    validationError.append("\n### Invalid: " +
                            violation.getRootBeanClass().getSimpleName() + "." + violation.getPropertyPath());
                    validationError.append("\n\tInvalid value: " + violation.getInvalidValue());
                    validationError.append("\n\tMessage: " + violation.getMessage());
                }
//                throw new ConstraintViolationException("Validation Error!", validationConstraints);
            }
        }
        System.err.println(validationError);
        return people;
    }
}
