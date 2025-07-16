import java.util.Scanner;

public class divisibleBy7 {
    public static void main (String[] args)
	{
	    Scanner input = new Scanner(System.in);
	    int a = input.nextInt();
	    int temp = 0,cal = 0;
	    while(true){
	        temp = a%10;
	        a /= 10;
	        cal = a - (temp*2);
	        a = cal;
	        if(cal<0){
	            cal = Math.abs(cal);
	            if(cal%7 == 0){
	                System.out.print("Divisible by 7");
	                break;
	            }else{
	                System.out.print("Not Divisible by 7");
	                break;
	            }
	        }
	    }
	}
}
