package MultidimensionalArray;
//created by J.M.

import java.util.*;

public class MaximalSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] matrix = readMatrix(scan);
        int maxSum = Integer.MIN_VALUE,maxRow = 0,maxCol = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int sum = subMatrixSum(matrix, row, col);
                if (sum > maxSum) {
                    maxSum = sum;
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        System.out.printf("Sum = %d%n", maxSum);
        printSubMatrix(matrix,maxRow,maxCol);

    }

    private static int subMatrixSum(int[][] matrix, int row, int col) {
        int sum = 0;
        for (int rows = row; rows < row + 3; rows++) {
            for (int cols = col; cols < col + 3; cols++) {
                sum += matrix[rows][cols];
            }
        }
        return sum;
    }

    private static int[][] readMatrix(Scanner scan) {
        int[] size = readArray(scan);
        int rows = size[0],cols = size[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scan);
        }
        return matrix;
    }

    private static int[] readArray(Scanner scan) {
        return Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    private static void printSubMatrix(int[][] matrix, int row, int col) {
        for (int rows = row; rows < row+ 3; rows++) {
            for (int cols = col; cols < col+ 3; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
