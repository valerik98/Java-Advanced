package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        TreeMap<String, LinkedHashMap<String,Double>> shops = new TreeMap<>();

        while (!input.equals("Revision")){
            //shop, product, price
            String shopName = input.split(", ")[0];
            String productName = input.split(", ")[1];
            double productPrice = Double.parseDouble(input.split(", ")[2]);

            LinkedHashMap<String,Double> products = new LinkedHashMap<>();

            if (shops.containsKey(shopName)){
                products = shops.get(shopName);
            }
            products.put(productName,productPrice);
            shops.put(shopName,products);

            input = scanner.nextLine();
        }

        for (String shopName : shops.keySet()) {
            System.out.println(shopName + "->");
            LinkedHashMap<String,Double> products = shops.get(shopName);
            for (String productName : products.keySet()) {
                System.out.printf("Product: %s, Price: %.1f\n", productName, products.get(productName));
            }
        }
        System.out.println();
    }
}
