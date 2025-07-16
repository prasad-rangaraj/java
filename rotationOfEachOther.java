import java.util.Scanner;

public class rotationOfEachOther {
	public static void main (String[] args)
	{
	    Scanner input = new Scanner(System.in);
	    String a = input.nextLine();
	    String b = input.nextLine();
	    char[] s = b.toCharArray();
	    char temp = 'a';
	    int flag = 0;
	    for(int i=0;i<b.length();i++){
	        temp = s[0];
	        int j = 0;
	        while(j<b.length()-1){
	            s[j] = s[j+1];
	            j++;
	        }
	        s[b.length()-1] = temp;
            String str = new String(s);
	        if(a.equals(str.toString())){
	            flag = 1;
	            break;
	        }
	    }
	    if(flag == 1){
	        System.out.print("true");
	    }else{
	        System.out.print("false");
	    }
	}
}
