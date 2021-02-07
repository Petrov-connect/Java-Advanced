package MultidimensionalArray;
//created by J.M.

import java.util.*;

public class TheMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char[][] matrix = readMatrix(scan);
        char charToFill = scan.nextLine().charAt(0);
        int[] startCoordinates = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        char startChar = matrix[startCoordinates[0]][startCoordinates[1]];
        matrix[startCoordinates[0]][startCoordinates[1]] = charToFill;

        fillMatrix(matrix, startCoordinates[0], startCoordinates[1], startChar, charToFill);
        printMatrix(matrix);
    }

    private static char[][] readMatrix(Scanner scan) {
        int[] size = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        char[][] matrix = new char[size[0]][size[1]];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scan.nextLine().replaceAll("\\s+", "").toCharArray();
        }
        return matrix;
    }

    private static void printMatrix(char[][] matrix) {
        Arrays.stream(matrix).map(row -> Arrays.toString(row).replaceAll("[\\[\\]]", "")
                .replaceAll(", ", "")).forEach(System.out::println);
    }

    private static void fillMatrix(char[][] matrix, int row, int col, char startChar, char fillChar) {
        if (row + 1 < matrix.length && matrix[row + 1][col] == startChar) {
            matrix[row + 1][col] = fillChar;
            fillMatrix(matrix, row + 1, col, startChar, fillChar);
        }
        if (row - 1 >= 0 && matrix[row - 1][col] == startChar) {
            matrix[row - 1][col] = fillChar;
            fillMatrix(matrix, row - 1, col, startChar, fillChar);
        }
        if (col + 1 < matrix[row].length && matrix[row][col + 1] == startChar) {
            matrix[row][col + 1] = fillChar;
            fillMatrix(matrix, row, col + 1, startChar, fillChar);
        }
        if (col - 1 >= 0 && matrix[row][col - 1] == startChar) {
            matrix[row][col - 1] = fillChar;
            fillMatrix(matrix, row, col - 1, startChar, fillChar);
        }
    }
}
