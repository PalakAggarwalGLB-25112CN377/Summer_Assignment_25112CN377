import java.util.Scanner;

public class Function_of_maximum{

    public static int maximum(int num1 , int num2){
        if(num1 > num2)
            return num1;
        else
            return num2;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        int result = maximum(num1 , num2);
        System.out.println("The maximum number is " +result);

        sc.close();

    }
}
