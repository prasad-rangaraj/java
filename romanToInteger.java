import java.util.Scanner;

public class romanToInteger {
    public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int cal = 0;
		String s = input.nextLine();
		int len = s.length();

		if(len == 1){
		    System.out.print(findRoman(String.valueOf(s.charAt(0))));
		}else{
		    for (int i = 0; i < len; i++) {
		        if (i < len - 1 && findRoman(String.valueOf(s.charAt(i))) < findRoman(String.valueOf(s.charAt(i + 1)))) {
		            cal -= findRoman(String.valueOf(s.charAt(i)));
		        } else {
		            cal += findRoman(String.valueOf(s.charAt(i)));
		        }
		    }
		    System.out.print(cal);
		}
	}

	public static int findRoman(String n){
	    String[] section = {"I","V","X","L","C","D","M"};
		int[] secNum = {1,5,10,50,100,500,1000};
		for(int i = 0; i < 7; i++){
		    if(n.equals(section[i])){
		        return secNum[i];
		    }
		}
		return 0;
	}
}
