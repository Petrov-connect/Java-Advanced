package MultidimensionalArray;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;

public class ParkingSystem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] size = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        boolean[][] parkingLot = new boolean[size[0]][size[1]];
        IntStream.range(0, parkingLot.length).forEach(i -> parkingLot[i][0] = true);
        String input;

        while (!"stop".equals(input=scan.nextLine())) {
            String[] inputData = input.split("\\s+");
            int entryRow = Integer.parseInt(inputData[0]),goToRow = Integer.parseInt(inputData[1]),goToCol = Integer.parseInt(inputData[2]);
            boolean foundFreePlace = false;
            int traveledDistance = 1;
            traveledDistance += Math.abs(goToRow - entryRow);
            if (!parkingLot[goToRow][goToCol]) {
                traveledDistance += goToCol;
                parkingLot[goToRow][goToCol] = true;
                foundFreePlace = true;
            } else {
                for (int i = 1; i < parkingLot[goToRow].length; i++) {
                    if (goToCol - i > 0 && !parkingLot[goToRow][goToCol - i]) {
                        parkingLot[goToRow][goToCol - i] = true;
                        foundFreePlace = true;
                        traveledDistance += goToCol - i;
                        break;
                    }
                    if (goToCol + i < parkingLot[goToRow].length && !parkingLot[goToRow][goToCol + i]) {
                        parkingLot[goToRow][goToCol + i] = true;
                        foundFreePlace = true;
                        traveledDistance += goToCol + i;
                        break;
                    }
                }
            }
            if (foundFreePlace) {
                System.out.println(traveledDistance);
            } else {
                System.out.printf("Row %d full%n", goToRow);
            }
        }
    }
}
