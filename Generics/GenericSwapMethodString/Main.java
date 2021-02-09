package Generics.GenericSwapMethodString;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int n = Integer.parseInt(scan.nextLine());
        Box<String> box = new Box<>();
        IntStream.range(0, n).mapToObj(i -> scan.nextLine()).forEach(box::add);
        int[] indexes = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        box.swap(indexes[0],indexes[1]);
        System.out.println(box.toString());
    }
}
