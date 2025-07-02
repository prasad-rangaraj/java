import java.util.Scanner;

public class countAndSay {
     public String main(String[] a) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String num = "1";

        for (int i = 1; i < n; i++) {
            num = next(num);
        }
        return num;
    }

    private String next(String s) {
        StringBuilder sb = new StringBuilder();
        int c = 1;
        char ch = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                c++;
            } else {
                sb.append(c).append(ch);
                ch = s.charAt(i);
                c = 1;
            }
        }
        sb.append(c).append(ch);
        return sb.toString();
    }
}
