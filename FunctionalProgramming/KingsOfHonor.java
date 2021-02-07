package FunctionalProgramming;
//created by J.M.

import java.util.*;
import java.util.function.Consumer;

public class KingsOfHonor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Consumer<String>print=s->System.out.printf("Sir %s%n",s);
        Arrays.stream(scan.nextLine().split("\\s+")).forEach(print);
    }
}
