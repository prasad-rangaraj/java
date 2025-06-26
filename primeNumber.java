import java.util.Scanner;

public class primeNumber {
	public static void main (String[] args)
	{
	   Scanner input = new Scanner(System.in);
	   int a,flag=0;
	   a = input.nextInt();
	   for(int i=2;i<a;i++){
	       if(a%i == 0){
	           flag = 1;
	       }
	   }
	   if(flag == 0){
	       System.out.print("It is a prime number.");
	   }else{
	       System.out.print("It is not a prime number.");
	   }
	}
}
