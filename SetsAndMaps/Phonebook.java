package SetsAndMaps;
//created by J.M.

import java.util.*;

public class Phonebook {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String,String>phoneBook=new HashMap<>();
        String input;
        while (!"search".equals(input=scan.nextLine())){
            phoneBook.put(input.split("-")[0],input.split("-")[1]);
        }
        while (!"stop".equals(input=scan.nextLine())){
            if(phoneBook.containsKey(input)){
                System.out.printf("%s -> %s%n",input,phoneBook.get(input));
            }else{
                System.out.printf("Contact %s does not exist.%n",input);
            }
        }
    }
}
