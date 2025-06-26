import java.util.Scanner;

public class powerOfNumber {
    public static void main (String[] args){
	   Scanner input = new Scanner(System.in);
	   int a,count=0;
	   a = input.nextInt();
	   int temp = a;
	   while(temp>0){
	       temp/=10;
	       count++;
	   }
	   if(count == 1){
	       System.out.print((int)Math.pow(a,a));
	   }else if(count>1){
	       temp = a%10;
	        System.out.print((int)Math.pow(a,temp));
	   }else{
	       System.out.print(0);
	   }
	}
}
