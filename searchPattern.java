import java.util.Scanner;

public class searchPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        int flag =0;
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            int j;
            for (j = 0; j < s2.length(); j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
            if (j == s2.length()) {
                System.out.print((i+ 1) + " ");
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.print(-1);
        }
    }
}
