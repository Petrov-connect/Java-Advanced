package Exams;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;

public class BookWorm {

    private static char[][] field;
    private static int playerRol;
    private static int playerCol;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scan.nextLine());
        readField(scan, Integer.parseInt(scan.nextLine()));
        findIndexes();
        String command;

        while (!"end".equals(command = scan.nextLine())) {
            setPosition('-');
            if ("up".equals(command)) {
                moveToRow(-1, input);
            } else if ("down".equals(command)) {
                moveToRow(1, input);
            } else if ("right".equals(command)) {
                moveToCol(1, input);
            } else if ("left".equals(command)) {
                moveToCol(-1, input);
            }
            setPosition('P');
        }
        System.out.println(input.toString());
        printField();
    }

    private static void moveToRow(int n, StringBuilder input) {
        if (isInBounds(playerRol + n)) {
            playerRol += n;
            chekPosition(input);
        } else {
            cutString(input);
        }
    }
    private static void moveToCol(int n, StringBuilder input) {
        if (isInBounds(playerCol + n)) {
            playerCol += n;
            chekPosition(input);
        } else {
            cutString(input);
        }
    }
    private static void setPosition(char c) {
        field[playerRol][playerCol] = c;
    }
    private static void cutString(StringBuilder input) {
        if (input.length() > 0) {
            input.deleteCharAt(input.length() - 1);
        }
    }
    private static void chekPosition(StringBuilder input) {
        if (field[playerRol][playerCol] != '-') {
            input.append(field[playerRol][playerCol]);
        }
    }
    private static boolean isInBounds(int index) {
        return index < field.length && index >= 0;
    }
    private static void printField() {
        Arrays.stream(field).map(row -> Arrays.toString(row).replaceAll("[\\[\\]]", "")
                .replaceAll(", ", "")).forEach(System.out::println);
    }
    private static void readField(Scanner scan, int n) {
        field = new char[n][n];
        IntStream.range(0, n).forEach(row -> field[row] = scan.nextLine().replaceAll("\\s+", "").toCharArray());
    }
    private static void findIndexes() {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field.length; col++) {
                if (field[row][col] == 'P') {
                    playerRol = row;
                    playerCol = col;
                }
            }
        }
    }
}
