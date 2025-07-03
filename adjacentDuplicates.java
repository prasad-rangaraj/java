import java.util.Scanner;

public class adjacentDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        boolean changed = true;

        while (changed) {
            StringBuilder sb = new StringBuilder();
            changed = false;

            for (int i = 0; i < s.length(); i++) {
                if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                    while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                        i++;
                    }
                    changed = true;
                } else {
                    sb.append(s.charAt(i));
                }
            }
            s = sb.toString();
        }

        System.out.println(s);
    }
}
