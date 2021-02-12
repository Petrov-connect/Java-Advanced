package IteratorsAndComparators.Collection;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String>data= Arrays.stream(scan.nextLine().split("\\s+")).skip(1).collect(Collectors.toList());
        ListyIterator listyIterator = new ListyIterator(data);
        String command;
        while (!"END".equals(command=scan.nextLine())){
            switch (command){
                case"HasNext":
                    System.out.println(listyIterator.iterator().hasNext());
                    break;
                case"Move":
                    System.out.println(listyIterator.move());
                    break;
                case"Print":
                    try{
                        listyIterator.print();
                    }catch (IllegalStateException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case"PrintAll":
                    try{
                        listyIterator.printAll();
                    }catch (IllegalStateException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
            }
        }
    }
}
