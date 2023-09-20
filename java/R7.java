import java.util.Scanner;

public class R7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int U = scanner.nextInt();

        // int a = 0, b = 1;

        // for (int i = 1; i <= N; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(a + "\t");
        //         int c = a + b;
        //         a = b;
        //         b = c;
        //     }
        //     System.out.println();
        // }

        for(int i =1;i<=U;i++) {
            for(int j=1;j<=U-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=U;j++) {
                if(i==1||i==U||j==1||j==U){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
