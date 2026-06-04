import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int originalNum = num;
        int temp = num;

        int count = 0;
        if(temp== 0){
            count = 1;
        }
        else{
            while(temp!=0){
                temp = temp/10;
                count++;
            }
        }
        
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum += Math.pow(digit,count);
            num = num/10;
        }
        if(sum == originalNum){
            System.out.println(originalNum+ " is a Armstrong number. ");
         }
         else{
                System.out.println(originalNum+ " is not a Armstrong number.");
            }
        
        sc.close();
    }
    
}
