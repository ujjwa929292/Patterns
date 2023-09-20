import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean result = armstrong(number);
        
        System.out.println(result);
    }

    public static boolean armstrong(int num) {
        int originalNumber = num;
        int sum = 0;

        int numberOfDigits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return sum == originalNumber;
    }
}
