package racingcar.domain.carname.validation;

public interface CarNameValidator {

    int CAR_NAME_LENGTH = 5;
    String ERROR_LENGTH_MESSAGE = "[ERROR] 자동차 이름의 길이는 " + CAR_NAME_LENGTH + "자리를 넘을 수 없습니다.";

    void validate(String carName) throws IllegalArgumentException;
}
