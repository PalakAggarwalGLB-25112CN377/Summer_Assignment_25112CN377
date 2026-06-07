import java.util.Scanner;

public class Question27 {

    public static int printsum(int i , int sum, int num){
        if(i == num){
            sum += i;
        return sum;
    }

        sum += i;
        return printsum(i+1 , sum, num);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        
        printsum(1 , 0 , num);

        int result = printsum(1 , 0 , num);
        System.out.println("The sum of the given number = " + result);
        
    }
    
}
