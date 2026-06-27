import java.util.Scanner;
import java.util.ArrayList;

class Employee{
    int id;
    String name;
    double salary;

    Employee(int id , String name , double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Employee ID: " +id);
        System.out.println("Employee Name: " +name);
        System.out.println("Empolyee Salary: " +salary);

        System.out.println("------------------------------------");
    }


}

public class employee_management_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employee = new ArrayList<>();

        while(true){
            System.out.println("========Employee Management System=======");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            System.out.println();

            switch(choice){
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    employee.add(new Employee(id , name , salary));
                    System.out.println("Employee Added Sucessfully!");
                    System.out.println();
                    break;

                    case 2:
                        if(employee.isEmpty()){
                            System.out.println("No Employee Fouund!");
                        }else {
                            System.out.println("Employee Details: ");
                            for(Employee e : employee){
                                e.display();
                            }
                        }
                        break;

                        case 3:
                            System.out.print("Enter Employee ID to search: ");
                            int searchId = sc.nextInt();
                            boolean found = false;
                            for(Employee e : employee){
                                if(e.id == searchId){
                                    e.display();
                                    found = true;
                                    break;
                                }
                            }
                            if(!found){
                                System.out.println("Employee Not Found!");
                            }
                            break;

                            case 4:
                                System.out.println("Exiting Program...");
                                sc.close();
                                System.exit(0);

                                default:
                                    System.out.println("Invalid choice!");

            }
        }
    }
    
}
