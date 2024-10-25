package DefiningClass._01_Car;

import DefiningClass._01_Car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        List<Car> cars = new ArrayList<>();

        int n = Integer.parseInt (scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String brand = tokens[0];
            String model = tokens[1];
            int horsePowers = Integer.parseInt(tokens[2]);

            Car car = new Car();

            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePowers);

            cars.add(car);
        }

        cars.stream().forEach(car -> System.out.println(car.carInfo()));
    }
}
