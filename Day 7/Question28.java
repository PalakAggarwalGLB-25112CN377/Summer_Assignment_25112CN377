import java.util.Scanner;

public class Question28 {
    public static int reverse (int num , int rev){
        if(num == 0)
            return rev;


        return reverse(num/10 ,rev*10 + num%10 );

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        
        int reversed = reverse(num , 0 );
        System.out.println("The reverse of the number = " + reversed);



        
    }
    
}
