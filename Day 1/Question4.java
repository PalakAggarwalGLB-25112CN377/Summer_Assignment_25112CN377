import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        if(num == 0){
            count = 1;
        }
        else {
            while(num!=0){
                num = num/10;
                count++;
            }
        }
            System.out.print("Number of digits = " +count);
        
        sc.close();
    }
    
}
