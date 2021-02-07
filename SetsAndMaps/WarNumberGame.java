package SetsAndMaps;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class WarNumberGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Set<Integer> firstPlayer = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondPlayer = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        int n = 50;
        while (n-- != 0 && (!firstPlayer.isEmpty() && !secondPlayer.isEmpty())) {
            int first = firstPlayer.iterator().next(), second = secondPlayer.iterator().next();
            firstPlayer.remove(first);
            secondPlayer.remove(second);
            if (first > second) {
                firstPlayer.add(first);
                firstPlayer.add(second);
            } else if (second > first) {
                secondPlayer.add(first);
                secondPlayer.add(second);
            }
        }
        if (firstPlayer.size() == secondPlayer.size()) {
            System.out.println("Draw!");
        } else if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Second player win!");
        }
    }
}
