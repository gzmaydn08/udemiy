package bolum4;

import java.util.Scanner;

public class Methods {

    public static void selamlama(){
        System.out.println("Merhaba nasılsınız..?");
        System.out.println("Selamlar...");
    }
    public static void faktoriyel(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz..");

        int sayi = scanner.nextInt();
        int fakt = 1;
        while (sayi>0){

            fakt *= sayi;
            sayi--;
        }
        System.out.println("faktöriyel = " +fakt);


    }
    public static void main(String[] args) {

        selamlama();

        faktoriyel();

    }
}
