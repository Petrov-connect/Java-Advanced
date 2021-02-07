package Exams;
//created by J.M.

import java.util.*;

public class ReVolt {

    static char[][] matrix;
    static int[] currentPosition;
    static boolean isFinished;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sizeMatrix = Integer.parseInt(scan.nextLine());
        int countCommands = Integer.parseInt(scan.nextLine());
        matrix = readMatrix(scan, sizeMatrix);
        currentPosition = findIndexes(matrix);
        isFinished = false;

        while (countCommands-- > 0 && !isFinished) {
            matrix[currentPosition[0]][currentPosition[1]] = '-';
            int[] previousPosition = new int[]{currentPosition[0],currentPosition[1]};
            String command = scan.nextLine();
            checkMove(command);
            checkPosition(command,previousPosition);
        }

        System.out.println(isFinished ? "Player won!" : "Player lost!");
        printMatrix(matrix);

    }

    private static void checkPosition(String command,int[]previousPosition) {

        if (matrix[currentPosition[0]][currentPosition[1]] == 'F') {
            matrix[currentPosition[0]][currentPosition[1]] = 'f';
            isFinished = true;
        } else if (matrix[currentPosition[0]][currentPosition[1]] == 'B') {
            checkMove(command);
            checkPosition(command,previousPosition);
        } else if (matrix[currentPosition[0]][currentPosition[1]] == 'T') {
            currentPosition[0] = previousPosition[0];
            currentPosition[1] = previousPosition[1];
            matrix[currentPosition[0]][currentPosition[1]] = 'f';
        } else {
            matrix[currentPosition[0]][currentPosition[1]] = 'f';
        }
    }

    private static void checkMove(String command) {
        switch (command) {
            case "up":
                currentPosition[0]--;
                if (currentPosition[0] < 0) {
                    currentPosition[0] = matrix.length - 1;
                }
                break;
            case "down":
                currentPosition[0]++;
                if (currentPosition[0] > matrix.length - 1) {
                    currentPosition[0] = 0;
                }
                break;
            case "left":
                currentPosition[1]--;
                if (currentPosition[1] < 0) {
                    currentPosition[1] = matrix.length - 1;
                }
                break;
            case "right":
                currentPosition[1]++;
                if (currentPosition[1] > matrix.length - 1) {
                    currentPosition[1] = 0;
                }
                break;
        }
    }

    private static int[] findIndexes(char[][] matrix) {
        int[] indexes = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 'f') {
                    indexes[0] = i;
                    indexes[1] = j;
                }
            }
        }
        return indexes;
    }

    private static char[][] readMatrix(Scanner scan, int size) {
        char[][] matrix = new char[size][size];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scan.nextLine()
                    .replaceAll("\\s+", "").toCharArray();
        }
        return matrix;
    }

    private static void printMatrix(char[][] matrix) {
        Arrays.stream(matrix).map(row -> Arrays.toString(row).replaceAll("[\\[\\]]", "")
                .replaceAll(", ", "")).forEach(System.out::println);
    }
}
