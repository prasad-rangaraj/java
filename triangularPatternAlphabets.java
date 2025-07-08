import java.util.Scanner;

public class triangularPatternAlphabets {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int st=65,count=-1;
        for(int i=a;i>0;i--){
            for(int j=i;j>0;j--){
                char c= (char)st;
                System.out.print(c+" ");
                st++;
                count++;
            }
            st = st-count;
            count=-1;
            System.out.println();
        }
    }
}
