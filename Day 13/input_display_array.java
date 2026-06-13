import java.util.Scanner;

public class input_display_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        // create the array
        int arr[] = new int[size];

        //input array elements
        System.out.print("Enter the array element : ");
        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        
        //display array elements
        for(int i=0 ; i<size ; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
    
}
