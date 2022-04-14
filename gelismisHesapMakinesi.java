package giris;
import java.util.Scanner;
public class gelismisHesapMakinesi {
    static void  plus(){
        Scanner scan = new Scanner(System.in);
        int number , result = 0, i = 1;

        while(true){
            System.out.print(i++ + ". sayı:");
            number = scan.nextInt();
            if(number == 0){
                break;
            }
            result += number;
        }
        System.out.print("sonuç :"+ result);
    }

    static void minus(){
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;

        while(true){
            System.out.print(i++ + ". sayı:");
            number = scan.nextInt();
            if(number == 0){
                break;
            }
            result -= number;
        }
        System.out.print("sonuc :"+ result);
    }

    static void times(){
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while(true){
            System.out.print(i++ + ". sayı:");
            number = scan.nextInt();
            if(number == 0){
                break;
            }
            result *= number;
        }
        System.out.print("sonuç:"+ result);
    }

    static void divided(){
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true){
            System.out.print(i++ + ".sayı:");
            number = scan.nextInt();
            if(number == 0){
                break;
            }
            result /= number;
        }
        System.out.print("sonuç :"+result);
    }

    static void power(){
        Scanner scan = new Scanner(System.in);
        double taban, us;

        System.out.print("Taban sayısını giriniz :");
        taban = scan.nextDouble();
        System.out.print("üssünü giriniz :");
        us = scan.nextDouble();

        double sonuc = Math.pow(taban, us);
        System.out.print("sonuç :"+ sonuc);

    }

    static void factorial(){
        Scanner scan = new Scanner(System.in);
        int fak, sonuc = 1;

        System.out.print("Faktöriyelini almak istediğiniz sayıyı giriniz :");
        fak = scan.nextInt();;
        if(fak <= 0){
            System.out.print("Girdiğiniz değer 0 veya negatif olamaz!");
            return;
        }
        for(int i = 1; i <= fak; i++){
            sonuc *= i;
        }
        System.out.print("sonuç :"+ sonuc);
    }

    static void mod(){
        Scanner scan = new Scanner(System.in);
        int number, mod, sonuc;

        System.out.print("modunu almak istediğiniz sayıyı giriniz :");
        number = scan.nextInt();
        System.out.print("Modunu giriniz :");
        mod = scan.nextInt();

        sonuc = (number % mod);
        System.out.print("sonuç :"+ sonuc);
    }

    static void rectangle(){
        Scanner scan = new Scanner(System.in);
        int a, b, alan, cevre;

        System.out.print("Dikdörtgenin kenar uzunluklarını girin :");
        a = scan.nextInt();
        b = scan.nextInt();

        alan = (a*b);
        cevre = (2*a) + (2*b);

        System.out.print("Dikdörtgeninizin alanı "+alan+ " çevresi ise "+cevre);
    }

    static void circle(){
        Scanner scan = new Scanner(System.in);
        double r, pi = 3.14,alan,cevre, sonuc;

        System.out.print("Dairenizin yarıçapını giriniz :");
        r = scan.nextDouble();

        alan = pi * Math.pow(r, 2);
        cevre = 2 * pi * r;

        System.out.print("Dairenizin alanı "+ alan + "çevresi ise " + cevre);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkartma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod alma\n"
                + "8- Dikdörtgen Alan Ve Çevre Hesaplama\n"
                + "9- Daire Alan Ve Çevre hesaplama\n"
                + "0- Çıkış Yap";

        do{
            System.out.print(menu);
            System.out.print("Lütfen işleminizi seçiniz");
            select = scan.nextInt();
            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 9:
                    circle();
                    break;
                default:
                    System.out.print("Yanlış bir değer girdiniz!");

            }

        }while(select != 0){
            System.out.print("Başarıyla çıkış yaptınız!");
        }
    }
}
