package StacksAndQueues;
//created by J.M.

import java.util.*;

public class SimpleTextEditor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> textHistory = new ArrayDeque<>();
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < n; i++) {

            String[] command = scan.nextLine().split("\\s+");

            switch (command[0]) {
                case "1":
                    textHistory.push(text.toString());
                    text.append(command[1]);
                    break;
                case "2":
                    textHistory.push(text.toString());
                    text.delete(text.length() - Integer.parseInt(command[1]), text.length());
                    break;
                case "3":
                    System.out.println(text.charAt(Integer.parseInt(command[1]) - 1));
                    break;
                case "4":
                    text = new StringBuilder(textHistory.pop());
                    break;
            }
        }
    }
}
