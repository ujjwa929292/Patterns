import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 5;
        int nsp = 0;
        int row = n;

        for(int i = 1; i <= row; i++) {

            //for star
            for (int cst=1;cst <= nst; cst++) {
                System.out.print("*");
            }
            System.out.println(" ");
            nst--;
        }
    }
}
