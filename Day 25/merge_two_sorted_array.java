import java.util.Scanner;

public class merge_two_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first sorted array: ");
        int n1 = sc.nextInt();

        //create first array
        int arr1[] = new int[n1];
        
        //input the first sorted array
        System.out.print("Enter the first sorted array: ");
        for(int i=0 ; i<n1 ; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second sorted array: ");
        int n2 = sc.nextInt();

        //create second array
        int arr2[] = new int[n2];
        
        //input the second sorted array
        System.out.print("Enter the second sorted array: ");
        for(int i=0 ; i<n2 ; i++){
            arr2[i] = sc.nextInt();
        }

        //create a merged array
        int merged[] = new int[n1+n2];
        int i=0 , j=0 , k=0;

        while(i < n1 && j < n2){
                if(arr1[i] <= arr2[j]){
                    merged[k++] = arr1[i++];
                }
                else{
                    merged[k++] = arr2[j++];
                    
                }
        }
        
        //copy the remaining elements of arr1
        while(i< n1){
            merged[k++] = arr1[i++];
        }

        //copy the remaining elements of arr2
        while(j< n2){
            merged[k++] = arr2[j++];
        }

        System.out.print("Array after merged : ");
        for(int x=0 ; x<merged.length ; x++){
            System.out.print(merged[x]+ " ");
        }

        sc.close();
    }


        
}

