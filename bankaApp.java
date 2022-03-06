package giris;
import java.util.Scanner;
public class bankaApp {
    public static void main(String[] args) {
        String userName, password;
        int balance = 1500;
        int right = 3;
        int select;
        Scanner input = new Scanner(System.in);

        System.out.print("kullanıcı adını giriniz:");
        userName = input.nextLine();
        System.out.print("şifrenizi giriniz:");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("123123")){
            System.out.println("Merhaba, Garanti bankasına hoşgeldiniz.");
            do {
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgulama\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak stediğiniz işlemi seçiniz :");
                select = input.nextInt();
                switch (select){
                    case 1:
                        int price;
                        System.out.print("yatırmak istediğiniz tutarı giriniz:");
                        price = input.nextInt();
                        balance += price;
                        break;
                    case 2:

                        System.out.print("çekmek istediğiniz tutarı giriniz");
                        price = input.nextInt();
                        if(price>balance){
                            System.out.println("bakiye yetersiz!");
                        }else{
                            balance -= price;
                        }
                        break;
                    case 3:
                        System.out.println("bakiyeniz:"+balance);
                        break;
                }
            }while(select != 4);
                System.out.println("sistemden çıkış yaptınız");


        }else{
            right--;
            System.out.println("hatalı kullanıcı adı veya şifre");
            if(right==0){
                System.out.println("kartınız bloke olmuştur");
            }else{
                System.out.println("kalan giriş hakkınız: "+right);
            }
        }


    }
}
