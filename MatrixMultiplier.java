import java.util.Scanner;
class GFG { 

    static void printMatrix(int M[][], int rowSize, int colSize) { 
        for (int i = 0; i < rowSize; i++) { 
            for (int j = 0; j < colSize; j++) 
                System.out.print(M[i][j] + " "); 
            System.out.println(); 
        } 
    } 

    static void multiplyMatrix(int row1, int col1, int A[][], int row2, int col2, int B[][]) { 
        int i, j, k; 

        System.out.println("\nMatrix A:"); 
        printMatrix(A, row1, col1); 

        System.out.println("\nMatrix B:"); 
        printMatrix(B, row2, col2); 

        if (col1 != row2) { 
            System.out.println("\nMultiplication impossible."); 
            return; 
        } 
        int C[][] = new int[row1][col2]; 
        for (i = 0; i < row1; i++) { 
            for (j = 0; j < col2; j++) { 
                for (k = 0; k < col1; k++) 
                    C[i][j] += A[i][k] * B[k][j]; 
            } 
        } 

        System.out.println("\nResultant Matrix:"); 
        printMatrix(C, row1, col2); 
    } 

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for Matrix A:");
        int row1 = sc.nextInt();
        System.out.println("Enter the number of columns for Matrix A:");
        int col1 = sc.nextInt();

        int[][] A = new int[row1][col1];
        System.out.println("Enter the elements of Matrix A:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows for Matrix B:");
        int row2 = sc.nextInt();
        System.out.println("Enter the number of columns for Matrix B:");
        int col2 = sc.nextInt();

        int[][] B = new int[row2][col2];
        System.out.println("Enter the elements of Matrix B:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        multiplyMatrix(row1, col1, A, row2, col2, B); 
        sc.close();
    } 
}

// Time complexity: O(M2*N)
