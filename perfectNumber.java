import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 0;
        for(int i=1;i<a;i++){
            if(a%i == 0){
                sum += i;
            }
        }
        if(sum == a){
            System.out.print("It is a perfect number");
        }else{
            System.out.print("It is not a perfect number");
        }
    }
}
