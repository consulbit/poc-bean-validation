package net.consulbit.validation.helper;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

/**
 * Created by Piero on 26/01/2017.
 */
public class ConstraintValidationHelper {

    public static void print(ConstraintViolationException validationException) {
        final StringBuilder validationError = new StringBuilder();
        for (ConstraintViolation violation : validationException.getConstraintViolations()) {
            validationError.append("\n### Invalid: " +
                    violation.getRootBeanClass().getSimpleName() + "." + violation.getPropertyPath());
            validationError.append("\n\tInvalid value: " + violation.getInvalidValue());
            validationError.append("\n\tMessage: " + violation.getMessage());
        }

        System.err.println(validationError);
    }
}
