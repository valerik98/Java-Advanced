package Matrix;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String[][] firstMatrix = new String[m][n];
        fillMatrix(m, firstMatrix, scanner);
        String[][] secondMatrix = new String[m][n];
        fillMatrix(m, secondMatrix, scanner);

        String[][] thirdMatrix = new String[m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                thirdMatrix[row][col] = "*";
            }
        }
        for (int row = 0; row < thirdMatrix.length; row++) {
            for (int col = 0; col < thirdMatrix[row].length; col++) {
                if (firstMatrix[row][col].equals(secondMatrix[row][col])){
                    thirdMatrix[row][col] = firstMatrix[row][col];
                }
            }
        }
        for (int row = 0; row < thirdMatrix.length; row++) {
            for (int col = 0; col < thirdMatrix[row].length; col++) {
                System.out.print(thirdMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int m, String[][] firstMatrix, Scanner scanner) {
        for (int row = 0; row < m; row++) {
            firstMatrix[row] = scanner.nextLine().split("\\s+");
        }
    }
}

