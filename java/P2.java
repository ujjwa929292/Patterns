import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nst = 1;
        //int nsp = 0;
        int row=n;

        for (int i=1; i<=row; i++) {
            //for star
            for (int csp=1;csp<=nst; csp++) {
                System.out.print("*");
            }
        System.out.println(" ");
        nst++;
        }
    }
}
