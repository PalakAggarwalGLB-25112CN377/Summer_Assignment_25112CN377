import java.util.Scanner;

public class pair_with_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;

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

        //sum 
        System.out.print("Enter the sum : ");
        int sum = sc.nextInt();

        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i] + arr[j] == sum){
                    System.out.print("pair found: " + arr[i] + " , " + arr[j]);
                    found = true;
                    break;
                }
            }
            if(found){
            break;
        }
    }
    if(!found){
        System.out.print("pair not found");
    }
        sc.close();
    }
}
