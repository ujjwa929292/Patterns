import java.util.Scanner;

public class ASSIGNMENT {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pow=0;
        int dec=0;
        int r=0;
        while(n>0){
            r=n%10;
            n=n/10;
            dec+=Math.pow(2,pow)*r;
            pow++;
        }
        System.out.print(dec);
    }
}
