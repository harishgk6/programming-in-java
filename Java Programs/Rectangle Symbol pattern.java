import java.util.Scanner;

public class Symbol{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the symbol to create the rectangle pattern: ");
        char symbol = scanner.next().charAt(0);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
