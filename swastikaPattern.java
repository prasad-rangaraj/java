import java.util.Scanner;

public class swastikaPattern {
    public static void main (String[] args) 
	{
        Scanner input =  new Scanner(System.in);
        int a = input.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(i == a/2 || j == a/2){
                    System.out.print("* ");
                }else if((i == 0 && j>a/2) || (i == a-1 && j<a/2)){
                    System.out.print("* ");
                }else if((j==0 && i<a/2) || (j == a-1 && i>a/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
	}
}
