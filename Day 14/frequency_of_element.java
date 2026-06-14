import java.util.Scanner;

public class frequency_of_element {
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
            //input element to find frequency 
            System.out.print("Enter the element to find frequency : ");
            int element = sc.nextInt();

            int count = 0;
            for(int i=0 ; i<n ; i++){
                if(arr[i] == element)
                    count++;
            }

            //result
            System.out.println("Frequency of " + element + " is " + count);
        
        sc.close();
    }
}
