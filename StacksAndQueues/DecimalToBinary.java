package StacksAndQueues;
//created by J.M.

import java.util.*;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int decimal = Integer.parseInt(scan.nextLine());

        if (decimal != 0) {
            ArrayDeque<Integer> binaryStack = new ArrayDeque<>();
            while (decimal != 0) {
                binaryStack.push(decimal % 2);
                decimal /= 2;
            }
            while (!binaryStack.isEmpty()) {
                System.out.print(binaryStack.pop());
            }
        } else {
            System.out.println(0);
        }
    }
}