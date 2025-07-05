import java.util.Scanner;

public class strontioNumber {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a four digit number: ");
       int inputNumber=sc.nextInt();
      int temp=inputNumber;
      inputNumber=(inputNumber*2%1000)/10;
      if(inputNumber%10==inputNumber/10)
         System.out.println(temp+ " is a strontio number.");
      else
         System.out.println(temp+ " is not a strontio number.");
   } 
}
