import java.util.Scanner;

public class hollowRectangle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(i==0 || i==a-1){
                    System.out.print("*");
                }else if(j==0 || j==b-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
