package Generics.CustomListSorter;
//created by J.M.

import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class CustomBox<T extends Comparable<T>>  {

    List<T> data;

    public CustomBox() {
        this.data = new ArrayList<>();
    }

    public void printData() {
        this.data.forEach(System.out::println);
    }

    public List<T> toSort(){ return  this.data; }

    public long countGreaterThan(T element) {
        return this.data.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public void swap(int first, int second) {
        Collections.swap(this.data, first, second);
    }

    public T getMax() {
        return this.data.stream().max(Comparator.naturalOrder()).orElse(null);
    }

    public T getMin() {
        return this.data.stream().min(Comparator.naturalOrder()).orElse(null);
    }

    public boolean contains(T element) {
        return this.data.contains(element);
    }

    public void add(T element) {
        this.data.add(element);
    }

    public T remove(int index) {
        return this.data.remove(index);
    }
}
