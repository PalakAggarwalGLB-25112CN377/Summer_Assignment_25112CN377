import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private double basicSalary;
    private double hra, da, deduction, netSalary;

    // Constructor
    Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        calculateSalary();
    }

    // Calculate salary
    private void calculateSalary() {
        hra = basicSalary * 0.20;       // 20% HRA
        da = basicSalary * 0.10;        // 10% DA
        deduction = basicSalary * 0.05; // 5% Deduction

        netSalary = basicSalary + hra + da - deduction;
    }

    // Getter for searching
    public int getEmpId() {
        return empId;
    }

    // Display employee details
    public void display() {
        System.out.println("\n--------------------------------");
        System.out.println("Employee ID      : " + empId);
        System.out.println("Employee Name    : " + empName);
        System.out.println("Basic Salary     : " + basicSalary);
        System.out.println("HRA (20%)        : " + hra);
        System.out.println("DA (10%)         : " + da);
        System.out.println("Deduction (5%)   : " + deduction);
        System.out.println("Net Salary       : " + netSalary);
    }
}

public class salary_management_System {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== SALARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double salary = sc.nextDouble();

                    employees.add(new Employee(id, name, salary));

                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("\n===== EMPLOYEE RECORDS =====");
                        for (Employee emp : employees) {
                            emp.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Employee emp : employees) {
                        if (emp.getEmpId() == searchId) {
                            emp.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}

