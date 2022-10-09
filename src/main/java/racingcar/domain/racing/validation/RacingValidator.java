package racingcar.domain.racing.validation;

public interface RacingValidator {

    String ERROR_NUMBER_MESSAGE = "[ERROR] 시도할 횟수로 숫자를 입력해주세요.";

    void validate(String tryNo) throws IllegalArgumentException;
}
