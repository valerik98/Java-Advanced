package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nm = readArray(scanner);
        int n = nm[0];
        int m = nm[1];
        int[][] firstMatrix = new int[n][m];

        for (int row = 0; row < n; row++) {
            firstMatrix[row] = readArray(scanner);
        }

        int[] jk = readArray(scanner);
        int j = jk[0];
        int k = jk[1];
        int[][] secondMatrix = new int[j][k];

        for (int row = 0; row < j; row++) {
            secondMatrix[row] = readArray(scanner);
        }
        if (firstMatrix.length!= secondMatrix.length){
            System.out.println("not equal");
            return;
        }else {
            for (int row = 0; row < firstMatrix.length; row++) {
                if (firstMatrix[row].length!=secondMatrix[row].length){
                    System.out.println("not equal");
                    return;
                }
                for (int col = 0; col < firstMatrix[row].length; col++) {
                    if (firstMatrix[row][col]!=secondMatrix[row][col]){
                        System.out.println("not equal");
                        return;
                    }
                }
            }
            System.out.println("equal");
        }
//        boolean areNotEqual = firstMatrix.length != secondMatrix.length;
//        if (!areNotEqual) { //ravni
//            for (int row = 0; row < firstMatrix.length; row++) {
//                int[] firstArr = firstMatrix[row];
//                int[] secondArr = secondMatrix[row];
//                areNotEqual = firstArr.length != secondArr.length;
//                if (!areNotEqual) {
//                    for (int col = 0; col < firstMatrix[col].length; col++) {
//                        if (firstArr[col] != secondArr[col]) {
//                            areNotEqual = true;
//                            break;
//                        }
//                    }
//                }
//                if (areNotEqual){
//                    break;
//                }
//
//            }
//        }

    }


    private static void printMatrix(int[] bestVector, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
