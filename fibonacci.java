package giris;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int s1 = 0, s2 = 1, s3, eleman;
        Scanner input = new Scanner(System.in);
        System.out.print("kaç eleman olsun: ");
        eleman = input.nextInt();
        System.out.print(s1+" "+s2);
        for(int i = 2;i<eleman;i++){
            s3=s1+s2;
            System.out.print(" "+s3);
            s1=s2;
            s2=s3;

        }

    }
}
