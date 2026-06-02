
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int rem , sum = 0;
      
        
            while(num!=0){
                rem = num % 10;
                sum += rem;
                num = num /10;
            }
        
        System.out.println("The sum of digit of a number = "+sum);

        sc.close();
        
    }
    
}
