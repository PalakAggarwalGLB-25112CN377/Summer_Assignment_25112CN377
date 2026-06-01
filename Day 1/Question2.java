
import java.util.Scanner;

public class Question2{

    public static void main(String[] args){

        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("The  Multiplication table of given number is : ");

        for(int i=1 ; i<=10 ; i++){
           
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}