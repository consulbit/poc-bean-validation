package net.consulbit.validation.constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Piero on 26/01/2017.
 */
@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Constraint(validatedBy = AddressValidator.class)
public @interface Address {

    String message() default "The country MUST be Malta because all of us, love it ;)";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
