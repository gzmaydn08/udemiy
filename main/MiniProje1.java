package main;

import java.util.Scanner;

public class MiniProje1  {
    public static void main(String[] args) {

        // bki hesaplama

        Scanner scanner = new Scanner(System.in);

        System.out.print("lütfen kilonuzu giriniz");

        int kilo = scanner.nextInt();
        System.out.print(" lütfen boyunuzu giriniz: (örnek: 1,72)");

        double boy = scanner.nextDouble();
        double bki = kilo/ (boy*boy);

        System.out.println("beden kitle indeksiniz = "+ bki);


    }
}
