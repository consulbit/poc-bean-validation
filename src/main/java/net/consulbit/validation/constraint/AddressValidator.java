package net.consulbit.validation.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Piero on 26/01/2017.
 */
public class AddressValidator implements ConstraintValidator<Address, net.consulbit.validation.domain.Address> {

    @Override
    public void initialize(final Address address) {

    }

    @Override
    public boolean isValid(final net.consulbit.validation.domain.Address address, final ConstraintValidatorContext constraintValidatorContext) {
        if (address == null) {
            return true;
        }
        if (!address.getCountry().equals("Malta")) {
            return false;
        }
        return true;
    }
}
