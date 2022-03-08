package giris;
import java.util.Scanner;
public class AsalSayi {
    public static void main(String[] args) {
        int n1 = 100;



        Scanner input = new Scanner(System.in);
        for(int i = 2; i <= n1;i++){
            boolean dogru = true;
            for(int j = 2; j<i;j++){
                if(i%j==0) {

                    dogru = false;
                    break;
                }

            }
            if(dogru){
                System.out.println(i);
            }
            }


        }
    }

