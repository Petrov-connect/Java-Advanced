package DefiningClasses.CompanyRoster;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Employee> employeeList = new ArrayList<>();

        while (n-->0){
            String[] input = scan.nextLine().split("\\s+");
            int age = -1;
            String email = "n/a";
            if (input.length == 5) {
                try {
                    age = Integer.parseInt(input[4]);
                } catch (Exception exception) {
                    email = input[4];
                }
            } else if (input.length == 6) {
                age = Integer.parseInt(input[5]);
                email = input[4];
            }
            Employee data = new Employee(input[0], Double.parseDouble(input[1]), input[3], email, age);
            employeeList.add(data);
        }

        List<String> departmentNames = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        List<Department> departments = departmentNames.stream().map(department -> new Department(department,
                employeeList.stream().filter(employee -> employee.getDepartment().equals(department)).collect(Collectors.toList())))
                .sorted(Comparator.comparingDouble(Department::getAvgSalary).reversed()).collect(Collectors.toList());

        Department department = departments.get(0);
        department.getEmployeeFromEmployeeList().sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.printf("Highest Average Salary: %s%n", department.getName());

        department.getEmployeeFromEmployeeList().forEach(employee ->
                System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge()));
    }
}
