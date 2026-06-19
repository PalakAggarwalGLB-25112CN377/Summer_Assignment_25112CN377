import java.util.Scanner;

public class matrix_transpose {
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

        System.out.println("Transpose of the matrix: ");

        for(int i=0 ; i<column ; i++){
            for(int j=0 ; j<row ; j++){
                System.out.print(trans_matrix[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
