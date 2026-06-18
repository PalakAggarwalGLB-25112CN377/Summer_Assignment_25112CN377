import java.util.Scanner;

public class bubble_sort {
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
            for(int j=0 ; j<n-1-i ; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                    
            }
        }

        System.out.print("after sorting the array : ");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }









}

