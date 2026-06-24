import java.util.Scanner; 

public class compress_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for(int i=1 ;i<str.length() ; i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }else{
                compressed.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }
        //Add the last character group

        compressed.append(str.charAt(str.length()-1)).append(count);

        System.out.println(compressed.toString());
        sc.close();

    
    }
}
