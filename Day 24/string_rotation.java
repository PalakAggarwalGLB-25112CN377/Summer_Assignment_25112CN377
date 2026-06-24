import java.util.Scanner;

public class string_rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter secong string: ");
        String str2 = sc.nextLine();

        if(str1.length() == str2.length() && (str1 + str1).contains(str2)){
            System.out.print("The strings are rotations of each other");
        }
        else{
            System.out.print("The strings are not rotations of each other");
        }

       
            sc.close();
        }
    }
