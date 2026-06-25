import java.util.Scanner;

public class sort_word_by_length {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String words[] = sentence.split(" ");
        int n = words.length;

        for(int i=0 ; i<n-1 ; i++){
            for(int j=0 ; j< n-i-1 ;j++){
                if(words[j].length() > words[j+1].length()){
                    //swap
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }
        //print
        for(int i=0; i<n ;i++){
            System.out.print(words[i]+ " ");
        }
        sc.close();
    }
}
