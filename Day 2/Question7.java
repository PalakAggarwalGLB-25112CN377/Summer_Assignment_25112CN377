 import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        int rem , product = 1 ;

        while(num!=0){
            rem = num % 10;
            product = product*rem;
            num = num /10 ;
        }

        System.out.println("The product of number = "+product);


    
    sc.close();
}

}
    
        

