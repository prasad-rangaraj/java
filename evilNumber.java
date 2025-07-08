import java.util.Scanner;

public class evilNumber {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int count = 0,temp=0;
        while(a>0){
            temp = a%2;
            if(temp == 1){
                count++;
            }
            a /= 2;
        }
        if(count%2 == 0){
            System.out.print("Evil number");
        }else{
            System.out.print("Not a Evil number");
        }
    }
}
