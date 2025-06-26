import java.util.Scanner;

public class alternativePrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int flag  = 0,k=1;
        for(int i = 2;i<a;i++){
            flag = 1;
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    flag = 0;
                }
            }
            if(i == 2){
                System.out.print(i+" ");
                k++;
            }else if(flag == 1){
                if(k%2 != 0){
                 System.out.print(i+" ");   
                }
                k++;
            }
        }
        if(a<2){
            System.out.print(0);
        }
        
    }
}
