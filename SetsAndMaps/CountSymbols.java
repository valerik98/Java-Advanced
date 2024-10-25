package SetsAndMaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Character,Integer> symbols = new TreeMap<>();
        char[] input = bufferedReader.readLine().toCharArray();
        for (char c : input) {
            symbols.putIfAbsent(c,0);
            int updatedSymbols = symbols.get(c) + 1;
            symbols.put(c,updatedSymbols);
        }
        symbols.forEach((c,count) -> System.out.println(String.format("%c: %d time/s",c,count)));
    }
}
