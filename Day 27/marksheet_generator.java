import java.util.Scanner;

class Student{
    String name;
    int rollNo;
    int marks[] = new int[5];

    void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        System.out.println("Enter marks of 5 subjects: ");
        for(int i=0 ; i<5 ;i++){
            System.out.print("Subject " +(i+1) + ": ");
            marks[i] = sc.nextInt();

        }
        sc.close();
    }

    int getTotal(){
        int total = 0 ;
        for(int mark : marks){
            total += mark;
        }
        return total;
    }

    double getPercentage(){
        return getTotal() /5.0;
    }

    String getGrade(){
        double percentage = getPercentage();
        if(percentage >=90)
            return "A+";
        else if(percentage >=80)
            return "A";
        else if(percentage >=70)
            return "B";
        else if(percentage >=60)
            return "C";
        else if(percentage >=50)
            return "D";
        else 
            return "F";
        }

        //Display marksheet
        void displayMarksheet(){
            System.out.println("\n=========MARKSHEET==========");
            System.out.println("Student Name: " +name);
            System.err.println("Roll Numbewr: " +rollNo);

            for(int i=0 ; i<5 ;i++){
                System.out.println("Subject " +(i+1) +"   :" +marks[i]);
            }

            System.out.println("---------------------------------------------");
            System.out.println("Total Marks : " +getTotal() + "/500");
            System.out.println("Percentage : " +getPercentage());
            System.out.println("Grade  : " + getGrade());

            System.out.println("===============================================");

        }

}

public class marksheet_generator{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inputData();
        s1.displayMarksheet();
    }
}