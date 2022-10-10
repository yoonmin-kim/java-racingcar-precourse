package racingcar.domain.car;

import racingcar.domain.car.carname.CarName;
import racingcar.domain.car.move.Move;

public class Car {

    private CarName carName;
    private Move move;

    public Car(CarName carName, Move move) {
        this.carName = carName;
        this.move = move;
    }
}
