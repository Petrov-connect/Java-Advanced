package BasicAlgorithms.RecursiveFactorial;
//created by J.M.

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        System.out.println(factorial(n));
    }

    private static long factorial(int n) {

        return n == 0 ? 1 : n * factorial(n - 1);
    }
}
