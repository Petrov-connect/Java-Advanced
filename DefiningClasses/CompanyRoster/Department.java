package DefiningClasses.CompanyRoster;
//created by J.M.

import java.util.List;

public class Department {

    private final String name;
    private final List<Employee> employeeFromEmployeeList;
    private final double avgSalary;

    List<Employee> getEmployeeFromEmployeeList() {
        return employeeFromEmployeeList;
    }

    Department(String name, List<Employee> employeeFromEmployeeList) {
        this.name = name;
        this.employeeFromEmployeeList = employeeFromEmployeeList;
        this.avgSalary = employeeFromEmployeeList.stream().mapToDouble(Employee::getSalary).average().orElse(0.00);
    }

    double getAvgSalary() {
        return avgSalary;
    }

    String getName() {
        return name;
    }
}