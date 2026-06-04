import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nth term : ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Please Enter a positive term.");
        }else if (n == 1){
                System.out.println(n+ "  Fibonacci term : 0");
            }else if(n == 2){
                System.out.println(n+ "  Fibonnaci term : 1");
            }else{
                int first = 0 , second = 1;
                for(int i = 3 ; i<=n ; i++){
                    int next = first + second;
                    first = second;
                    second = next;
                }
                
                System.out.println(n+ " Fibonacci term : " +second);
               
            sc.close();
    }
    
}
}
