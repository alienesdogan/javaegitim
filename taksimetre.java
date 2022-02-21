package giris;
import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        int km;
        double total, startPrice = 10, perKm = 2.20;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilometre girdiğinizi yazınız:");
        km = input.nextInt();
        total = (km * perKm);
        total += startPrice;
        total = (total<20) ? 20 : total;
        System.out.println("tutar:"+total);


    }

}
