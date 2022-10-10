package racingcar.domain.car.carname.validation;

import java.util.Collections;
import java.util.List;

public class DefaultCarNameValidator implements CarNameValidator {

    List<CarNameValidator> validators;

    public DefaultCarNameValidator() {
        this.validators = Collections.singletonList(new LengthValidator());
    }

    @Override
    public void validate(String carName) throws IllegalArgumentException {
        for (CarNameValidator validator : validators) {
            validator.validate(carName);
        }
    }
}
