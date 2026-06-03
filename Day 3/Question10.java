import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int range = sc.nextInt();

       

        for(int i=1 ; i<=range ; i++){
            int count = 0;
            for(int j=1 ; j<=i ; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i+ " is a prime number");
            }
           
            }
            sc.close();
            
            }
        }


        
