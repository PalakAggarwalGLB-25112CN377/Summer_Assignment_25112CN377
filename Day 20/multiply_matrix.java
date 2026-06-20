import java.util.Scanner;

public class multiply_matrix{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        //enter the rows of the matrix1
        System.out.print("Enter the rows of the matrix1: ");
        int rows1 = sc.nextInt();

        //enter the columns of the matrix1
        System.out.print("Enter the column of the matrix1: ");
        int column1 = sc.nextInt();

        //create a matrix1
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

        //create a matrix2

        int matrix2[][] = new int[rows2][column2];

         //enter the element of matrix 2
        System.err.println("Enter the element of the matrix2: ");
        for(int i=0 ; i<rows2 ; i++){
            for(int j=0 ; j<column2 ; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        if(column1 != rows2){
          System.out.println("Matrix multiplication is not possible.");
        }
        else{
             int result[][] = new int[rows1][column2];
             //Matrix multiplication
             for(int i=0 ; i<rows1 ; i++){
                for(int j=0 ; j<column2 ; j++){
                    for(int k=0 ; k<column1 ; k++){
                        result[i][j] += matrix1[i][k] * matrix2[k][j];

                    }
                }
             }

        

        //display
        System.out.println("Resultant matrix:");
        for(int i=0 ; i<rows1 ; i++){
            for(int j=0 ; j<column2 ; j++){
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
        }
        sc.close();
    }
}