import java.util.Scanner;
import java.util.Arrays;

public class check_anagram_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter a second string: ");
        String str2 = sc.nextLine();

        //remove spaces or convert to lower case
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();

        if(str1.length() != str2.length()){
            System.out.println("It is not a Anagram");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("It is a Anagram");
        }else{
            System.out.println("It is not a Anagram");
        }
        sc.close();
    }
}
