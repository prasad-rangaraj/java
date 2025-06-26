import java.util.Scanner;

public class palindrome {
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
	   if(sum == a){
	       System.out.print("Its a Palindrome");
	   }else{
	       System.out.print("Its not a Palindrome");
	   }
	}
}
