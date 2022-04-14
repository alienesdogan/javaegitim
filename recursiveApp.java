package giris;
import java.util.Scanner;
public class recursiveApp {
    static void App (int number)
    {
        if(number <= 0){
            System.out.print(" "+number);
            return;
        }
        System.out.print(" "+number);
        App(number-5);
        System.out.print(" "+number);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        while(true){
            System.out.print("Sayıyı giriniz :");
            a = scan.nextInt();
            App(a);
            System.out.print("\n");
        }


    }
}
