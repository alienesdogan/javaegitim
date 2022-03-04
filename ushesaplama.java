package giris;
import java.util.Scanner;
public class ushesaplama {
    public static void main(String[] args) {
        int x;
        int y;
        int toplam = 1;
        Scanner input =new Scanner(System.in);
        System.out.print("üssü alınacak sayıyı giriniz:");
        x = input.nextInt();
        System.out.print("üssü giriniz:");
        y = input.nextInt();
        for(int i = 1;i<=y;i++){
            toplam *= x;
        }
        System.out.println(toplam);

    }
}
