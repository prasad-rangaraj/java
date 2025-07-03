import java.util.Scanner;

public class halfDiamondPattern {
    public static void main (String[] args) 
	{
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}
