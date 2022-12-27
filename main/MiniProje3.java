package main;

import java.util.Scanner;

public class MiniProje3 {
    public static void main(String[] args) {
        // kullanıcadan aldığınız iki sayının değerlerini değiştirin

        Scanner scanner = new Scanner(System.in);

        int birincisayi;
        int ikincisayi;

        System.out.print("birinci sayı : ");
        birincisayi = scanner.nextInt();

        System.out.print("ikinci sayı : ");
        ikincisayi = scanner.nextInt();

        System.out.println("değiştirilmeden önce......");


        System.out.println(" birimnci sayı : "+ birincisayi + " ikinci sayı : "+ ikincisayi);
        int gecici = birincisayi;
        birincisayi = ikincisayi;
        ikincisayi = gecici;

        System.out.println(" birimnci sayı : "+ birincisayi + " ikinci sayı : "+ ikincisayi);




    }
}
