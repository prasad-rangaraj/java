import java.util.Scanner;

public class firstNonCharacter {
    public static void main (String[] args)
	{
	    Scanner input = new Scanner(System.in);
	    String a = input.nextLine();
	    int flag = 0;
	    char[] s = a.toCharArray();
	    char temp = 'a';
	    for(int i =0;i<a.length();i++){
	        temp = a.charAt(i);
	        flag = 0;
	        int j = 0;
	        while(j < s.length){
	            if(i != j){
	                if(temp == s[j]){
	                    flag = 1;
	                }
	            }
	            j++;
	        }
	        if(flag == 0) break;
	    }
	    if(flag == 0){
	        System.out.print(temp);
	    }else{
	        System.out.print("$");
	    }
	}
}
