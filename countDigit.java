import java.util.Scanner;

public class countDigit {
    public static void main (String[] args)
	{
	   Scanner input = new Scanner(System.in);
	   int a,count=0;
	   a = input.nextInt();
	   if(a == 0){
	       count++;
	   }
	   while(a > 0){
	       a /= 10;
	       count++;
	   }
	   System.out.print(count);
	}
}
