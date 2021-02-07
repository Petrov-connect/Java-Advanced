package StacksAndQueues;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HotPotato {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> kids = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayDeque::new));
        int transfers = Integer.parseInt(scan.nextLine());

        while (kids.size() > 1) {
            IntStream.range(1, transfers).forEach(i -> kids.offer(Objects.requireNonNull(kids.poll())));
            System.out.println("Removed " + kids.poll());
        }
        System.out.println("Last is " + kids.poll());
    }
}
