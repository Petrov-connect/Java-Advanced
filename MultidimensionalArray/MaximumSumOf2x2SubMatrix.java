package MultidimensionalArray;
//created by J.M.

import java.util.*;

public class MaximumSumOf2x2SubMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] matrix = readMatrix(scan);
        int maxRow = 0, maxCol = 0, maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        System.out.printf("%d %d%n%d %d%n%d", matrix[maxRow][maxCol], matrix[maxRow][maxCol + 1],
                matrix[maxRow + 1][maxCol], matrix[maxRow + 1][maxCol + 1], maxSum);
    }

    private static int[][] readMatrix(Scanner scan) {
        int[] size = readArray(scan);
        int[][] matrix = new int[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            matrix[i] = readArray(scan);
        }
        return matrix;
    }

    private static int[] readArray(Scanner scan) {
        return Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
    }
}
