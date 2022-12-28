package bolum3;

import java.util.Scanner;

public class MiniProje2 {
    public static void main(String[] args) {

        // girilen sayının amstrong olup olmadığını gösteren kod

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı giriniz : ");
        int sayi = scanner.nextInt();

        System.out.print("basamak sayısı : ");
        int basSayisi = scanner.nextInt();

        int geciciSayi = sayi;
        int toplam = 0;

        do {
            int basamakDegeri = geciciSayi %10;
            geciciSayi /= 10;

            toplam += Math.pow(basamakDegeri,basSayisi);

        }while (geciciSayi > 0);
        if (sayi == toplam){
            System.out.println("bu sayı bir amstrong sayısıdır...");
        }else {
            System.out.println("bu sayı amstrog sayısı değildir..");
        }







    }
}
