import java.util.Scanner;

public class emirpNumber {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int flag=0,temp=0,sum=0,rev=0;
        for(int i=2;i<=a/2;i++){
            if(a%i == 0){
                flag = 1;
            }
        }
        if(flag == 0){
            temp=a;
            while(temp>0){
                rev = temp%10;
                sum = sum*10 + rev;
                temp/=10;
            }
            for(int i=2;i<=sum/2;i++){
            if(sum%i == 0){
                flag = 1;
            }
        }
            if(flag == 0){
                System.out.print("Emirp Number");
            }else{
                System.out.print("Not a Emirp Number");
            }
        }else{
            System.out.print("Not a Emirp Number");
        }
    }
}
