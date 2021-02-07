package SetsAndMaps;
//created by J.M.

import java.util.*;

public class AverageStudentsGrades {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, List<Double>> studentsGrades = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            studentsGrades.putIfAbsent(input[0], new ArrayList<>());
            studentsGrades.get(input[0]).add(Double.parseDouble(input[1]));
        }
        studentsGrades.forEach((key, value) -> {
            System.out.printf("%s -> ", key);
            value.forEach(v -> System.out.printf("%.2f ", v));
            System.out.printf("(avg: %.2f)%n", getAverage(value));
        });
    }

    private static Double getAverage(List<Double> value) {
        double average = 0.0;
        for (Double aDouble : value) {
            average += aDouble;
        }
        return average / value.size();

    }
}
