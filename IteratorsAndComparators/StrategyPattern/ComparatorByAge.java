package IteratorsAndComparators.StrategyPattern;
//created by J.M.

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Person> {

    @Override
    public int compare(Person first, Person second) {
        return Integer.compare(first.getAge(),second.getAge());
    }
}
