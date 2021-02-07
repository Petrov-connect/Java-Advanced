package SetsAndMaps;
//created by J.M.

import java.util.*;

public class ProductShop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, Map<String, Double>> shopsInfo = new TreeMap<>();
        String input;
        while (!"Revision".equals(input = scan.nextLine())) {
            String[] inputData = input.split(", ");
            shopsInfo.putIfAbsent(inputData[0], new LinkedHashMap<>());
            shopsInfo.get(inputData[0]).putIfAbsent(inputData[1], Double.parseDouble(inputData[2]));
        }
        shopsInfo.forEach((key, value) -> {
            System.out.printf("%s->%n", key);
            value.forEach((key1, value1) ->
                    System.out.printf("Product: %s, Price: %.1f%n", key1, value1));
        });
    }
}
