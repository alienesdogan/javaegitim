package giris;
import java.util.Scanner;
public class Hesapmakinesi {
    public static void main(String[] args) {
        int n1, n2;
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        n1 = input.nextInt();
        System.out.print("2.sayıyı seçiniz:");
        n2 = input.nextInt();
        int islem;
        System.out.println("1-toplama\n2-çıkartma\n3-çarpma\n4-bölme");
        System.out.print("istediğiniz işlemi şeçiniz:");
        islem = input.nextInt();
        switch (islem){
            case 1:
                System.out.print("sonuç:"+" "+(n1+n2));
                break;
            case 2:
                System.out.print("sonuç:"+" "+(n1-n2));
                break;
            case 3:
                System.out.print("sonuç:"+" "+(n1*n2));
                break;
            default:
                System.out.print("sonuç:"+" "+(n1/n2));
        }

    }
}
