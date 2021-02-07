package SetsAndMaps;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PeriodicTable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Set<String>infoList= IntStream.range(0, Integer.parseInt(scan.nextLine()))
                .mapToObj(i -> scan.nextLine().split("\\s+")).flatMap(Arrays::stream)
                .collect(Collectors.toCollection(TreeSet::new));
        infoList.stream().map(equals -> equals + " ").forEach(System.out::print);

    }
}
