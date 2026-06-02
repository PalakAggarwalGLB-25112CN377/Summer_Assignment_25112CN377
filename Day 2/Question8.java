import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num1 = sc.nextInt();


        int rem , rev = 0 ;
        int num2=num1;

        while(num2!=0){
            rem = num2%10;
            rev = rev*10 + rem;
            num2 = num2/10;
        }

        if(num1==rev){
            System.out.println("The number is a palidrome");

        }
        else{
            System.out.println("The number is not palidrome");
        }
        sc.close();
    }
    
}
