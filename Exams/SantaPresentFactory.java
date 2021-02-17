package Exams;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class SantaPresentFactory {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> materials = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(materials::push);
        ArrayDeque<Integer> magic = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));
        Map<String, Integer> presents = new TreeMap<>();

        while (!materials.isEmpty() && !magic.isEmpty()) {

            int materialsValue = materials.peek();
            int magicValue = magic.peek();
            if (materialsValue != 0 && magicValue != 0) {
                int sum = magicValue * materialsValue;
                if (sum < 0) {
                    magic.poll();
                    materials.pop();
                    materials.push(materialsValue + magicValue);
                } else {
                    materials.pop();
                    magic.poll();
                    if (sum == 400) {
                        presents.put("Bicycle", presents.containsKey("Bicycle") ? presents.get("Bicycle") + 1 : 1);
                    } else if (sum == 300) {
                        presents.put("Teddy bear", presents.containsKey("Teddy bear") ? presents.get("Teddy bear") + 1 : 1);
                    } else if (sum == 250) {
                        presents.put("Wooden train", presents.containsKey("Wooden train") ? presents.get("Wooden train") + 1 : 1);
                    } else if (sum == 150) {
                        presents.put("Doll", presents.containsKey("Doll") ? presents.get("Doll") + 1 : 1);
                    } else {
                        materials.push(materialsValue + 15);
                    }
                }
            } else {
                if (materialsValue == 0) {
                    materials.pop();
                }
                if (magicValue == 0) {
                    magic.poll();
                }
            }
        }
        if (((presents.containsKey("Teddy bear") && presents.containsKey("Bicycle"))
                && (presents.get("Teddy bear") > 0 && presents.get("Bicycle") > 0))
                || ((presents.containsKey("Wooden train") && presents.containsKey("Doll"))
                && (presents.get("Wooden train") > 0 && presents.get("Doll") > 0))) {

            System.out.println("The presents are crafted! Merry Christmas!");

        } else {
            System.out.println("No presents this Christmas!");
        }
        if (!materials.isEmpty()) {
            System.out.printf("Materials left: %s%n", materials.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }
        if (!magic.isEmpty()) {
            System.out.printf("Magic left: %s%n", magic.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }

        presents.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }
}

