package main;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       /* System.out.println("lütfen yaşınızı giriniz");

        int yas = scanner.nextInt();
        System.out.println( "yaşınız = "+ yas);*/


        if(scanner.hasNextInt()){
            int sayı = scanner.nextInt();
            System.out.println(sayı);
        }else {
            System.out.println("lütfen bir sayı giriniz");
        }







    }

}
