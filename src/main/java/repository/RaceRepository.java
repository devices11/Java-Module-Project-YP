package repository;

import model.Car;

import java.util.ArrayList;

public class RaceRepository {
    private final ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car){
        cars.add(car);
    }
}
