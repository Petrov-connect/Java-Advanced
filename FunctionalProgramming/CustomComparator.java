package FunctionalProgramming;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class CustomComparator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        Comparator<Integer> comparator = ((x1, x2) -> {
            if (x1 % 2 != 0 && x2 % 2 == 0) {
                return 1;
            } else if (x1 % 2 == 0 && x2 % 2 != 0) {
                return -1;
            }
            return x1.compareTo(x2);
        });
        numbers.stream().sorted(comparator).forEach(e-> System.out.printf("%d ",e));
    }
}
