import java.util.Scanner;

public class Question37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        for(int i=1 ; i<=rows ; i++){
             int space = rows-i;
            for(int j=1 ; j<=space; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
       sc.close();
    }
}
