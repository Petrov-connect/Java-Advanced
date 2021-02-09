package Generics.GenericSwapMethodInteger;
//created by J.M.

import java.util.*;

public class Box<T>{

    private final List<T> value;

    public Box() {
        this.value=new ArrayList<>();
    }

    public void add(T value){
        this.value.add(value);
    }

    public void swap(int first ,int second){
        Collections.swap(this.value,first,second);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (T value : this.value) {
            output.append(String.format("%s: %s",value.getClass().getName(),value.toString())).append(System.lineSeparator());
        }
        return output.toString().trim();
    }
}
