import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num = sc.nextInt();

    int count = 0;

    while(num != 0){
        int remainder = num % 2;
        if(remainder == 1){
            count ++;
        }
        num = num/2;
    }
    System.out.println("Number of set bits = " + count);
    
    sc.close();
    
}
}
