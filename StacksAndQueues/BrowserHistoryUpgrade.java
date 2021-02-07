package StacksAndQueues;
//created by J.M.

import java.util.*;

public class BrowserHistoryUpgrade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> browserHistoryBack = new ArrayDeque<>();
        ArrayDeque<String> browserHistoryForward = new ArrayDeque<>();
        String input;
        String currentURL = null;

        while (!"Home".equals(input = scan.nextLine())) {
            if (input.equals("back")) {
                if (!browserHistoryBack.isEmpty()) {
                    browserHistoryForward.offerFirst(currentURL);
                }
                if (browserHistoryBack.isEmpty()) {
                    System.out.println("no previous URLs");
                    continue;
                } else {
                    currentURL = browserHistoryBack.pop();
                }
            } else if (input.equals("forward")) {
                if (browserHistoryForward.isEmpty()) {
                    System.out.println("no next URLs");
                    continue;
                } else {
                    currentURL = browserHistoryForward.poll();
                }
            } else {
                if (currentURL != null) {
                    browserHistoryBack.push(currentURL);
                }
                currentURL = input;
                browserHistoryForward.clear();
            }
            System.out.println(currentURL);
        }
    }
}
