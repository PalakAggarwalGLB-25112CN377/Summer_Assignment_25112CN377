import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int sum = 0;

        if(num<=0){
            System.out.println(num + " is not a perfect number.");
        }
        else{
            for(int i = 1 ; i< num ;i++){
                if(num%i==0){
                    sum += i;
                }
            }
        
        if(num == sum){
            System.out.println(num + " is a perfect number.");
        }else{
            System.out.println(num + " is not a perfect number.");
        }
        }
    
    sc.close();
    }
    
}
