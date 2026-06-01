
import java.util.Scanner;


public class Question3 {

    public static void main(String[] args) {
        System.out.print("Enter the number = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int fact = 1;
        for(int i=1 ; i<=num ; i++){
            fact *=i;

        }
        System.out.print("The factorial of given number is = "+fact);

        sc.close();

        
    }
    
}
