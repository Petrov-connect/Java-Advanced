package FunctionalProgramming;
//created by J.M.

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Predicate<String>startsWhitUpperCase=s->s!=null && !s.isEmpty() && Character.isUpperCase(s.charAt(0));
        List<String> upperCaseWords = Arrays.stream(scan.nextLine().split("\\s+")).filter(startsWhitUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseWords.size());
        System.out.println(upperCaseWords.stream().collect(Collectors.joining(System.lineSeparator())));

    }
}
