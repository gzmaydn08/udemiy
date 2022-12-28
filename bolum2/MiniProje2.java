package bolum2;

import java.util.Scanner;

public class MiniProje2 {
    public static void main(String[] args) {

        //bki koşul durumu


        Scanner scanner = new Scanner(System.in);
        System.out.println("kilonuzu giriniz..");
        int kilo = scanner.nextInt();

        System.out.println("boyunuzu giriniz ( örnek : 1,72)");
        double boy = scanner.nextDouble();

        double bki = (kilo / (boy*boy));

        if (bki<18.5){
            System.out.println("zayıf..");

        } else if (bki >= 18.5 && bki < 25) {
            System.out.println("normal..");

        } else if (bki >= 25 && bki < 30) {
            System.out.println("fazla kilolu..");

        }else {
            System.out.println("obez...");
        }


    }
}
