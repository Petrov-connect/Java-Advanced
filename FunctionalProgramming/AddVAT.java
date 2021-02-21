package FunctionalProgramming;
//created by J.M.

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        UnaryOperator<Double>vatAdder=vat->vat*1.20;
        String values = Arrays.stream(scan.nextLine().split(", "))
                .map(e -> String.format("%.2f", vatAdder.apply(Double.parseDouble(e))))
                .collect(Collectors.joining(System.lineSeparator()));

        System.out.printf("Prices with VAT:%n%s",values);
    }
}
