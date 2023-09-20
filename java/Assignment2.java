import java.util.Scanner;

public class Assignment2 {
    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =1;
        for (int i = 0; i <=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(a+"\t");
                a++;
            }
            System.out.println();
        }
    }
}
