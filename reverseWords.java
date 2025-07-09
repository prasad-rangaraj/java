import java.util.Scanner;

public class reverseWords {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    String a = input.nextLine();
	    String[] s = a.split("\\.");
	    for (int i = s.length - 1; i >= 0; i--) {
            if (!s[i].isEmpty()) {
                System.out.print(s[i]);
            if (i > 0) System.out.print(".");
            }
        }

	}
}
