import java.util.Scanner;

public class Question26 {
    public static void fibonacci(int a , int b , int num){
        if(num == 0)
            return;
        int c = a + b;
        System.out.println(c);
        fibonacci(b , c , num - 1 );


    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the terms : ");
    int num = sc.nextInt();

    int a = 0 , b = 1;
    System.out.println(a);
    System.out.println(b);
    fibonacci(a , b , num - 2);

}



    
}
