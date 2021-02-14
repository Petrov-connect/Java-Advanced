package IteratorsAndComparators.EqualityLogic;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Set<Person>first = new TreeSet<>(new ComparatorByHashCode());
        Set<Person>second = new HashSet<>();
        int n = Integer.parseInt(scan.nextLine());
        IntStream.range(0, n).mapToObj(input -> scan.nextLine().split("\\s+")).forEach(input -> {
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            first.add(person);
            second.add(person);
        });
        System.out.printf("%d%n%d",first.size(),second.size());
    }
}


