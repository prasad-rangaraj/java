import java.util.Scanner;

public class bouncyNumber {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int temp1=0,temp2=0,flag = 0,flag2=0;
        temp1 = a%10;
        a/=10;
        while(a>0){
            temp2 = a%10;
            if(temp1>temp2){
                flag = 0;
            }else if(temp2<temp1){
                flag2 = 0;
            }
            if(flag2 == 0 && flag == 0) break;
            temp1 = temp2;
            a/=10;
        }
        if(flag2 == 0 && flag == 0 && a>100) System.out.print("Bouncy Number");
        else System.out.print("Not a Bouncy Number");
    }
}
