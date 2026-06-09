import java.util.Scanner;

public class Question36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of column : ");
        int column = sc.nextInt();

        for(int i=1 ; i<=rows ; i++){
            for(int j=1 ; j<=column ; j++){
                if(i == 1 || i == rows || j == 1 ||j == column ){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
