import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        
        int count = 0; 
        

        for (int n = 1; count < N1; n++) {
            int term = 3 * n + 2;
            

            if (term % N2 != 0) {
                System.out.println(term);
                count++;
            }
        }
    }
}
