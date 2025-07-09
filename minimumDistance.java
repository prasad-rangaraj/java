import java.util.Scanner;

public class minimumDistance {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    int flag=0,count=0;
	    int a = input.nextInt();
	    input.nextLine();
	    String[] s = new String[a];
        for(int i=0;i<a;i++){
            s[i] = input.nextLine();
        }
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        for(int i=0;i<a;i++){
            if(s[i].equals(s1)){
                flag = 1;
            }
            if(flag == 1){
                if(s[i].equals(s2)){
                    break;
                }
                count++;
            }
        }
        System.out.print(count);
    }
}
