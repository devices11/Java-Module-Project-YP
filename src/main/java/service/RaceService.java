package service;

import model.Car;


public interface RaceService {

    void addCar(Car car);

    String getLeader();
}
