import java.util.Scanner;

public class even_odd_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        //create an array
        int arr[] = new int[size];

        //input the array element
        System.out.println("Enter the array element : ");
        for(int i=0 ; i<size ; i++){
        arr[i] = sc.nextInt();
        }

        //even or odd 
        int even = 0;
        int odd = 0;
        for(int i=0 ; i<size ;i++ ){
            if(arr[i]%2 == 0){
                even++;
            }
            else{
                odd++ ;
            }
        }
        System.out.println("Number of even elements = " +even);
        System.out.println("Number of odd elements = " +odd);

        
        sc.close();
    }

    

}



    

