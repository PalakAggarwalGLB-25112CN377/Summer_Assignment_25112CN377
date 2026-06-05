import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int originalNum = num;
        int sum = 0;

        if(num<=0){
            System.out.println(num + " is not a strong number.");
        }
        else{
            while(num!=0){
            int digit = num % 10;
            int fact = 1;
            for(int i= 1 ; i<=digit; i++){
                fact *= i; 
            }
            sum += fact;
            num = num/10;

        }
        if(sum == originalNum){
            System.out.println(sum + " is a strong number.");
        }
        else{
            System.out.println(originalNum + " is not a strong number.");
        }
    }
    

        sc.close();


    
    
}
}