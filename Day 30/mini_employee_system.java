import java.util.Scanner;

public class mini_employee_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int empId[] = new int[100];
        String empName[] = new String[100];
        double empSalary[] = new double[100];

        int count = 0;
        int choice;

        while(true){
            System.out.println("\n=====Employee Management System======");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Employee Salary: ");
                    empSalary[count] = sc.nextDouble();

                    count++;

                    System.out.println("Employee Added Sucessfully.");
                    break;

                    case 2:
                        if(count == 0){
                            System.out.println("No employees found.");
                        }else {
                            System.out.println("\n Employee Detalis:");
                            for(int i=0 ; i<count ;i++){
                                System.out.println("----------------------");
                                System.out.println("ID: " +empId[i]);
                                System.out.println("Name: " +empName[i]);
                                System.out.println("Salary: " +empSalary[i]);
                            }
                        }
                        break;

                        case 3:
                            System.out.print("Enter EMployee ID to search: ");
                            int searchId = sc.nextInt();
                            boolean found = false;

                            for(int i=0 ;i<count ;i++){
                                if(empId[i] == searchId){
                                    System.err.println("\nEmployee Found:");
                                    System.out.println("ID: "+ empId[i]);
                                    System.out.println("Name: " +empName[i]);
                                    System.out.println("Salary: " +empSalary[i]);
                                    found = true;
                                    break;
                                }
                            }
                            if (!found) {
                                System.out.println("Employee not found.");
                            }
                            break;

                            case 4:
                            System.out.println("Exiting...");
                            sc.close();
                            System.exit(0);


            }

        }
    }
}