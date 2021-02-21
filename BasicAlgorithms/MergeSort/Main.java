package BasicAlgorithms.MergeSort;
//created by J.M.

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] array = mergeSort(Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray());
        Arrays.stream(array).forEach(i -> System.out.printf("%d ", i));
    }

    private static int[] mergeSort(int[] array) {

        if (array.length == 1) {
            return array;
        }
        int halfIndex = array.length / 2;

        int[] firstPartition = Arrays.copyOfRange(array, 0, halfIndex);
        int[] secondPartition = Arrays.copyOfRange(array, halfIndex, array.length);

        firstPartition = mergeSort(firstPartition);
        secondPartition = mergeSort(secondPartition);

        return mergeTwoSortedArrays(firstPartition, secondPartition);
    }

    private static int[] mergeTwoSortedArrays(int[] firstPartition, int[] secondPartition) {

        int[] merged = new int[firstPartition.length + secondPartition.length];
        int firstIndex = 0 , secondIndex = 0;

        while (firstIndex < firstPartition.length && secondIndex < secondPartition.length) {
            if (firstPartition[firstIndex] < secondPartition[secondIndex]) {
                merged[firstIndex + secondIndex] = firstPartition[firstIndex];
                firstIndex++;
            } else {
                merged[firstIndex + secondIndex] = secondPartition[secondIndex];
                secondIndex++;
            }
        }
        while (firstIndex < firstPartition.length) {
            merged[firstIndex + secondIndex] = firstPartition[firstIndex];
            firstIndex++;
        }
        while (secondIndex < secondPartition.length) {
            merged[firstIndex + secondIndex] = secondPartition[secondIndex];
            secondIndex++;
        }
        return merged;
    }
}

