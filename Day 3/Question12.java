import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1= sc.nextInt();

        System.err.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int max = Math.max(num1,num2);

        while(true){
            if(max % num1==0 && max % num2==0){
                System.out.println("The LCM of the " +num1+ " and " +num2+ " is " +max);
                break; 
            }
            max++;
        }
        sc.close();

    }
    
}
