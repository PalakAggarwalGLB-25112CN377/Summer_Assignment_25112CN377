import java.util.Scanner;

public class common_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //size of an array1
        System.out.print("Enter the size of an array 1: ");
        int n1 = sc.nextInt();

        //create an array1
        int arr1[] = new int[n1];

        //input the array1 element
        System.out.print("Enter the array1 element :  ");
        for(int i=0 ; i<n1 ;i++){
            arr1[i] = sc.nextInt();
        }
        //size of an array2
        System.out.print("Enter the size of an array 2: ");
        int n2 = sc.nextInt();

        //create an array2
        int arr2[] = new int[n1];

        //input the array2 element
        System.out.print("Enter the array2 element :  ");
        for(int i=0 ; i<n2 ;i++){
            arr2[i] = sc.nextInt();
        }

        //find common element
        System.out.print("The common element : ");
        for(int i=0 ; i<n1 ; i++){
            for(int j=0 ; j<n2 ; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+ " ");
                }
            }
        }
        sc.close();
    }
}

