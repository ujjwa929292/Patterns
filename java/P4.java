import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n-1;
        int row = n;

        for (int i=1; i<=row; i++) {
            //for space
            for(int csp=1; csp <= nsp; csp++)
            {
                System.out.print(" ");
            }
            //for star
            for (int cst=1; cst <=nst; cst++)
            {
                System.out.print("*");
            }
            System.out.println();
            nst++;
            nsp--;
        }
    }
}
