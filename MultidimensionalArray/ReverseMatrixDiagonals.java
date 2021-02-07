package MultidimensionalArray;
//created by J.M.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReverseMatrixDiagonals {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] matrix = readMatrix(reader);
        int currentRow = matrix.length - 1;
        int currentColl = matrix[currentRow].length - 1;

        while (currentColl >= 0) {
            printDiagonals(currentColl,currentRow,matrix);
            if (currentColl == 0) {
                currentRow--;
                while (currentRow >= 0) {
                    printDiagonals(currentColl,currentRow,matrix);
                    currentRow--;
                }
            }
            currentColl--;
        }
    }

    private static void printDiagonals(int currentColl, int currentRow, int[][] matrix) {
        int increaseCol=0;
        for (int i = currentRow; i >=0 ; i--) {
            if ((currentColl + increaseCol < matrix[currentRow].length )){
                System.out.printf("%d ", matrix[i][currentColl + increaseCol]);
            }else{
                break;
            }
            increaseCol++;
        }
        System.out.println();
    }

    private static int[][] readMatrix(BufferedReader reader) throws IOException {
        int[] size = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[size[0]][size[1]];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
