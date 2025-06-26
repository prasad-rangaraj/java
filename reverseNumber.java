import java.util.Scanner;

public class reverseNumber {
    public static void main (String[] args)
	{
	   Scanner input = new Scanner(System.in);
	   int a,temp = 0,sum=0,rem=0;
	   a = input.nextInt();
	   temp=a;
	   while(temp>0){
	       rem = temp%10;
	       sum = sum*10 + rem;
	       temp/= 10;
	   }
	   System.out.print(sum);
	}
}
