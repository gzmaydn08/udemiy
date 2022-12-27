package main;

import java.util.Scanner;

public class MiniProje2 {


    public static void main(String[] args) {

        // bir aracın kilometrede ne kadar yaktığı ve kaç km yol yaptığı bilgilerini alın ve sürücünün
        // ne kadar ödemesi gerektiğini hesaplayınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen km başına yakılan ücreti giriniz ( örnek : 0,32)");

        double ucret = scanner.nextDouble();

        System.out.print( "lütfen kaç km yol gittiniz yazınız");

        int km = scanner.nextInt();

        System.out.println("toplam tutar : "+ ( ucret*km)+ " tl dir....");




    }
}
