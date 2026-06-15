import java.util.Scanner;

public class move_zeroes_to_end {
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
        int index = 0;

        //Move non-zero elements to the front
        for(int i=0 ; i<n ; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
            //fill the remaining positions with the zeroes
            while(index < n){
                arr[index] = 0;
                index++;
            }

            System.out.print("Array after moving zeroes to the end: ");
            for(int num : arr){
                System.out.print(num + " ");
            }
            sc.close();

        
    }
}
