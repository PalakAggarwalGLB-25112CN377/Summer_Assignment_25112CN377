import java.util.Scanner;

public class rotate_array_left {
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
        int first = arr[0];
        
        //shift elements to the left
        for(int i=0 ; i<n-1 ;i++){
            arr[i] = arr[i+1];
        }

        arr[n-1] = first;

        System.out.print("Array after left rotation: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        sc.close();
    }
}
