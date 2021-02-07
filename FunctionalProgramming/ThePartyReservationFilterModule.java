package FunctionalProgramming;
//created by J.M.

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String>names = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        Set<String> predicates = new HashSet<>();
        String input;
        while (!"Print".equals(input = scan.nextLine())) {
            String[] command = input.split(";");
            if (command[0].contains("Add")) {
                predicates.add(command[1] + "," + command[2]);
            } else {
                predicates.remove(command[1] + "," + command[2]);
            }
        }
        predicates.forEach(predicate -> names.removeIf(getPredicate(predicate)));
        System.out.println(String.join(" ",names));
    }

    private static Predicate<String> getPredicate(String commands) {
        Predicate<String> predicate;
        String[]command=commands.split(",");
        switch (command[0]) {
            case "StartsWith":
                predicate = name -> name.startsWith(command[1]);
                break;
            case "EndsWith":
                predicate = name -> name.endsWith(command[1]);
                break;
            case "Length":
                predicate = name -> name.length() == Integer.parseInt(command[1]);
                break;
            default:
                predicate = names -> names.contains(command[1]);
                break;
        }
        return predicate;
    }
}
