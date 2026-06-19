import java.util.Scanner;

public class diagonal_sum {
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

        int sum = 0;
        

        if(rows == column){
            for(int i=0 ; i<rows ; i++){
                for(int j=0 ; j<column ; j++){
                    if(i==j || i+j == rows - 1){
                        sum += matrix[i][j]; 
                    }
                }
            }
        }

        else{
            System.out.print("The sum of diagonal element is not possible.");
        }

        System.out.print("The sum of the diagonal element : " + sum);

        sc.close();

    }
}
