package MultidimensionalArray;
//created by J.M.

import java.util.*;

public class RadioactiveMutantVampireBunnies {

    private static boolean isAlive;
    private static int[] playerPosition;
    private static char[][] lairBoard;
    private static char[][] newLiarBoard;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        lairBoard = readMatrix(scan);
        playerPosition = foundPlayersStartIndexes(lairBoard);
        char[] moves = scan.nextLine().toCharArray();
        isAlive = true;
        boolean inTheLiarBoard = true;
        int currentMove = 0;

        while (isAlive && inTheLiarBoard) {
            char move = moves[currentMove];
            int currentPlayerRow = playerPosition[0];
            int currentPlayerCol = playerPosition[1];
            newLiarBoard = new char[lairBoard.length][lairBoard[0].length];
            lairBoard[playerPosition[0]][playerPosition[1]] = '.';
            newLiarBoard[playerPosition[0]][playerPosition[1]] = '.';
            if (move == 'U') {
                currentPlayerRow--;
                if (currentPlayerRow < 0) {
                    inTheLiarBoard = false;
                } else {
                    checkMatrixRow(currentPlayerRow, currentPlayerCol);
                }
            } else if (move == 'D') {
                currentPlayerRow++;
                if (currentPlayerRow >= lairBoard.length) {
                    inTheLiarBoard = false;
                } else {
                    checkMatrixRow(currentPlayerRow, currentPlayerCol);
                }
            } else if (move == 'L') {
                currentPlayerCol--;
                if (currentPlayerCol < 0) {
                    inTheLiarBoard = false;
                } else {
                    checkMatrixCol(currentPlayerRow, currentPlayerCol);
                }
            } else if (move == 'R') {
                currentPlayerCol++;
                if (currentPlayerCol >= lairBoard[0].length) {
                    inTheLiarBoard = false;
                } else {
                    checkMatrixCol(currentPlayerRow, currentPlayerCol);
                }
            }
            fillTheBunnies();
            currentMove++;
        }

        printMatrix(lairBoard);

        if (inTheLiarBoard) {
            System.out.printf("dead: %d %d", playerPosition[0], playerPosition[1]);
        } else {
            System.out.printf("won: %d %d", playerPosition[0], playerPosition[1]);
        }
    }

    private static void checkMatrixCol(int currentPlayerRow, int currentPlayerCol) {
        if (lairBoard[currentPlayerRow][currentPlayerCol] == 'B') {
            isAlive = false;
            playerPosition[1] = currentPlayerCol;
        } else {
            playerPosition[1] = currentPlayerCol;
            newLiarBoard[playerPosition[0]][playerPosition[1]] = 'P';
        }
    }

    private static void checkMatrixRow(int currentPlayerRow, int currentPlayerCol) {
        if (lairBoard[currentPlayerRow][currentPlayerCol] == 'B') {
            isAlive = false;
            playerPosition[0] = currentPlayerRow;
        } else {
            playerPosition[0] = currentPlayerRow;
            newLiarBoard[playerPosition[0]][playerPosition[1]] = 'P';
        }
    }

    private static char[][] readMatrix(Scanner scan) {
        int[] size = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        char[][] matrix = new char[size[0]][size[1]];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scan.nextLine().toCharArray();
        }
        return matrix;
    }

    private static void printMatrix(char[][] matrix) {
        Arrays.stream(matrix).map(row -> Arrays.toString(row).replaceAll("[\\[\\]]", "")
                .replaceAll(", ", "")).forEach(System.out::println);
    }

    private static int[] foundPlayersStartIndexes(char[][] lairBoard) {
        int[] playersStartIndexes = new int[2];
        for (int i = 0; i < lairBoard.length; i++) {
            for (int j = 0; j < lairBoard[0].length; j++) {
                if (lairBoard[i][j] == 'P') {
                    playersStartIndexes[0] = i;
                    playersStartIndexes[1] = j;
                }
            }
        }
        return playersStartIndexes;
    }

    private static void fillTheBunnies() {
        for (int i = 0; i < lairBoard.length; i++) {
            for (int j = 0; j < lairBoard[0].length; j++) {
                if (lairBoard[i][j] == 'B') {
                    newLiarBoard[i][j] = 'B';
                    if (i - 1 >= 0) {
                        if (newLiarBoard[i - 1][j] == 'P') {
                            isAlive = false;
                        }
                        newLiarBoard[i - 1][j] = 'B';
                    }
                    if (i + 1 < lairBoard.length) {
                        if (newLiarBoard[i + 1][j] == 'P') {
                            isAlive = false;
                        }
                        newLiarBoard[i + 1][j] = 'B';
                    }
                    if (j - 1 >= 0) {
                        if (newLiarBoard[i][j - 1] == 'P') {
                            isAlive = false;
                        }
                        newLiarBoard[i][j - 1] = 'B';
                    }
                    if (j + 1 < lairBoard[0].length) {
                        if (newLiarBoard[i][j + 1] == 'P') {
                            isAlive = false;
                        }
                        newLiarBoard[i][j + 1] = 'B';
                    }
                } else if (newLiarBoard[i][j] != 'P' && newLiarBoard[i][j] != 'B') {
                    newLiarBoard[i][j] = '.';
                }
            }
        }
        lairBoard = newLiarBoard;
    }
}