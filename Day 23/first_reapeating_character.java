import java.util.Scanner;

public class first_reapeating_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean found = false;

        for(int i=0 ; i<str.length() ; i++){
            for(int j=i+1 ; j<str.length() ; j++){
                if(str.charAt(i) == str.charAt(j)){
                    System.out.print("First non-repeating character: " +str.charAt(i));
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
            
        }
        if (!found){
            System.out.print("No repeating character found ");
            
        }
        sc.close();
    }
}

