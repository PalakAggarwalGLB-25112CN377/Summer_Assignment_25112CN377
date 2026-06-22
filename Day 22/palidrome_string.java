import java.util.Scanner;

public class palidrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter s string: ");
    String str = sc.nextLine();

    String reverse = "";

    for(int i=str.length() - 1 ; i>=0 ; i--){
        reverse = reverse + str.charAt(i);
    }

    if(str.equals(reverse)){
    System.out.println("It is a palidrome string.");
}
else{
    System.out.println("It is not a palidrome string.");
}

    sc.close();
    }
}
