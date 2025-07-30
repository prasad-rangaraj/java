import java.util.Scanner;

public class pangram {
    public static void main (String[] args)
	{
	    int flag = 1;
	    Scanner input = new Scanner(System.in);
	    String a = input.nextLine().toLowerCase();
	    for(int i = 'a' ;i<= 'z' ;i++){
	        for(int j=0;j<a.length();j++){
	            if(a.charAt(j) == i) flag = 0;
	        }
	        if(flag != 0){
	            System.out.print("Not Pangram");
	            break;
	        }
	        flag = 1;
	    }
	    if(flag == 1){
	        System.out.print("Pangram");
	    }
	}
}
