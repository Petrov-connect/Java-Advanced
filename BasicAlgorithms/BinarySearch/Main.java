package BasicAlgorithms.BinarySearch;
//created by J.M.

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(scan.nextLine());

        System.out.println(binarySearch(numbers, target));
    }

    private static int binarySearch(int[] numbers, int target) {

        int start = 0, end = numbers.length - 1;

        while (end >= start) {
            int half = (start + end) / 2;
            if (numbers[half] < target) {
                start = half + 1;
            } else if (numbers[half] > target) {
                end = half - 1;
            } else {
                return half;
            }
        }
        return -1;
    }
}
