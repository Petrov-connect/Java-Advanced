package SetsAndMaps;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UniqueUsernames {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Set<String> userList= IntStream.range(0, n).mapToObj(i -> scan.nextLine())
                .collect(Collectors.toCollection(LinkedHashSet::new));
        userList.forEach(System.out::println);
    }
}
