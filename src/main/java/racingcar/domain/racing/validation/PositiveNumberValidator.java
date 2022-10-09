package racingcar.domain.racing.validation;

public class PositiveNumberValidator implements RacingValidator {

    @Override
    public void validate(String tryNo) throws IllegalArgumentException {
        if (Integer.parseInt(tryNo) < 1) {
            throw new IllegalArgumentException(ERROR_POSITIVE_NUMBER_MESSAGE);
        }
    }
}
