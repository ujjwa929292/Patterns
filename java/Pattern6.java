import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Top half of the pattern
        for (int i = N; i >= 0; i--) {
            // Print leading spaces
            for (int j = N; j > i; j--) {
                System.out.print("  "); // Two spaces for each position
            }
            
            // Print decreasing numbers
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            
            // Print increasing numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }

        // Bottom half of the pattern (excluding middle row)
        for (int i = 1; i <= N; i++) {
            // Print leading spaces
            for (int j = N; j > i; j--) {
                System.out.print("  "); // Two spaces for each position
            }
            
            // Print decreasing numbers
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            
            // Print increasing numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}
