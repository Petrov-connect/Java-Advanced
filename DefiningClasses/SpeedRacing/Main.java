package DefiningClasses.SpeedRacing;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;
import static DefiningClasses.SpeedRacing.Car.drivingCar;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, Car> carInfo = new LinkedHashMap<>();

        IntStream.range(0, n).mapToObj(i -> scan.nextLine().split("\\s+")).forEach(input -> {
            String model = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double fuelPricePerKilometer = Double.parseDouble(input[2]);
            Car data = new Car(model, fuelAmount, fuelPricePerKilometer, 0);
            carInfo.put(model, data);
        });

        String input;
        while (!"End".equals(input = scan.nextLine())) {
            String[] command = input.split("\\s+");
            drivingCar(carInfo.get(command[1]), Integer.parseInt(command[2]));
        }

        carInfo.forEach((key, value) -> System.out.printf("%s %.2f %d%n"
                , key, value.getFuelAmount(), value.getTraveledDistance()));

    }
}
