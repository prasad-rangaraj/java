import java.util.Scanner;

public class mysteryNumber {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int temp = a/2,rev=0,temp1=0,sum=0,tot=0;
        while(true){
            temp1=temp;
            while(temp1>0){
                rev= temp1%10;
                sum = sum*10 + rev;
                temp1 /=10;
            }
            tot = sum+temp;
            if(tot == a){
                System.out.print("Mystery Number");
                break;
            }else{
                sum=0;
                temp++;
                if(temp>a){
                    System.out.print("Not a Mystery Number");
                    break;
                }
            }
        }
    }
}
