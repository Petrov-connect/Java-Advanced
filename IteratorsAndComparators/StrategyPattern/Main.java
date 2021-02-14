package IteratorsAndComparators.StrategyPattern;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Set<Person>personByName = new TreeSet<>(new ComparatorByName());
        Set<Person>personByAge = new TreeSet<>(new ComparatorByAge());
        int n = Integer.parseInt(scan.nextLine());
        IntStream.range(0, n).mapToObj(i -> scan.nextLine().split("\\s+")).forEach(input -> {
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            personByName.add(person);
            personByAge.add(person);
        });
        personByName.forEach(System.out::println);
        personByAge.forEach(System.out::println);
    }
}
