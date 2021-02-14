package IteratorsAndComparators.LinkedListTraversal;
//created by J.M.

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        LinkedList list = new LinkedList();
        while (n-->0){
            String []input = scan.nextLine().split("\\s+");
            if ("Add".equals(input[0])) {
                list.add(Integer.parseInt(input[1]));
            } else {
                list.remove(Integer.parseInt(input[1]));
            }
        }
        System.out.println(list.getSize());
        list.forEach(e-> System.out.print(e+" "));
    }
}

