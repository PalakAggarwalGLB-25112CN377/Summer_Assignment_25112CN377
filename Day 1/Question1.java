
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args){
        System.out.print("Enter the natural number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        int i;

        for (i=1 ; i<=num ; i++){
            sum +=i;
        }

        System.out.println("The sum of first natural number is = " +sum);

        sc.close();
    }
    
}
