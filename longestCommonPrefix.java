import java.util.Scanner;

public class longestCommonPrefix {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.nextLine(); 
        int flag = 0, b = 0;
        String[] s = new String[a];
        String temp = "";
        StringBuffer longPal = new StringBuffer("");
        for(int i = 0; i < a; i++) {
            s[i] = input.nextLine(); 
        }
        temp = s[0];
        int j = 0;
        while(b != 1) {
            if (j >= temp.length()) break; 
            for(int i = 1; i < a; i++) {
                if (j >= s[i].length() || temp.charAt(j) != s[i].charAt(j)) {
                    flag = 1;
                    b = 1;
                    break;
                }
            }
            if(flag == 0) {
                longPal.append(temp.charAt(j));
                j++; 
            }
        }

        System.out.print(longPal);
    }
}
