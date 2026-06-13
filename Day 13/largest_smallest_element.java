import java.util.Scanner;

public class largest_smallest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        //create an array
        int arr[]= new int[size];

        //input array element
        System.out.println("Enter the array element : ");
        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }

        //Assume first element is both largest and smallest
        int largest = arr[0];
        int smallest = arr[0];

        for(int i=0 ; i<size ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        //result
        System.out.println("The largest element = " + largest);
        System.out.println("The smallest element = " + smallest);

        sc.close();
    }
    
}
