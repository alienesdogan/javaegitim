
package giris;
import java.util.Scanner;

public class ucgenhesap {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("1. kenari giriniz:");
        a = input.nextInt();
        System.out.print("2.kenarı giriniz:");
        b = input.nextInt();
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("hipotenüsünüz:"+c);
    }

}
