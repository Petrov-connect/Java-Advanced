package MultidimensionalArray;
//created by J.M.

import java.util.*;

public class FillTheMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] patterns = scan.nextLine().split(", ");
        int size = Integer.parseInt(patterns[0]);
        String fillPattern = patterns[1];

        int[][] matrix = fillMatrix(size, fillPattern);
        printMatrix(matrix);
    }

    private static int[][] fillMatrix(int n, String fillPattern) {
        int[][] matrix = new int[n][n];
        if ("A".equals(fillPattern)) {
            fillPatternA(matrix);
        } else if ("B".equals(fillPattern)) {
            fillPatternB(matrix);
        }
        return matrix;
    }

    private static void fillPatternB(int[][] matrix) {
        int number = 1;
        for (int row = 0; row < matrix.length; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < matrix[row].length; col++) {
                    matrix[col][row] = number++;
                }
            } else {
                for (int col = matrix[row].length - 1; col >= 0; col--) {
                    matrix[col][row] = number++;
                }
            }
        }
    }

    private static void fillPatternA(int[][] matrix) {
        int number = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[col][row] = number++;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%d ", element);
            }
            System.out.println();
        }
    }
}
