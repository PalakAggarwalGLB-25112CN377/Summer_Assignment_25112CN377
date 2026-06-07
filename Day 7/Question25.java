import java.util.Scanner;
public class Question25 {
public static int calfactorial(int num){
    if(num == 1 || num == 0)
        return 1;

    int factorial = calfactorial(num - 1);
    int result = num * factorial;
    return result;
}

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        calfactorial(num);
         int ans = calfactorial(num);
        System.out.println("The factorial of " + num + " is " + ans );

    }
}
