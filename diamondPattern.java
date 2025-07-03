import java.util.Scanner;

public class diamondPattern {
	public static void main (String[] args) 
	{
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n-1;i++){
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
           for(int k=0;k<i;k++){
               System.out.print(" ");
           }
           for(int j=n- i;j>0;j--){
               System.out.print("* ");
           }
           System.out.println();
       }
	}
}
