import java.util.ArrayList;
import java.util.List;

// Employee Class
class Employee {

    private String employeeId;
    private String name;
    private String role;
    private double baseSalary;
    private double finalSalary;

    // Constructor
    public Employee(String employeeId, String name, String role, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
        this.finalSalary = 0;
    }

    // Calculate salary using switch-case
    public void calculateSalary() {

        switch (role) {

            case "Manager":
                finalSalary = baseSalary + (baseSalary * 0.20);
                break;

            case "Developer":
                finalSalary = baseSalary + (baseSalary * 0.10);
                break;

            case "Designer":
                finalSalary = baseSalary + (baseSalary * 0.05);
                break;

            case "Intern":
                finalSalary = 1000; // Fixed salary
                break;

            default:
                finalSalary = baseSalary;
                System.out.println("Unknown role. Base salary applied.");
        }
    }

    // Apply deduction
    public void applyDeduction(double amount) {
        if (amount > 0 && amount <= finalSalary) {
            finalSalary -= amount;
            System.out.println("Deduction of $" + amount + " applied to " + name);
        } else {
            System.out.println("Invalid deduction amount for " + name);
        }
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Name          : " + name);
        System.out.println("Role          : " + role);
        System.out.println("Final Salary  : $" + finalSalary);
        System.out.println("-----------------------------------");
    }

    public String getEmployeeId() {
        return employeeId;
    }
}


// Payroll Class
class Payroll {

    private List<Employee> employees;

    public Payroll() {
        employees = new ArrayList<>();
    }

    // Add employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee " + employee.getEmployeeId() + " added successfully.");
    }

    // Calculate salaries for all employees
    public void calculateAllSalaries() {
        for (Employee emp : employees) {
            emp.calculateSalary();
            emp.displayEmployeeDetails();
        }
    }

    // Find employee by ID
    public Employee findEmployeeById(String employeeId) {
        for (Employee emp : employees) {
            if (emp.getEmployeeId().equals(employeeId)) {
                return emp;
            }
        }
        return null;
    }
}


// Main Class
public class PayrollApp {

    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        // Adding employees
        Employee e1 = new Employee("E101", "Rahul", "Manager", 5000);
        Employee e2 = new Employee("E102", "Priya", "Developer", 4000);
        Employee e3 = new Employee("E103", "Amit", "Designer", 3500);
        Employee e4 = new Employee("E104", "Neha", "Intern", 2000);

        payroll.addEmployee(e1);
        payroll.addEmployee(e2);
        payroll.addEmployee(e3);
        payroll.addEmployee(e4);

        System.out.println("\n--- Calculating Salaries ---");
        payroll.calculateAllSalaries();

        // Apply deduction example
        System.out.println("\n--- Applying Deduction ---");
        Employee found = payroll.findEmployeeById("E102");

        if (found != null) {
            found.applyDeduction(200);
            found.displayEmployeeDetails();
        } else {
            System.out.println("Employee not found.");
        }
    }
}
