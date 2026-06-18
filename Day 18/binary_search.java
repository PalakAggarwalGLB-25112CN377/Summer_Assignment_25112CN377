import java.util.Scanner;

public class binary_search {
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

        //element to be searched
        System.out.print("Enter the element which to be searched: ");
        int element = sc.nextInt();

        int start = 0;
        int end = n-1;
        boolean found = false;
        int mid = 0;

        while(start <= end){
             mid = (start + end)/2;
            if(arr[mid] == element){
                found = true;
                break;
            }
            else if (arr[mid] > element){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if(found){
            System.out.print("Element found at index : " + mid);
        }
        else{
            System.out.print("Element not found");
        }

        sc.close();
    }
}
