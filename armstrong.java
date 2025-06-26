import java.util.Scanner;

public class armstrong {
public static void main (String[] args)
	{
	   Scanner input = new Scanner(System.in);
	   int a,temp = 0,count=0,sum=0,rem=0;
	   a = input.nextInt();
	   temp=a;
	   while(temp > 0){
	       temp /= 10;
	       count++;
	   }
	   temp=a;
	   while(temp>0){
	       rem = temp%10;
	       sum = sum + (int)Math.pow(rem,count);
	       temp/= 10;
	   }
	   if(sum == a){
	       System.out.print("Its a Armstrong number");
	   }else{
	       System.out.print("Its not a Armstrong number");
	   }
	}
}
