package Exams;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class DatingApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> males = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(males::push);
        ArrayDeque<Integer> females = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        int matchesCount = 0;
        while (!males.isEmpty() && !females.isEmpty()) {

            if (males.peek() <= 0 || females.peek() <= 0 || males.peek() % 25 == 0 || females.peek() % 25 == 0) {
                extracted(males);
                extracted(females);
            } else {
                if (males.peek().equals(females.peek())) {
                    matchesCount++;
                    males.pop();
                } else {
                    males.push(males.pop() - 2);
                }
                females.poll();
            }
        }
        System.out.println("Matches: " + matchesCount);
        if (males.isEmpty()) {
            System.out.println("Males left: none");
        } else {
            System.out.printf("Males left: %s%n", males.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }
        if (females.isEmpty()) {
            System.out.println("Females left: none");
        } else {
            System.out.printf("Females left: %s", females.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }
    }

    private static void extracted(ArrayDeque<Integer> collection) {
        if (collection.peek() <= 0) {
            collection.pop();
        } else if (collection.peek() % 25 == 0) {
            collection.pop();
            collection.pop();
        }
    }
}
