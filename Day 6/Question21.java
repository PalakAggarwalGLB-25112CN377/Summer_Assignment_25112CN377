import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int decimal = sc.nextInt();

        int place = 1;
        int bin = 0;

        if(decimal == 0){
            System.out.println("Binary equivalent : 0");
        }
        else{
            while(decimal > 0){
                int remainder = decimal%2;
                bin = bin + remainder*place;
                place *= 10;
                decimal = decimal/2;
            }
            System.out.print("Binary equivalent : " + bin);
        }
        sc.close();
        
    }
}
    
