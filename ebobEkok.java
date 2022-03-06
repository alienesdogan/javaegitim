package giris;
import java.util.Scanner;
public class ebobEkok {
    public static void main(String[] args) {
        int n1, n2;
        int ebob = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz:");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz:");
        n2 = input.nextInt();

        for(int k = n1;k>=1;k--){
            if(n1%k==0 && n2%k==0) {
                System.out.println(k);
                break;
            }
        }
        for(int i = n1;i<=(n1*n2);i++){
            if(i%n1==0 && i%n2==0){
                System.out.println(i);
                break;
            }
        }
    }
}
