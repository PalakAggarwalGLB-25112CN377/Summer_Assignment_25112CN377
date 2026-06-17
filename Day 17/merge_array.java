import java.util.Scanner;

public class merge_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //size of an array1
        System.out.print("Enter the size of an array 1: ");
        int n1 = sc.nextInt();

        //create an array1
        int arr1[] = new int[n1];

        //input the array1 element
        System.out.print("Enter the array1 element :  ");
        for(int i=0 ; i<n1 ;i++){
            arr1[i] = sc.nextInt();
        }
        //size of an array2
        System.out.print("Enter the size of an array 2: ");
        int n2 = sc.nextInt();

        //create an array2
        int arr2[] = new int[n1];

        //input the array2 element
        System.out.print("Enter the array2 element :  ");
        for(int i=0 ; i<n2 ;i++){
            arr2[i] = sc.nextInt();
        }

        //create an merge array
        int merged_array[] = new int[n1+n2];

        //copy elements of arr1
        for(int i=0 ; i<n1 ; i++){
            merged_array[i] = arr1[i];
        }

        //copy elements of arr2 
        for(int i=0 ; i<n2 ; i++){
            merged_array[n1+i] = arr2[i];
        }

        //print merged array
        System.out.print("Merged array: ");
        for(int i=0 ; i<merged_array.length ; i++){
            System.out.print(merged_array[i] + " ");
        }

        sc.close();
    }
}
