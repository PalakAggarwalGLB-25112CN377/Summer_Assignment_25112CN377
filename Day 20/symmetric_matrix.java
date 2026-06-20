import java.util.Scanner;

public class symmetric_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //enter the rows of the matrix
        System.out.print("Enter the rows of the matrix: ");
        int row = sc.nextInt();

        //enter the columns of the matrix1
        System.out.print("Enter the column of the matrix: ");
        int column = sc.nextInt();

        //create a matrix
        int matrix[][] = new int[row][column];

        //enter the element of matrix 1
        System.err.println("Enter the element of the matrix1: ");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //create a transpose matrix
        int trans_matrix[][] = new int[column][row];

        //finding transpose
        for(int i=0 ; i<row ; i++){
             for(int j=0 ; j<column ; j++){
                trans_matrix[j][i] = matrix[i][j];
            }
        }

        boolean found = false;
        //to  check equal or not
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                if(matrix[i][j] == trans_matrix[j][i]){
                 found = true;
                }

            }
        }
        if(found){
            System.out.print("It is a symmetric matrix");
        }
        else{
            System.out.print("It is not a symmetric matrix");
        }
        
        sc.close();
    }
}
