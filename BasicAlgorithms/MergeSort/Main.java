package BasicAlgorithms.MergeSort;
//created by J.M.

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        mergeSort(array);

    }

    private static void mergeSort(int[] array) {
        int halfIndex = array.length/2;
    }
}

