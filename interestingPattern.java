import java.util.Scanner;

public class interestingPattern {
    public static void main (String[] args)
	{
	    Scanner input = new Scanner(System.in);
	    int a = input.nextInt();
	    int start = a,end=a;
	    for(int i=0;i<a;i++){
	        for(int j=0;j<=a*2;j++){
	           if(j >= start && j <= end) System.out.print("  ");
	           else System.out.print("* ");
	        }
	        System.out.println();
	        start--;
	        end++;
	    }
	    start++;
	    end--;
	    for(int i=0;i<a;i++){
	        for(int j=0;j<=a*2;j++){
	           if(j >= start && j <= end) System.out.print("  ");
	           else System.out.print("* ");
	        }
	        System.out.println();
	        start++;
	        end--;
	    }
	}
}
