package giris;
import java.util.Scanner;
public class manavkasa {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5;
        float kgArmut, kgElma, kgDomates, kgMuz, kgPatlıcan;
        Scanner input = new Scanner(System.in);
        System.out.print("kaç kilo armut aldınız:");
        kgArmut = input.nextFloat();
        System.out.print("kaç kilo elma aldınız");
        kgElma = input.nextFloat();
        System.out.print("kaç kilo domates aldınız:");
        kgDomates = input.nextFloat();
        System.out.print("kaç kilo muz aldınız:");
        kgMuz = input.nextFloat();
        System.out.print("kaç kilo patlıcan aldınız:");
        kgPatlıcan = input.nextFloat();
        double toplam = ((kgArmut*armut)+(kgElma*elma)+(kgDomates*domates)+(kgMuz*muz)+(kgPatlıcan*patlıcan));
        System.out.print("toplam borcunuz:"+toplam);
    }
}
