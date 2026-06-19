import java.util.Scanner;

public class matrix_subtract{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        //enter the rows of the matrix1
        System.out.print("Enter the rows of the matrix1: ");
        int rows1 = sc.nextInt();

        //enter the columns of the matrix1
        System.out.print("Enter the column of the matrix1: ");
        int column1 = sc.nextInt();

        //create a matrix
        int matrix1[][] = new int[rows1][column1];

        //enter the element of matrix 1
        System.err.println("Enter the element of the matrix1: ");
        for(int i=0 ; i<rows1 ; i++){
            for(int j=0 ; j<column1 ; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        //enter the rows of the matrix2
        System.out.print("Enter the rows of the matrix2: ");
        int rows2 = sc.nextInt();

        //enter the columns of the matrix2
        System.out.print("Enter the column of the matrix2: ");
        int column2 = sc.nextInt();

        //create a matrix
        int matrix2[][] = new int[rows2][column2];

         //enter the element of matrix 2
        System.err.println("Enter the element of the matrix2: ");
        for(int i=0 ; i<rows2 ; i++){
            for(int j=0 ; j<column2 ; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        //create a subtract matrix
        int addMatrix[][] = new int[rows1][column1];

        if(rows1 != rows2 || column1 != column2){
            System.out.print("The addition of these matrix is not possible. ");
        }
        else{
            for(int i=0 ; i<rows1 ; i++){
                for(int j=0 ; j<column1 ; j++){
                    addMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }

            //display the result
            System.out.print("The matrix after addition: ");
            System.err.println();
            for(int i=0 ; i<rows1 ; i++){
                for(int j=0 ; j<column1 ; j++){
                    System.out.print(addMatrix[i][j] + " ");
                }
                System.out.println();
            }

        }

        sc.close();
        
    } 
    
}
