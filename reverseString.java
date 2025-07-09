import java.util.Scanner;

public class reverseString {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    String a = input.nextLine();
	    for(int i=a.length()-1;i>=0;i--){
	        System.out.print(a.charAt(i));
	    }
	}
}
