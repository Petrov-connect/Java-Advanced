package SetsAndMaps;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SetsOfElements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] size = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> firstList = IntStream.range(0, size[0]).mapToObj(i -> Integer.parseInt(scan.nextLine()))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondList = IntStream.range(0, size[1]).mapToObj(i -> Integer.parseInt(scan.nextLine()))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        firstList.stream().filter(secondList::contains).map(equals -> equals + " ").forEach(System.out::print);
    }
}
