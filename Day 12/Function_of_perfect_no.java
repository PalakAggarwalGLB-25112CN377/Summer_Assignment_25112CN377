import java.util.Scanner;

public class Function_of_perfect_no {
    public static boolean isperfect(int num){
        int sum = 0;
        
        for(int i=1 ; i<num ; i++){
            if(num%i==0){
                sum += i;
            }
        }
        if(sum==num){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(isperfect(num)){
            System.out.println(num + " is a perfect number ");
        }
        else{
            System.out.println(num + " is not  a perfect number ");
        }

        sc.close();
    }
    
}
