package SetsAndMaps;
//created by J.M.

import java.util.*;

public class UserLogs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, Map<String, Integer>> usersInfo = new TreeMap<>();
        String input;
        while (!"end".equals(input = scan.nextLine())) {
            String[] inputData = input.split("\\s+");
            String userName = inputData[2].split("=")[1];
            String ipAddress = inputData[0].split("=")[1];
            usersInfo.putIfAbsent(userName, new LinkedHashMap<>());
            usersInfo.get(userName).put(ipAddress, !usersInfo.get(userName).containsKey(ipAddress)
                    ? 1 : usersInfo.get(userName).get(ipAddress) + 1);
        }
        usersInfo.forEach((key, value) -> {
            System.out.printf("%s:%n", key);
            int count = 1;
            for (Map.Entry<String, Integer> innerMap : value.entrySet()) {
                String output = String.format(count < value.entrySet().size()
                        ? "%s => %d, " : "%s => %d.%n", innerMap.getKey(), innerMap.getValue());
                System.out.printf("%s", output);
                count++;
            }
        });
    }
}
