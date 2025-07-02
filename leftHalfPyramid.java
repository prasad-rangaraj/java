import java.util.Scanner;

public class leftHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i=0;i<num;i++){
            for(int k=0;k<num-i;k++){
                System.out.print("  ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
