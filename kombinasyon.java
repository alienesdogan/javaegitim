package giris;
import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        int toplameleman,kumeleman, fak = 1,gizli1 =1, fak1 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz;");
        toplameleman = input.nextInt();
        System.out.print("kümeler ka. elemanlı olsun?");
        kumeleman = input.nextInt();

        int gizli = toplameleman-kumeleman;
        for(int i =1;i<=toplameleman;i++){
            fak *= i;
        }
        for(int a =1;a<=kumeleman;a++){
            fak1 *= a;
        }
        for(int b = 1;b<=gizli;b++){
            gizli1 *= b;
        }
        double toplam = fak/(fak1*gizli1);
        System.out.println("sonuc"+toplam);
    }
}
