package DefiningClasses.CompanyRoster;
//created by J.M.

public class Employee {

    private final String name;
    private final double salary;
    private final String department;
    private final String email;
    int age;

    public Employee(String name, double salary, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
