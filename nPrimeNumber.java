import java.util.Scanner;

public class nPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int count = 0, i = 2;
        while (true) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                if (count == a) {
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
    }
}
