import java.util.Scanner;

public class row_wise_sum {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);

        //enter the rows of the matrix
        System.out.print("Enter the rows of the matrix: ");
        int rows = sc.nextInt();

        //enter the columns of the matrix
        System.out.print("Enter the column of the matrix: ");
        int column = sc.nextInt();

        //create a matrix
        int matrix[][] = new int[rows][column];

        //enter the element of matrix 
        System.err.println("Enter the element of the matrix: ");
        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<column ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //find row wise sum
        System.out.println("Rows wise sum are : ");
        for(int i=0 ; i<rows ; i++){
            int sum = 0;
            for(int j=0 ; j<column ; j++){
                sum += matrix[i][j];
            }
            System.out.println("Sum of row" +(i+1)+ " = " +sum);
        }
        sc.close();
    }
}
