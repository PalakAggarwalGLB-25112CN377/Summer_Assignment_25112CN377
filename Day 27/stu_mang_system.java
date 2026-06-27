import java.util.Scanner;
import java.util.ArrayList;

class Student {
            int id;
            String name;
            int age;
            String course;

            Student(int id , String name , int age , String course){
                this.id = id;
                this.name = name;
                this.age = age;
                this.course = course;
            }

            void display(){
                System.out.println("ID: " +id);
                System.err.println("Name: " +name);
                System.out.println("Age: " +age);
                System.out.println("Course: " +course);

                System.out.println("-------------------------------");
            }
        }
        
        public class stu_mang_system {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                ArrayList<Student> students = new ArrayList<>();

                while(true){
                System.out.println("\n====== Student Management System ======");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Search Student");
                System.out.println("4. Update Student");
                System.out.println("5. Delete Student");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                
                int choice = sc.nextInt();

                switch(choice){
                    case 1:
                    System.out.print("Enter the Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    students.add(new Student(id , name , age , course));
                    System.out.println("Student Record added Sucessfully!");
                    break;

                    case 2:
                        if(students.isEmpty()){
                            System.out.println("No Student Records Found.");
                        }else {
                            for(Student s : students){
                                s.display();
                            }
                        }
                        break;
                         case 3:
                            System.out.print("Enter Student ID to search: ");
                            int searchId = sc.nextInt();
                            boolean found = false;
                            for(Student s : students){
                                if(s.id == searchId){
                                    s.display();
                                    found = true; break;
                                }
                            }
                            if(!found){
                                System.out.println("Student Not Found.");
                                break;
                            }

                            case 4: 
                            System.out.print("Enter Student ID to Update: ");
                            int updateId = sc.nextInt();
                            sc.nextLine();
                            found = false;
                            for(Student s : students){
                                if(s.id == updateId){
                                    System.out.print("Enter New Name: ");
                                    s.name = sc.nextLine();
                                    System.out.print("Enter New Age: ");
                                    s.age = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Enter New Course: ");
                                    s.course = sc.nextLine();

                                    System.err.println("Record Updated Sucessfully!");
                                    found = true;
                                    break;

                                }
                            }
                            if(!found){
                                System.out.println("Student Not Found.");
                            
                            }
                            break;
                            
                            case 5:
                                System.out.print("Enter Student Id to Delete: ");
                                int deleteId = sc.nextInt();
                                found = false;
                                for(Student s : students){
                                    if(s.id == deleteId){
                                        students.remove(s);
                                        System.out.println("Enter Deleted Sucessfully!");
                                        found = true;
                                        break;
                                    }
                                }
                                if(!found){
                                    System.out.println("Student Not Found!");
                                }
                                break;

                                case 6:
                                    System.out.println("Exiting Program...");
                                    sc.close();
                                    System.exit(0);
                                    break;

                                    default:
                                        System.out.println("Invalid choice!");                      

                }
            }

                
    }
}
