package DefiningClasses.CarInfo;
//created by J.M.

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int n = Integer.parseInt(scan.nextLine());
        List<Car> carInfo = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            Car data = new Car(input[0], input[1], Integer.parseInt(input[2]));
            carInfo.add(data);
        }
        carInfo.forEach(System.out::println);
    }
}
