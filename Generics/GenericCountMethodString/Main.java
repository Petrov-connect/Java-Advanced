package Generics.GenericCountMethodString;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int n = Integer.parseInt(scan.nextLine());
        Box<String> box = new Box<>();
        IntStream.range(0, n).mapToObj(i -> scan.nextLine()).forEach(box::add);
        System.out.println(box.countGraterElements(scan.nextLine()));
    }
}
