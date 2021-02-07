package FunctionalProgramming;
//created by J.M.

import java.util.*;
public class CustomMinFunction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).min().orElse(0));
    }
}
