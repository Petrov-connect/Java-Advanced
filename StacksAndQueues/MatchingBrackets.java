package StacksAndQueues;
//created by J.M.

import java.util.*;

public class MatchingBrackets {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayDeque<Integer> indexesOfOpeningBrackets = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                indexesOfOpeningBrackets.push(i);
            } else if (input.charAt(i) == ')') {
                System.out.println(input.substring(indexesOfOpeningBrackets.pop(), i + 1));
            }
        }
    }
}
