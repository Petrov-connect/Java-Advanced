package Generics.Threeuple;
//created by J.M.

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[]data = scan.nextLine().split("\\s+");
        String name = String.format("%s %s",data[0],data[1]);
        String address = data[2];
        String city = data[3];
        Threeuple<String,String,String> firstMap = new Threeuple<>(name,address,city);
        System.out.println(firstMap);

        data = scan.nextLine().split("\\s+");
        name = data[0];
        int litters= Integer.parseInt(data[1]);
        boolean isDrunk = "drunk".equals(data[2]);
        Threeuple<String,Integer,Boolean>secondMap = new Threeuple<>(name,litters,isDrunk);
        System.out.println(secondMap);

        data = scan.nextLine().split("\\s+");
        name = data[0];
        double amount = Double.parseDouble(data[1]);
        String bank = data[2];
        Threeuple<String,Double,String>lastMap = new Threeuple<>(name,amount,bank);
        System.out.println(lastMap);
    }
}
