package FunctionalProgramming;
//created by J.M.

import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;

public class SumNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        Function<String,IntStream>getIntStream=stringInput->Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt);
        System.out.printf("Count = %d%nSum = %d",getIntStream.apply(input).count(),getIntStream.apply(input).sum());
    }
}
