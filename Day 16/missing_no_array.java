import java.util.Scanner;

public class missing_no_array {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        //size of the array when one no.is missing
        int size = end - start;

        //create an array
        int arr[] = new int[size];
        int actualSum = 0;

        //input the array element
        System.out.print("Enter the array element :  ");
        for(int i=0 ; i<size ;i++){
            arr[i] = sc.nextInt();
            actualSum += arr[i];
        }

        int expectedSum = 0;
        for(int i = start ; i<=end ; i++){
            expectedSum += i;
        }
        System.out.println("Missing number = " +(expectedSum - actualSum));

        sc.close();
    }
}
        