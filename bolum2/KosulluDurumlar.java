package bolum2;

import java.util.Scanner;

public class KosulluDurumlar {
    public static void main(String[] args) {

        /*
        if(kosul){
            koşul sağlanınca bu blok çalışır
        }
        else{
            bu bloğun üstünde ki koşullar sağlanmadıysa bu blok çalışır
        }

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen yaşınızı giriniz...");

        int yas = scanner.nextInt();

        if (yas<18){
            System.out.println("Bu mekana giremezsiniz...");

        }else {
            System.out.println("Bu mekana girebilirsiniz...");
        }





    }
}
