import java.util.Scanner;

public class first_non_repeating_character{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean found = false;

        for(int i=0 ; i<str.length() ; i++){
            int count = 0; 
            for(int j=0; j<str.length() ; j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                char firstNonRepeating = str.charAt(i);
                System.out.print("First non-repeating character: " +firstNonRepeating);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.print("No non-repeating character found ");
            
        }
                               
        
        sc.close();
    }
}
