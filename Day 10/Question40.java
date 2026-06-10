import java.util.Scanner;

public class Question40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        for(int i=1 ; i<=rows ; i++){
             int space = rows-i;
            for(int j=1 ; j<=space; j++){
                System.out.print(" ");
            }
            for(char ch='A' ; ch<'A'+i; ch++){
                System.out.print(ch);
            }
            for(char ch=(char)('A'+i-2) ;ch>='A' ; ch--){
                System.out.print(ch);
            }
            System.out.println();
        }
       sc.close();
    }
}
