import java.util.Scanner;

public class invertedPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int h=1;
        for(int i=num;i>=0;i--){
            for(int k=0;k<num-i;k++){
                System.out.print("  ");
            }
            for(int j=0;j<2*num-h;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            h += 2;
        }
    }
}
