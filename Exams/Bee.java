package Exams;
//created by J.M.
import java.util.*;
public class Bee {
    static int beeRow, beeCol;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char[][] matrix = readMatrix(scan);
        int[] beeIndexes = findBeeIndexes(matrix);
        beeRow = beeIndexes[0];
        beeCol = beeIndexes[1];
        int neededFlowers = 0;
        String input;

        while (!"End".equals(input = scan.nextLine())) {
            matrix[beeRow][beeCol] = '.';
            switch (input) {
                case "right":
                    beeCol++;
                    while (indexesInBounds(matrix) && matrix[beeRow][beeCol] == 'O') {
                        matrix[beeRow][beeCol] = '.';
                        beeCol++;
                    }
                    break;
                case "left":
                    beeCol--;
                    while (indexesInBounds(matrix) && matrix[beeRow][beeCol] == 'O') {
                        matrix[beeRow][beeCol] = '.';
                        beeCol--;
                    }
                    break;
                case "down":
                    beeRow++;
                    while (indexesInBounds(matrix) && matrix[beeRow][beeCol] == 'O') {
                        matrix[beeRow][beeCol] = '.';
                        beeRow++;
                    }
                    break;
                case "up":
                    beeRow--;
                    while (indexesInBounds(matrix) && matrix[beeRow][beeCol] == 'O') {
                        matrix[beeRow][beeCol] = '.';
                        beeRow--;
                    }
                    break;
            }
            if (indexesInBounds(matrix)) {
                if (matrix[beeRow][beeCol] == 'f') {
                    neededFlowers++;
                }
            } else {
                System.out.println("The bee got lost!");
                break;
            }
            matrix[beeRow][beeCol] = 'B';
        }
        if (neededFlowers < 5) {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - neededFlowers);
        } else {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", neededFlowers);
        }
        printMatrix(matrix);
    }
    private static boolean indexesInBounds(char[][] matrix) {
        return (beeRow >= 0 && beeRow < matrix.length) && (beeCol >= 0 && beeCol < matrix[beeRow].length);
    }
    private static int[] findBeeIndexes(char[][] matrix) {
        int[] startBeeIndexes = new int[2];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'B') {
                    startBeeIndexes[0] = row;
                    startBeeIndexes[1] = col;
                }
            }
        }
        return startBeeIndexes;
    }
    private static char[][] readMatrix(Scanner scan) {
        int n = Integer.parseInt(scan.nextLine());
        char[][] matrix = new char[n][n];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scan.nextLine().replaceAll("\\s+", "").toCharArray();
        }
        return matrix;
    }
    private static void printMatrix(char[][] matrix) {
        Arrays.stream(matrix).map(row -> Arrays.toString(row).replaceAll("[\\[\\]]", "")
                .replaceAll(", ", "")).forEach(System.out::println);
    }
}
