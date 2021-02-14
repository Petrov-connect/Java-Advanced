package Exams;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class Scheduling {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> tasks = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).forEach(tasks::push);
        ArrayDeque<Integer> threads = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));
        int stop = Integer.parseInt(scan.nextLine());

        while (!tasks.isEmpty() && !threads.isEmpty() && tasks.peek() != stop) {
            int threadsValue = threads.poll() , tasksValue = tasks.pop();
            if (threadsValue < tasksValue) {
                tasks.push(tasksValue);
            }
        }
        System.out.printf("Thread with value %d killed task %d%n", threads.peek(), stop);
        System.out.printf("%s", threads.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
