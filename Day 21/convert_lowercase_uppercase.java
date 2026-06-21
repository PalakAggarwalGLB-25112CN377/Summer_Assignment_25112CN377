import java.util.Scanner;

public class convert_lowercase_uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a lowercase string: ");
        String str = sc.nextLine();

        //convert lowercase to uppercase
        String upperstr = str.toUpperCase();

        System.out.println("Uppercase string: " +upperstr);

        sc.close();
    }
}
