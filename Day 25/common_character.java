import java.util.Scanner;

public class common_character {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.print("Common characters: ");

        for (int i = 0; i < str1.length(); i++) {

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (str1.charAt(i) == str1.charAt(k)) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    System.out.print(str1.charAt(i) + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}