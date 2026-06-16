import java.util.Scanner;

public class max_frequency_element {
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

        int maxFrequency = 0;
        int maxElement = arr[0];

        for(int i=0 ; i<n ; i++){
            int count = 1 ;
            for(int j=i+1 ; j<n ; j++){
                if(arr[i] == arr[j]){
                    count++ ;
                }
            }
            if(count > maxFrequency){
                maxFrequency = count;
                maxElement = arr[i];
            }
        }
        System.out.println("Element with maximum frequency : " + maxElement);
        System.out.println("Maximum freuency : " + maxFrequency);

        sc.close();

    }
}
