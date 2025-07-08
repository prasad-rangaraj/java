import java.util.Scanner;

public class rightHalfPyramid {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
