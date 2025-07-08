import java.util.Scanner;

public class techNumber {
     public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int count = 0,temp=a,num=1;
        while(temp>0){
            count++;
            temp/=10;
        }
        if(count%2 == 0){
            count /= 2;
            while(count>0){
                num = num*10;
                count--;
            }
            int fd = a/num;
            int ld = a%num;
            int tot = fd+ld;
            tot = tot*tot;
            if(tot == a){
                System.out.print("Tech number");
            }else{
                System.out.print("Not a Tech number");
            }
        }else{
            System.out.print("Not a Tech number");
        }
    }
}
