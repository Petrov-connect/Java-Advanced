package StacksAndQueues;
//created by J.M.

import java.util.*;

public class BalancedParentheses {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        ArrayDeque<Character> openParentheses = new ArrayDeque<>();
        boolean isBalanced=true;

        for (int i = 0; i < input.length(); i++) {

            char current=input.charAt(i);
            if(current=='{'||current=='['||current=='('){
                openParentheses.push(current);
            }else{
                if(!openParentheses.isEmpty()) {
                    if (current == ')') {
                        if (openParentheses.pop() != '(') {
                            isBalanced = false;
                        }
                    } else if (current == ']') {
                        if (openParentheses.pop() != '[') {
                            isBalanced = false;
                        }
                    } else if (current == '}') {
                        if (openParentheses.pop() != '{') {
                            isBalanced = false;
                        }
                    }
                }else{
                    isBalanced=false;
                }
                if(!isBalanced){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}
