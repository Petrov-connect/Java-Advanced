package SetsAndMaps;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;

public class CountSymbols {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        Map<Character,Integer>infoList=new TreeMap<>();
        IntStream.range(0, input.length()).forEach(i -> infoList.put(input.charAt(i),
                !infoList.containsKey(input.charAt(i)) ? 1 : infoList.get(input.charAt(i)) + 1));
        infoList.forEach((key,value)-> System.out.printf("%c: %d time/s%n",key,value));

    }
}
