package racingcar.domain.carname;

public class EmptyValidator implements CarNamesValidator {

    @Override
    public void validate(String carNames) throws IllegalArgumentException {
        if ("".equals(carNames)) {
            throw new IllegalArgumentException(CarNamesValidator.ERROR_EMPTY_MESSAGE);
        }
    }
}
