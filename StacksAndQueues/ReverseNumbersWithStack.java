package StacksAndQueues;
//created by J.M.

import java.util.*;

public class ReverseNumbersWithStack {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(numbersStack::push);
        while (!numbersStack.isEmpty()){
            System.out.print(numbersStack.pop()+" ");
        }
    }
}
