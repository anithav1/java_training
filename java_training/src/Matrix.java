public class Matrix {
    public static void main(String[] args) {

        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrixB = {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
        };


        int[][] resultMatrix = addMatrices(matrixA, matrixB);


        System.out.println("Result Matrix (A + B):");
        printMatrix(resultMatrix);
    }


    private static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;


        int[][] result = new int[rows][cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }


    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
