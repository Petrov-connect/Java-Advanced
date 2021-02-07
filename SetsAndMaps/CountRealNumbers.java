package SetsAndMaps;
//created by J.M.

import java.util.*;

public class CountRealNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double [] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();
        Map<Double,Integer>numbersCountInfo=new LinkedHashMap<>();
        for (double number : numbers) {
            numbersCountInfo.put(number,!numbersCountInfo.containsKey(number)
            ? 1 : numbersCountInfo.get(number)+1);
        }
        numbersCountInfo.forEach((key,value)-> System.out.printf("%.1f -> %d%n",key,value));
    }
}
