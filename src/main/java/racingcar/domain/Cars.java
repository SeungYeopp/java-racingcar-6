package racingcar.domain;

import racingcar.exception.CarNameException;

import java.util.List;
import static java.util.stream.Collectors.*;
import static racingcar.exception.CarNameException.validateCarNameDuplicate;

public class Cars {

    private final List<Car> cars;

    public Cars(List<String> names) {
        List<Car> cars = names.stream()
                .map(Car::new)
                .collect(toList());
        validateCarNameDuplicate(names);
        this.cars = cars;
    }

    public void move(NumberGenerator numberGenerator) {
        for (Car car : cars) {
            car.move(numberGenerator);
        }
    }








}