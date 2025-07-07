import java.util.Scanner;

public class circleOfString {
    public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int flag = 0, flag1 = 0;
		String[] s = new String[a]; 
		input.nextLine(); 
		for(int i = 0; i < a; i++){
		    s[i] = input.nextLine();
		}
		int len = s[0].length();
		for(int i = 1; i < a; i++){
		    if(len != s[i].length()){
		        flag = 1;
		    }
		}
		if(flag == 0){
		    int j = 0;
		    String temp = s[j], temp1 = "";
		    for(int i = 1; i < a; i++){
		        temp1 = s[i];
		        if(temp.charAt(len - 1) != temp1.charAt(0)){
		            flag1 = 1;
		            break;
		        }
		        j++;
		        temp = s[j];
		    }
		    temp = s[j];
		    temp1 = s[0];
		    if(temp.charAt(0) != temp1.charAt(len - 1)){
		        flag = 1;
		    }
		    if(flag1 == 1){
		        System.out.print(0);
		    }else{
		        System.out.print(1);
		    }
		}else{
		    System.out.print(0);
		}
	}
}
