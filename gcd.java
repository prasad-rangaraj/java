import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int min = Math.min(a, b);
        int gcd = 1;

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        if (gcd == 1) {
            System.out.print("No gcd");
        } else {
            System.out.print(gcd);
        }
    }
}
