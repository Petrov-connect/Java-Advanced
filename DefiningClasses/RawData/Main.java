package DefiningClasses.RawData;
//created by J.M.

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Car> carList = new ArrayList<>();

        while (n-- > 0) {
            String[] input = scan.nextLine().split("\\s+");
            Car data = new Car(input[0], Integer.parseInt(input[2]), input[4], Double.parseDouble(input[5])
                    , Double.parseDouble(input[7]), Double.parseDouble(input[9]), Double.parseDouble(input[11]));
            carList.add(data);
        }

        String input = scan.nextLine();

        if (input.equals("fragile")) {
            carList.stream().filter(e -> e.getCargoType().equals("fragile")
                    && e.tirePressure()).forEach(System.out::println);
        } else {
            carList.stream().filter(e -> e.getCargoType().equals("flamable")
                    && e.getEnginePower() > 250).forEach(System.out::println);
        }
    }
}