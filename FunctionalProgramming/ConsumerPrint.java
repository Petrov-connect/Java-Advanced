package FunctionalProgramming;
//created by J.M.

import java.util.*;
import java.util.function.Consumer;

public class ConsumerPrint {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Consumer<String>print= System.out::println;
        Arrays.stream(scan.nextLine().split("\\s+")).forEach(print);
    }
}

