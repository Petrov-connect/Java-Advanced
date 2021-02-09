package Generics.Tuple;
//created by J.M.

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[]data = scan.nextLine().split("\\s+");
        String name = String.format("%s %s",data[0],data[1]);
        String address = data[2];
        Tuple<String,String>firstMap = new Tuple<>(name,address);
        System.out.println(firstMap);

        data = scan.nextLine().split("\\s+");
        name = data[0];
        int litters= Integer.parseInt(data[1]);
        Tuple<String,Integer>secondMap = new Tuple<>(name,litters);
        System.out.println(secondMap);

        data = scan.nextLine().split("\\s+");
        int intNum = Integer.parseInt(data[0]);
        double floatNum = Double.parseDouble(data[1]);
        Tuple<Integer,Double>lastMap = new Tuple<>(intNum,floatNum);
        System.out.println(lastMap);

    }
}
