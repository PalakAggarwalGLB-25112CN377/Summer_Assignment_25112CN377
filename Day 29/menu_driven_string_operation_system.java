import java.util.Scanner;

class StringOperations {
    private String str;

    // method to input string
    public void inputString(String s) {
        str = s;
    }

    public int getLength() {
        return str.length();
    }

    public String toUpper() {
        return str.toUpperCase();
    }

    public String toLower() {
        return str.toLowerCase();
    }

    public String reverse() {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public boolean isPalindrome() {
        return str.equalsIgnoreCase(reverse());
    }
}

public class menu_driven_string_operation_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringOperations obj = new StringOperations();

        while (true) {
            System.out.println("\n===== STRING MENU =====");
            System.out.println("1. Input String");
            System.out.println("2. Length");
            System.out.println("3. Uppercase");
            System.out.println("4. Lowercase");
            System.out.println("5. Reverse");
            System.out.println("6. Palindrome Check");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter string: ");
                    obj.inputString(sc.nextLine());
                    break;

                case 2:
                    System.out.println("Length: " + obj.getLength());
                    break;

                case 3:
                    System.out.println("Uppercase: " + obj.toUpper());
                    break;

                case 4:
                    System.out.println("Lowercase: " + obj.toLower());
                    break;

                case 5:
                    System.out.println("Reverse: " + obj.reverse());
                    break;

                case 6:
                    if (obj.isPalindrome())
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not Palindrome");
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}