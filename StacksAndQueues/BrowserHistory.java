package StacksAndQueues;
//created by J.M.

import java.util.*;

public class BrowserHistory {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        String input;
        String currentURL = null;

        while (!"Home".equals(input = scan.nextLine())) {
            if (input.equals("back")) {
                if (browserHistory.isEmpty()) {
                    System.out.println("no previous URLs");
                    continue;
                } else {
                    currentURL = browserHistory.pop();
                }
            } else {
                if (currentURL != null) {
                    browserHistory.push(currentURL);
                }
                currentURL = input;
            }
            System.out.println(currentURL);
        }
    }
}
