import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int min = Math.min(num1,num2);

        int gcd=1;

        for(int i=1 ; i<=min ; i++){
            if(num1%i==0 && num2%i==0){
                 gcd = i;
            }
        }
        System.out.println("The GCD of the " +num1+ " and "  +num2+ " is " +gcd);

        sc.close();


    }
    
}
