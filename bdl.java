import java.util.Scanner;

class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + "\nName: " + name + "\nSalary: $" + salary;
    }
}

public class EmployeeDetailsApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Employee Details Application");
        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();

        System.out.print("Enter Employee ID: ");
        int employeeId = input.nextInt();

        System.out.print("Enter Employee Salary: $");
        double salary = input.nextDouble();

        Employee employee = new Employee(name, employeeId, salary);

        System.out.println("\nEmployee Details:\n" + employee);

        // You can add more functionality like updating, searching, or storing employees.
    }
}
