package BasicAlgorithms.Quicksort;//created by J.M.

import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        sort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array).replaceAll("[\\[\\],]", ""));
    }
    //routine to sort the array partitions recursively
    static void sort(int[] subArray, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            //partition the array around pi=>partitioning index and return pi
            int pi = partition(subArray, startIndex, endIndex);
            // sort each partition recursively
            sort(subArray, startIndex, pi - 1);
            sort(subArray, pi + 1, endIndex);
        }
    }
    //selects last element as pivot, pi using which array is partitioned.
    static int partition(int[] subArray, int startIndex, int endIndex) {
        int pi = subArray[endIndex];
        int i = (startIndex - 1); // smaller element index
        for (int j = startIndex; j < endIndex; j++) {
            // check if current element is less than or equal to pi
            if (subArray[j] <= pi) {
                i++;
                // swap intArray[i] and intArray[j]
                int temp = subArray[i];
                subArray[i] = subArray[j];
                subArray[j] = temp;
            }
        }
        // swap intArray[i+1] and intArray[high] (or pi)
        int temp = subArray[i + 1];
        subArray[i + 1] = subArray[endIndex];
        subArray[endIndex] = temp;
        return i + 1;
    }
}
