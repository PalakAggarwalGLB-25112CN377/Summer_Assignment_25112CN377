import java.util.Scanner;

public class Function_of_fibonacci{

    public static void fibonacci(int terms){
        int first = 0;
        int second = 1;
       for(int i=1 ; i<=terms ; i++){
        System.out.println(first + " " );
        int next = first + second;
        first = second;
        second = next;
    }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int terms = sc.nextInt();
        fibonacci(terms);

        sc.close();
    }
}