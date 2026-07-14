import model.Car;
import repository.RaceRepository;
import model.RaceState;
import service.RaceService;
import service.RaceServiceImpl;
import ui.ConsoleInputHandler;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RaceState raceState = new RaceState();
        RaceRepository raceRepository = new RaceRepository();
        Scanner scanner = new Scanner(System.in);
        ConsoleInputHandler input = new ConsoleInputHandler(scanner);
        RaceService raceService = new RaceServiceImpl(raceRepository, raceState);

        System.out.println("*** Добро пожаловать на 24-х часовую гонку! ***");
        System.out.println("Введите название и скорость трех машин.");

        for (int i = 1; i <= 3; i++) {
            Car car = new Car(input.readCarName(i), input.readCarSpeed(i));
            raceService.addCar(car);
        }

        scanner.close();

        System.out.println("Самая быстрая машина: " + raceService.getLeader());
    }
}