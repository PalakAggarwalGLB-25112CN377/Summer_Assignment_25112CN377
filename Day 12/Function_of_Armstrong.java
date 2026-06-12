import java.util.Scanner;

public class Function_of_Armstrong {
    public static boolean isArmstrong(int num){
        int originalNum = num;
        int temp = num;
        int count = 0;
        if(num==0)
            count = 1;
        else{
            while(num!=0){
                num=num/10;
                count++;
            }
        }
        
        int sum = 0;
        while(temp!=0){
            int rem = temp%10;
            sum += Math.pow(rem,count);
            temp /= 10;
        }
        
        return originalNum == sum;

    }
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(isArmstrong(num)){
            System.out.println(num + " is a Armstrong number ");
        }
        else{
            System.out.println(num + " is not a Armstrong number ");

        }
        sc.close();

    }
}

    
