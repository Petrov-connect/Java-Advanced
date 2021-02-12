package IteratorsAndComparators.StackIterator;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Stack myStack = new Stack();
        Arrays.stream(scan.nextLine().replaceAll("Push\\s+","").trim().split(", "))
                .mapToInt(Integer::parseInt).forEach(myStack::push);
        String command;
        while (!"END".equals(command=scan.nextLine())){
            String [] input = command.split("\\s+");
            if(input[0].equals("Pop")){
                try{
                    myStack.pop();
                }catch (IllegalStateException ex){
                    System.out.println(ex.getMessage());
                }

            }else if(input[0].equals("Push")){
                myStack.push(Integer.parseInt(input[1].trim()));
            }
        }
        IntStream.range(0, 2).forEach(i -> {
            for (Integer integer : myStack) {
                System.out.println(integer);
            }
        });
    }
}
