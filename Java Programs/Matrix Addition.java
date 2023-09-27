public class MatrixAdd{
    public static void main(String[] args) {
        int[][] mat1 = {
            {1, 2},
            {5, 3}
        };
        int[][] mat2 = {
            {2, 3},
            {4, 1}
        };
        int[][] result = addMatrices(mat1, mat2);

        System.out.println("Matrix Sum:");
        printMatrix(result);
    }

    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
