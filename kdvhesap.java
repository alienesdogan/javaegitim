import java.util.Scanner;
public class kdvhesap {
    public static void main(String[] args) {
        double tutar, kdv = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı giriniz:");
        tutar = input.nextDouble();
        double kdvTutar = tutar * kdv;
        double kdvliTutar = kdvTutar + tutar;
        System.out.println("Kdv tutarınız:"+kdvTutar);
        System.out.println("Toplam tutar:"+kdvliTutar);

    }
}
