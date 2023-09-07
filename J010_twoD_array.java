import java.util.*;

public class J010_twoD_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter Row number : ");
        int row = sc.nextInt();
        System.out.print("\nEnter coloumn number : ");
        int col = sc.nextInt();

        // Declaring 2D-Array matrix
        int [][] matrix = new int [row][col];

        // Initializing 2D-Array
        System.out.println("\nEnter matrix : \n");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        // Displaying matrix
        System.out.println("\nEntered matrix is : \n");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
