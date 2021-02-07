package DefiningClasses.CarConstructors;
//created by J.M.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int n = Integer.parseInt(scan.nextLine());
        List<Car> carInfo = new ArrayList<>();
        Car.setDefaultModel("unknown");
        Car.setDefaultHorsepower(-1);

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            Car data;
            if(input.length==1){
                data=new Car(input[0]);
            }else {
                data = new Car(input[0], input[1], Integer.parseInt(input[2]));
            }
            carInfo.add(data);
        }
        carInfo.forEach(System.out::println);
    }
}
