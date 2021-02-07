package SetsAndMaps;
//created by J.M.

import java.util.*;

public class FixEmails {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Map<String, String> emailList = new LinkedHashMap<>();
        String input;
        while (!"stop".equals(input = scan.nextLine())) {
            String email = scan.nextLine();
            if (!email.endsWith(".com") && !email.endsWith(".uk") && !email.endsWith(".us")) {
               // emailList.put(input, email);
                System.out.printf("%s -> %s%n", input, email);
            }
        }
        //emailList.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));
    }
}
