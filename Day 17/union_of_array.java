import java.util.Scanner;

public class union_of_array {
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

        //create an merge array
        int union[] = new int[n1+n2];
        int k=0; //actual number of union elements

        //store the unique elements from arr1
        for(int i=0 ; i< n1 ; i++){
            boolean found = false;
            for(int j=0 ; j<i ; j++){
                if(arr1[i] == arr1[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                union[k] = arr1[i];
                k++;
            }
        }

        //store elements from arr2 that are not already in union
        for(int i=0 ; i<n2 ; i++){
            boolean found = false;
            for(int j=0 ; j<k ; j++){
                if(arr2[i] == union[j]){
                    found = true;
                break;
            }
        }
        if(!found){
            union[k] = arr2[i];
            k++;
        }

        
    }

    //print the union array
    System.out.print("Union: ");
    for(int i=0 ; i<k ; i++){
        System.out.print(union[i] + " ");
    }
    sc.close();
}
}
