package ui;

import java.util.Scanner;

public class ConsoleInputHandler {
    private final Scanner scanner;

    public ConsoleInputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readCarName(int number) {
        System.out.println("Введите название машины №" + number + ":");

        while (true) {
            try {
                String name = scanner.nextLine().trim();
                if (!name.isEmpty())
                    return name;
                else
                    System.err.println("Название не может быть пустым");
            } catch (Exception e) {
                System.err.println("Ошибка ввода");
            }
        }
    }

    public int readCarSpeed(int number) {
        System.out.println("Введите скорость машины №" + number + " в км/ч, не более 250:");

        while (true) {
            try {
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.err.println("Скорость не может быть пустой");
                    continue;
                }
                int speed = Integer.parseInt(input);
                if (speed > 0 && speed <= 250) {
                    return speed;
                }
                System.err.println("Скорость должна быть от 1 до 250 км/ч");
            } catch (NumberFormatException e) {
                System.err.println("Неправильная скорость. Введите целое число от 1 до 250");
            }
        }
    }
}
