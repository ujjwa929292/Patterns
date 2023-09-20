import java.util.Scanner;

public class R6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        int nst = 3;
        int nsp = 1;
        int row = n;

        for (int i = 1; i <= row; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
            } else {
                for (int cst = 1; cst <= nst; cst++) {
                    System.out.print("*\t");
                }
                for (int csp = 1; csp <= nsp; csp++) {
                    System.out.print("\t");
                }
                for (int cst = 1; cst <= nst; cst++) {
                    System.out.print("*\t");
                }
                System.out.println();
                if (i <= row / 2) {
                    nsp += 2;
                    nst--;
                } else {
                    nsp -= 2;
                    nst++;
                }
            }
        }
    }
}
