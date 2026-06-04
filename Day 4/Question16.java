import java.util.Scanner;

public class Question16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range : ");
        int start = sc.nextInt();

        System.out.print("Enter the end of range : ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are ");

        for(int i = start ; i<=end ; i++){
            int originalNum =  i;
            int temp = i;
            int count = 0;
            if(temp == 0){
                count = 1;
            }
            else{
                while(temp!=0){
                temp = temp/10;
                count++;
            }
        }
        temp = originalNum;

        int sum = 0;
        while(temp>0){
            int digit= temp%10;
            sum += (int) Math.pow(digit,count);
            temp = temp/10;
        }
        if(sum==originalNum){
            System.out.print(originalNum + " ");
        }
        }
        sc.close();
        }


    }

