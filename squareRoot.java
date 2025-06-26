import java.util.Scanner;

public class squareRoot {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int temp = 0;
        boolean flag = false;

        for (int i = 1; i <= a / 2; i++) {
            if (i * i == a) {
                flag = true;
                temp = i;
                break;
            } else if (i * i < a) {
                temp = i;
            }
        }
        if (a == 1 || a == 2) {
            System.out.println(1);
        } else if (flag) {
            System.out.println(temp); 
        } else {
            System.out.println(temp);
        }
    }
}
