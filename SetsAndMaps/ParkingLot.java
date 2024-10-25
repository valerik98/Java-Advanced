package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();

        while(!input.equals("END")){
            String command = input.split(", ")[0];
            String carNumber = input.split(", ")[1];
            if (command.equals("IN")){
                parkingLot.add(carNumber);
            } else if (command.equals("OUT")) {
                parkingLot.remove(carNumber);
            }
            input = scanner.nextLine();
        }
        if (parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }
        parkingLot.forEach(System.out::println);

    }
}
