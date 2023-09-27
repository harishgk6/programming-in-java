import java.util.Scanner;
public class NumPat{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(combination(i, j) + "   ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(combination(i, j) + "   ");
            }
            System.out.println();
        }
    }
    public static int combination(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return combination(n - 1, k - 1) + combination(n - 1, k);
        }
    }
}
