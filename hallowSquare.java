import java.util.Scanner;

public class hallowSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(i == 0 || i == num-1 || j == 0 ||  j == num- 1 ){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
