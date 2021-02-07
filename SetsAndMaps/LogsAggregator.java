package SetsAndMaps;
//created by J.M.

import java.util.*;

public class LogsAggregator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        Map<String,Map<String,Integer>>usersInfo=new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[]input=scan.nextLine().split("\\s+");
            usersInfo.putIfAbsent(input[1],new TreeMap<>());
            usersInfo.get(input[1]).put(input[0], !usersInfo.get(input[1]).containsKey(input[0])
                    ? Integer.parseInt(input[2]) : usersInfo.get(input[1]).get(input[0]) + Integer.parseInt(input[2]));
        }
        usersInfo.forEach((key, value) -> System.out.printf("%s: %d [%s]%n", key,
                value.values().stream().mapToInt(v -> v).sum(),String.join(", ", value.keySet())));
    }
}
