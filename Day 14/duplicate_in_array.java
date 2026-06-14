import java.util.Scanner;

public class duplicate_in_array {
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

        System.out.print("Duplicate elements are : ");

        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ;j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                    break;
                }
                
            }
        }
        sc.close();
    }

}
