import java.util.Scanner;

public class Question9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int count = 0;

        if(num<=1){
            System.out.println("It is not a prime number ");
        }

        else{
            for(int i = 2 ; i<=num ; i++){
                if(num%i==0){
                    count++;
                }
                
            }
        

        if(count==1){
            System.out.println("It is a prime number");
        }
        else{
            System.out.print("It is not a prime number");
        }
    }
    sc.close();
}
}