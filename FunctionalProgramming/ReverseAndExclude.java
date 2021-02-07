package FunctionalProgramming;
//created by J.M.

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer>numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scan.nextLine());
        Collections.reverse(numbers);
        Predicate<Integer>predicate=e->e%n!=0;
        Consumer<Integer>print=i-> System.out.printf("%d ",i);
        numbers.stream().filter(predicate).forEach(print);
    }
}
