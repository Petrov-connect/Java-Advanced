package StacksAndQueues;
//created by J.M.

import java.util.*;

public class MaximumElement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> numberStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int[] commands = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            switch (commands[0]) {
                case 1:
                    numberStack.push(commands[1]);
                    break;
                case 2:
                    if (!numberStack.isEmpty()) {
                        numberStack.pop();
                    }
                    break;
                case 3:
                    System.out.println(Collections.max(numberStack));
                    break;
            }
        }
    }
}
