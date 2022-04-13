package giris;
import java.util.Scanner;
public class palindrom {
    static boolean isPalindrom(int n){
        int temp = n, reserveNumber = 0, lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reserveNumber = (reserveNumber* 10) + lastNumber;
            temp/=10;

        }
        if(reserveNumber == n){
            return true;
        }else;
        return false;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("bir sayı giriniz :");
        int number = input.nextInt();

        System.out.print(isPalindrom(number));


    }

}
