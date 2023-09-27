import java.util.Scanner;
public class MatrixMul{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mat1, mat2;
        System.out.print("Enter the number of rows for Matrix 1: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix 1: ");
        int cols1 = scanner.nextInt();

        System.out.print("Enter the number of rows for Matrix 2: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix 2: ");
        int cols2 = scanner.nextInt();

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. The number of columns in Matrix 1 must be equal to the number of rows in Matrix 2.");
        } else {
            mat1 = new int[rows1][cols1];
            mat2 = new int[rows2][cols2];

            System.out.println("Enter elements for Matrix 1:");
            inputMatrix(mat1, scanner);

            System.out.println("Enter elements for Matrix 2:");
            inputMatrix(mat2, scanner);

            int[][] result = multiplyMatrices(mat1, mat2);

            System.out.println("Matrix Multiplication Result:");
            printMatrix(result);
        }

        scanner.close();
    }
    public static void inputMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int cols2 = mat2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
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
