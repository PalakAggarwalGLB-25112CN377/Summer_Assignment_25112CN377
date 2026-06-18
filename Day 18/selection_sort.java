import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        //size of an array1
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        //create an array1
        int arr[] = new int[n];

        //input the array1 element
        System.out.print("Enter the array element :  ");
        for(int i=0 ; i<n ;i++){
            arr[i] = sc.nextInt();
        }

        //sorting
        for(int i=0 ; i<n-1 ; i++){
            int smallest = i;
            for(int j=i+1 ; j<n ; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.print("After sorting the array: ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }


        sc.close();
    }
}
