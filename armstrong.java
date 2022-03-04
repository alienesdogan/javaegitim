package giris;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        System.out.print("bir başlangıç değeri giriniz:");
        a = input.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        b = input.nextInt();

        if (a<0 || b<0){
            System.out.println("girdiğiniz değerler negatif olamaz.");
        }else if (a>b) {
            System.out.println("ilk sayı ikinciden büyük olamaz");
        }
        while (a!=b){
            int sayi1=a, sayi2=a ,sayi3=a, basamak = 0,toplam = 0, kalan;
            if (sayi1==0){
                basamak=1;
            }while(sayi1 != 0){
                sayi1/=10;
                basamak++;
            }
            while(sayi2 != 0){
                kalan = sayi2%10;
                toplam+=Math.pow(kalan, basamak);
                sayi2/=10;
            }
            if (sayi3 == toplam){
                System.out.println(toplam);
            }
        a++;
        }
    
    }
}
