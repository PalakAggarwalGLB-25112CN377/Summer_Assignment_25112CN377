import java.util.Scanner;

public class linear_search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //size of an array
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        //create an array
        int arr[] = new int[n];

        //input the array element
        System.out.println("Enter the array element : ");
        for(int i=0 ; i<n ; i++){
        arr[i] = sc.nextInt();
        }

        //input the element to search 
        System.out.print("Enter the element to search : ");
        int key = sc.nextInt();


        //linear search 
        int found = 0;
        for(int i=0 ; i<n ; i++){
            if(arr[i] == key){
                found = 1;
                System.out.println("Element found at position = " + (i+1));
                break;

            }
        }
        if(found == 0){
            System.out.println("Element not found. ");
        }
        sc.close();
    }
}