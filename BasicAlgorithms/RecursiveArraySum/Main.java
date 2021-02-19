package BasicAlgorithms.RecursiveArraySum;
//created by J.M.

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        System.out.println(sum(numbers, 0));
    }

    private static int sum(int[] numbers, int index) {

        return index == numbers.length - 1 ? numbers[index] : numbers[index] + sum(numbers, index + 1);
    }
}
