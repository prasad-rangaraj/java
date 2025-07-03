import java.util.Scanner;

public class stairCasePattern {
    public static void main (String[] args) 
	{
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        int k =0;
        for(int i=1;i<=n;i++){
            if(i%2 != 0){
                k += 2;
            }
            for(int j=0;j<k;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}
