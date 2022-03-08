package giris;
import java.util.Scanner;
public class Tersucgen {
    public static void main(String[] args) {
        int n, basamak;
        Scanner input = new Scanner(System.in);

        System.out.print("Piramit kaç basamaklı olsun? :");
        n = input.nextInt();

        for(int j=n ; j >= 1; j--){
            for(int h = 1; h <= n-j;h++){
                System.out.print(" ");
            }
            for(int g = 2*j-1;1<=g;g--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
