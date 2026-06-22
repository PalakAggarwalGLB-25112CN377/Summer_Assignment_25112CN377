import java.util.Scanner;

public class character_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int freq[] = new int[256];

        //count frequency of each character
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }

        //print frequency of each character
        System.out.println("Character Frequencies: ");
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);

            if(freq[ch] != 0){
                System.out.println(ch + " : " +freq[ch]);
                freq[ch] = 0; //prevent duplicate printing
            }
        }
        sc.close();
    }
}
