import java.util.Scanner;

public class Assignment3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cspace = n / 2;
        int cstar = 0;
        int row_no = 1;
        
        while (row_no <= n) {
            int left = 1;
            while (left <= cspace) {
                System.out.print("\t");
                left = left + 1;
            }

            int star = 1;
            while (star <= cstar) {
                System.out.print("*\t"); // Print stars (*) instead of tabs (\t)
                star = star + 1;
            }

            int right = 1;
            while (right <= cspace) {
                System.out.print("\t");
                right = right + 1;
            }

            if (row_no < (n / 2 + 1)) {
                cspace = cspace - 1;
                cstar = cstar + 2;
            } else {
                cspace = cspace + 1;
                cstar = cstar - 2;
            }
            
            row_no = row_no + 1;
            System.out.println();
        }
    }
}
