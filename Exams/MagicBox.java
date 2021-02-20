package Exams;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class MagicBox {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> first = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));
        ArrayDeque<Integer> second = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(second::push);
        int sum = 0;

        while (!first.isEmpty() && !second.isEmpty()) {

            if ((first.peek() + second.peek()) % 2 == 0) {
                sum += first.poll() + second.pop();
            } else {
                first.offerLast(second.pop());
            }
        }
        if (first.isEmpty()) {
            System.out.println("First magic box is empty.");
        }
        if (second.isEmpty()) {
            System.out.println("Second magic box is empty.");
        }
        System.out.println(sum < 90 ? "Poor prey... Value: " + sum : "Wow, your prey was epic! Value: " + sum);

    }
}
