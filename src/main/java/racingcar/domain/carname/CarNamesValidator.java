package racingcar.domain.carname;

public interface CarNamesValidator {

    String ERROR_EMPTY_MESSAGE = "[ERROR] 공백은 입력할 수 없습니다.";

    void validate(String carNames) throws IllegalArgumentException;
}
