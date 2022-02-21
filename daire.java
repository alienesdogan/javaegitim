package giris;
import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        double pi = 3.14;
        int yaricap;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap giriniz:");
        yaricap = input.nextInt();
        double alan = pi * (yaricap*yaricap);
        double cevre = (2 * pi * yaricap);
        System.out.println("Dairenizin alanı:"+alan);
        System.out.println("Dairenizin çevresi:"+cevre);
    }
}

