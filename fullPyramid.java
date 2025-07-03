import java.util.Scanner;

public class fullPyramid {
	public static void main (String[] args) 
	{
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}
