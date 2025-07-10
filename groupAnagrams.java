import java.util.Arrays;
import java.util.Scanner;

public class groupAnagrams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.nextLine();
        int index = 0;
        String[] s1 = new String[a];
        String[][] s2 = new String[a][a]; 
        for (int i = 0; i < a; i++) {
            s1[i] = input.nextLine();
        }
        for (int i = 0; i < a; i++) {
            if (s1[i].equals("0")) continue;

            index = 1;
            s2[i][0] = s1[i];

            for (int j = 0; j < a; j++) {
                if (i != j && !s1[j].equals("0") && isAnagram(s1[i], s1[j])) {
                    s2[i][index] = s1[j];
                    index++;
                    s1[j] = "0";
                }
            }
            s1[i] = "0";
        }
        for (int i = 0; i < a; i++) {
            if (s2[i][0] != null) {
                for (int j = 0; j < a && s2[i][j] != null; j++) {
                    System.out.print(s2[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static boolean isAnagram(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
