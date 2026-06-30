
import java.util.Scanner;

public class student_record_using_arrays_and_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Numer of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        //Arary to store student data
        int rollNo[] = new int[n];
        String name[] = new String[n];
        String course[] = new String[n];
        
        //Input student records
        System.out.println("\nEnter Students Details: ");
        for(int i=0 ; i<n ;i++){
            System.out.println("\nStudents " +(i+1));
            System.out.print("Enter Roll Number: ");
            rollNo[i] = sc.nextInt();
            sc.nextLine();

            System.err.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Course: ");
            course[i] = sc.nextLine();
        }
        //display student records
        System.out.println("\n------STUDENT RECORDS--------");
        System.out.printf("%-10s %-20s %-20s ","Roll No" , "Name" , "Course");
        System.out.println("\n---------------------------------------------------------------");
        
        for(int i=0 ; i< n ; i++ ){
            System.out.printf("%-10d %-20s %-20s", rollNo[i] , name[i] , course[i]);

        }
        sc.close();

    }
}
