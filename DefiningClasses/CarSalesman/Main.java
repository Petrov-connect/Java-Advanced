package DefiningClasses.CarSalesman;
//created by J.M.

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nextLines = Integer.parseInt(scan.nextLine());
        List<Engine> engineList = new ArrayList<>();

        while (nextLines-- > 0) {
            String[] input = scan.nextLine().split("\\s+");
            String displacement = "n/a";
            String efficiency = "n/a";
            if (input.length == 3) {
                try {
                    Integer.parseInt(input[2]);
                    displacement = input[2];
                } catch (Exception exception) {
                    efficiency = input[2];
                }
            } else if (input.length == 4) {
                displacement = input[2];
                efficiency = input[3];
            }
            Engine newData = new Engine(input[0], input[1], displacement, efficiency);
            engineList.add(newData);
        }

        nextLines = Integer.parseInt(scan.nextLine());
        List<Car> carList = new ArrayList<>();

        while (nextLines-- > 0) {
            String[] input = scan.nextLine().split("\\s+");
            String weight = "n/a";
            String color = "n/a";
            if (input.length == 3) {
                try {
                    Integer.parseInt(input[2]);
                    weight = input[2];
                } catch (Exception exception) {
                    color = input[2];
                }
            } else if (input.length == 4) {
                weight = input[2];
                color = input[3];
            }
            Engine dataEngine = engineList.stream().filter(data -> data.getModel().equals(input[1])).findFirst().orElseThrow();
            Car newData = new Car(input[0], dataEngine, weight, color);
            carList.add(newData);
        }

        carList.forEach(System.out::println);
    }
}
