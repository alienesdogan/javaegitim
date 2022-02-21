package giris;
import java.util.Scanner;
public class kitleEndeksi {
    public static void main(String[] args) {
        double boy, kilo;
        Scanner input = new Scanner(System.in);
        System.out.print("metre cinsinden boyunuzu giriniz:");
        boy = input.nextDouble();
        System.out.print("kilonuzu giriniz:");
        kilo = input.nextDouble();
        double endeks = kilo / (boy*boy);
        System.out.print("vucüt kitle endeksiniz:"+endeks);
    }
}
