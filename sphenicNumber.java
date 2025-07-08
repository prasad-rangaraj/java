import java.util.Scanner;

public class sphenicNumber {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int flag = 0, org = a, count = 0;
        for (int i = 2; i <= a / 2; i++) {
            flag = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) { 
                if (org % i == 0) {
                    int power = 0;
                    while (org % i == 0) {
                        org /= i;
                        power++;
                    }
                    if (power > 1) {
                        break;
                    }
                    count++;
                }
            }
            if (count > 3) {
                break;
            }
        }
        if (count == 3 && org == 1) {
            System.out.print("Sphenic Number");
        } else {
            System.out.print("Not a Sphenic Number");
        }
    }
}
