import java.util.Scanner;

public class krishNumber {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=1,temp=0,a=0;
		a=n;
		while(n>0)
		{
		    int digit=n%10;
		    for(int j=1;j<=digit;j++){
		        sum*=j;
		    }
		    temp+=sum;
		    sum=1;
		    n=n/10;
		}
		if(a==temp){
		    System.out.print(a+" is Krish Number");
		}
		else{
		    System.out.print("Its not a krish number");
		}
	}
}
