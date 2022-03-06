package giris;
import java.util.Scanner;
public class MaxminBulma {
    public static void main(String[] args) {
        int n,max = 0, min = 0;
        Scanner input = new Scanner(System.in);
        boolean dogru = true;

        while(dogru){
            System.out.print("sayı giriniz :");
            n = input.nextInt();
            if(n<min){
                min = n;
            }else if (n>max){
                max =n;
            }
            System.out.println("minimum:"+(min)+" ;"+"maximum:"+(max));
        }

        }

    }

