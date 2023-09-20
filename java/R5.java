import java.util.Scanner;

public class R5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int U = sc.nextInt();
        
        for (int i = 1; i <= U; i++) {
            for (int j = 1; j <= U - i; j++) {
                System.out.print("\t");
            }
            
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j + "\t");
            }
            
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j + "\t");
            }
            
            System.out.println();
        }
    }
}
