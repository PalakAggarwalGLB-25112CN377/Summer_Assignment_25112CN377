import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //size of an array
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        //create an array
        int arr[] = new int[n];

        //input the array element
        System.out.print("Enter the array element :  ");
        for(int i=0 ; i<n ;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0 ; i<n/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        System.out.print("Reverse array : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
