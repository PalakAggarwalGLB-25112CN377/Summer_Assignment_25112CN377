import java.util.Scanner;

public class remove_duplicate {
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

        System.out.print("Array after removing duplicate: ");
        for(int i=0 ; i<n ; i++){
            boolean isDuplicate = false;

            for(int j=0 ; j<i ; j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }

            }
            if(!isDuplicate){
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
    
}
