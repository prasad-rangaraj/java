import java.util.Scanner;

public class xylemAndPholem {
	public static void main (String[] args)
	{
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int temp=0,firstNum=0,tot=0,sum=0;
        temp = a;
        int lastNum = a%10;
        temp = a;
        while(temp>0){
            firstNum = temp%10;
            temp/= 10;
        }
        tot = firstNum+lastNum;
        temp = a/10;
        while(temp>10){
            sum = sum + (temp%10);
            temp /= 10;
        }
        if(sum == tot){
            System.out.print("Xylem number");
        }else{
            System.out.print("phloem number");
        }
	}

}
