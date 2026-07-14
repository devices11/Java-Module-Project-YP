package service;

import model.Car;
import repository.RaceRepository;
import model.RaceState;

public class RaceServiceImpl implements RaceService{
    private final RaceRepository raceRepository;
    private final RaceState raceState;

    public RaceServiceImpl(RaceRepository raceRepository, RaceState raceState) {
        this.raceRepository = raceRepository;
        this.raceState = raceState;
    }

    @Override
    public void addCar(Car car){
        raceRepository.addCar(car);
        updateLeader(car);
    }

    @Override
    public String getLeader() {
        return raceState.getLeaderName();
    }

    private void updateLeader(Car car) {
        int distance = car.getSpeed() * raceState.getRaceDuration();
        if (distance > raceState.getLeaderDistance()) {
            raceState.setLeaderName(car.getName());
            raceState.setLeaderDistance(distance);
        }
    }
}
