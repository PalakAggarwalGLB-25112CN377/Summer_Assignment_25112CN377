import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Binary number : ");
        int binary = sc.nextInt();

        int decimal = 0;
        int weight = 1;

        while(binary != 0){
            int remainder = binary % 10;
            decimal = decimal + remainder*weight;
            binary = binary / 10;
            weight *= 2;

        }

        System.out.println("Decimal Equivalent = " +decimal);
        sc.close();
    }
    
}
