package SetsAndMaps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int rows = Integer.parseInt (scanner.nextLine());
        String input = "";
        LinkedHashMap<String,LinkedHashMap<String, List<String>>> continentData  = new LinkedHashMap<>();
        for (int row = 0; row < rows; row++) {
            input = scanner.nextLine();
            String continent = input.split(" ")[0];
            String country = input.split(" ")[1];
            String city = input.split(" ")[2];

            if (continentData.containsKey(continent)){
                LinkedHashMap<String,List<String>> countriesData = continentData.get(continent);
                if (countriesData.containsKey(country)){
                    List<String>cities = countriesData.get(country);
                    cities.add(city);
                    countriesData.put(country,cities);
                }else {
                    List<String>cities = new ArrayList<>();
                    cities.add(city);
                    countriesData.put(country,cities);
                }
                continentData.put(continent,countriesData);
            }else {
                LinkedHashMap<String,List<String>> countriesData = new LinkedHashMap<>();
                List<String> cities = new ArrayList<>();
                cities.add(city);
                countriesData.put(country,cities);
                continentData.put(continent,countriesData);
            }
        }
        for (String continentName : continentData.keySet()) {
            System.out.println(continentName + ":");
            LinkedHashMap<String,List<String>> countriesData = continentData.get(continentName);
            for (String countriesName : countriesData.keySet()) {
                System.out.print(countriesName + " -> ");
                System.out.println(String.join(", ", countriesData.get(countriesName)));
            }
        }
    }
}
