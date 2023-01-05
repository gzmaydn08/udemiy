package proje4;

import java.util.Scanner;

public class Test {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);
    public static void islemleriBastir(){
        System.out.println("\t 0- işlemleri görüntüle");
        System.out.println("\t 1- şarkıcıları görüntüle");
        System.out.println("\t 2- şarkıcı ekle");
        System.out.println("\t 3- şarkıcı güncelle");
        System.out.println("\t 4- şarkıcı sil");
        System.out.println("\t 5- şarkıcı ara");
        System.out.println("\t 6- uygulamadan çık");
    }
    public static void goruntule(){
        sarkicilar.sarkicilariBastir();

    }
    public static void sarkiciEkle(){
        System.out.println("Eklemek istediğiniz şarkıcının ismi :");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciEkle(isim);
    }
    public static void sarkiciGuncelle(){
        System.out.println("Güncellemek istediğiniz pozisyon(1,2,3...)");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        String yeniisim =scanner.nextLine();
        sarkicilar.sarkiciGuncelle(yeniisim,pozisyon-1);
    }
    public static void sil(){
        System.out.println("Silmek istediğiniz pozisyon(1,2,3...)");
        int pozisyon =scanner.nextInt();
        sarkicilar.sarkiciSil(pozisyon-1);

    }
    public static void ara(){
        System.out.println("Aramak istediğiniz şarkıcı");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciAra(isim);
    }
    public static void main(String[] args) {
        System.out.println("\t şarkıcı uygulamasına hoşgeldiniz..." );

        islemleriBastir();

        boolean cikis = false;
        int islem;

        while (!cikis){
            System.out.println("Bir işlem seçiniz...");
            islem = scanner.nextInt();

            scanner.nextLine();

            switch (islem){
                case 0 :
                    islemleriBastir();
                    break;
                case 1:
                    goruntule();
                    break;
                case  2 :
                    sarkiciEkle();
                    break;
                case  3:
                    sarkiciGuncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;

                    System.out.println("uygulamadan çıkılıyor...");
                    break;


            }

        }

    }
}
