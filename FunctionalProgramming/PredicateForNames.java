package FunctionalProgramming;
//created by J.M.

import java.util.*;
import java.util.function.Predicate;

public class PredicateForNames {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        Predicate<String> lessOrEqualsLength = s -> s.length() <= length;
        Arrays.stream(scan.nextLine().split("\\s+")).filter(lessOrEqualsLength).forEach(System.out::println);
    }
}
