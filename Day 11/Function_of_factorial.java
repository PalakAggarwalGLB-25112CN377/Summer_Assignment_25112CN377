import java.util.Scanner;

public class Function_of_factorial {
    public static int factorial(int num ){
        int fact = 1;
        for(int i=1 ; i<=num ; i++){
            fact*= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();


        System.out.println("Factorial of " + num + " is " + factorial(num));

        sc.close();


    }
    
}
