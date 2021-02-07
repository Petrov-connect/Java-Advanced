package StacksAndQueues;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;

public class BasicStackOperations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] commands = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Arrays.stream(numbers, 0, commands[0]).forEach(stack::push);
        IntStream.range(0, commands[1]).filter(i -> !stack.isEmpty()).forEach(i -> stack.pop());
        if(stack.isEmpty()){
            System.out.println(0);
        }else if(stack.contains(commands[2])){
            System.out.println("true");
        }else{
            System.out.println(Collections.min(stack));
        }
    }
}
