package giris;
import java.util.Scanner;
public class piramit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Enter an integer: ");
        n = input.nextInt();

        for(int i = 0; i <= n; i++){
            for(int l = 1; l<=n-i ; l++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j=n-1 ; j >= 1; j--){
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
