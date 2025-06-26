import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int c=1;
        for(int i=1;i<=a;i++){
            c *= i;
        }
        System.out.print(c);
    }
}
