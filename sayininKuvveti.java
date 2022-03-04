package giris;
import java.util.Scanner;
public class sayininKuvveti {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        sayi = input.nextInt();
        for(int i = 1;i<=sayi;i*=4){
            System.out.println(i);
        }
        System.out.println("--------");
        for(int a=1;a<=sayi;a*=5){
            System.out.println(a);
        }
    }
}
