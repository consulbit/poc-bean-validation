package net.consulbit.validation.domain;

import org.hibernate.validator.constraints.Email;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;

/**
 * Created by Piero on 26/01/2017.
 */
public class Person {

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private LocalDate dob;
    @Valid
    private Address address;
    @Email
    private String email;

    public Person(final String firstName, final String lastName, final LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Past
    public Instant getDob() {
        return dob.atStartOfDay().toInstant(ZoneOffset.UTC);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                ", email='" + email + '\'' +
                '}';
    }
}
