package SetsAndMaps;
//created by J.M.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Unleashed {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, Map<String, Integer>> venuesInfo = new LinkedHashMap<>();
        Pattern pattern = Pattern.compile("^([\\w]+? ?[\\w]+? ?[\\w]+) @([\\w]+? ?[\\w]+? ?[\\w]+) (\\d+) (\\d+)$");
        String input;

        while (!"End".equals(input = scan.nextLine())) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String singer = matcher.group(1), venues = matcher.group(2);
                int ticketsPrice = Integer.parseInt(matcher.group(3)), ticketsCount = Integer.parseInt(matcher.group(4));
                venuesInfo.putIfAbsent(venues, new LinkedHashMap<>());
                venuesInfo.get(venues).put(singer, !venuesInfo.get(venues).containsKey(singer)
                        ? ticketsCount * ticketsPrice : venuesInfo.get(venues).get(singer) + ticketsCount * ticketsPrice);
            }
        }
        venuesInfo.forEach((key, value) -> { System.out.println(key);
            value.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(v -> System.out.printf("#  %s -> %d%n", v.getKey(), v.getValue()));
        });
    }
}
