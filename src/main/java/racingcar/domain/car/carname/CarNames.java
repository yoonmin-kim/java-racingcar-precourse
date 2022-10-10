package racingcar.domain.car.carname;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.car.carname.validation.CarNameValidator;
import racingcar.domain.car.carname.validation.CarNamesValidator;

public class CarNames {

    private String carNames;
    private CarNamesValidator validator;

    public CarNames(String carNames, CarNamesValidator validator) {
        this.carNames = carNames;
        this.validator = validator;
        validator.validate(carNames);
    }

    public List<CarName> createCarNames(CarNameValidator carNameValidator) {
        List<CarName> createCarNames = new ArrayList<>();
        for (String carName : carNames.split(",")) {
            createCarNames.add(new CarName(carName, carNameValidator));
        }
        return createCarNames;
    }
}
