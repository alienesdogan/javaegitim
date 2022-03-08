package giris;
import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String[] args) {
        int n, toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        n = input.nextInt();

        for(int i = 1;i <=n/2 ;i++){
            if(n%i==0){
                toplam+=i;
            }

        }
        if (toplam == n){
            System.out.println("Girdiğiniz sayı mukemmel sayıdır.");
        }else{
            System.out.println("girdiğiniz sayı mukemmel sayı değildir");
        }
    }
}
