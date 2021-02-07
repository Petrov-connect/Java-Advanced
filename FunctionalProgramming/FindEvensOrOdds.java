package FunctionalProgramming;
//created by J.M.

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FindEvensOrOdds {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[]range=Arrays.stream(scan.nextLine().split("\\s+")).limit(2).mapToInt(Integer::parseInt).toArray();
        String command=scan.nextLine();
        IntStream.range(range[0],range[1]+1).filter(i->command.equals("odd") == (i % 2 != 0)).forEach(e->System.out.printf("%d ",e));
    }
}