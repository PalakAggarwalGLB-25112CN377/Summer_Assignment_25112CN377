import java.util.Scanner;

public class sum_avg_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        //create an array
        int arr[] = new  int[size];

        //input the array elements
        System.out.print("Enter the array element : ");
        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }

        //sum of the array
        int sum = 0;
        for(int i=0; i<size ; i++){
            sum += arr[i];
        }
        System.out.println("The sum of the array = " + sum);

        //average of the array
        float avg = (float)sum/size;

        System.out.print("The average of the array = " +avg);



        sc.close();
    
    }
    
}
