package MultidimensionalArray;
//created by J.M.

import java.util.*;

public class CompareMatrices {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] firstMatrix = readMatrix(scan);
        int[][] secondMatrix = readMatrix(scan);

        System.out.println(isEquals(firstMatrix, secondMatrix) ? "equal" : "not equal");
    }

    private static boolean isEquals(int[][] firstMatrix, int[][] secondMatrix) {

        if (firstMatrix.length != secondMatrix.length) {
            return false;
        } else {
            for (int row = 0; row < firstMatrix.length; row++) {
                if (firstMatrix[row].length != secondMatrix[row].length) {
                    return false;
                }
            }
            for (int row = 0; row < firstMatrix.length; row++) {

                int[] currentFirst = firstMatrix[row];
                int[] currentSecond = secondMatrix[row];
                for (int col = 0; col < currentFirst.length; col++) {
                    if (currentFirst[col] != currentSecond[col]) {
                         return false;

                    }
                }
            }
        }
        return true;
    }

    private static int[][] readMatrix(Scanner scan) {
        int[] size = readArray(scan);
        int rows = size[0],cols = size[1];
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            matrix[i] = readArray(scan);
        }
        return matrix;
    }

    private static int[] readArray(Scanner scan) {
        return Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
