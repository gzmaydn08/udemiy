package projee3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("hoşgeldinizzz");
        String islemler = "işlemler...\n" +
                "1. yazılımcı işlemleri\n" +
                "2. yönetici işlemleri\n" +
                "çıkış için q";
        System.out.println("*****************************");

        System.out.println(islemler);

        System.out.println("******************************");


        while (true){
            System.out.println("işlemi seçiniz..");
            String islem =scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("programdan çıkılıyorrrr");
                break;
            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("gizem", "yüksel", 123456, "java");
                String yazilimciIslem = "1. format at\n" +
                        "2. bilgileri göster\n" +
                        "çıkış için q";
                System.out.println(yazilimciIslem);

                while (true){
                    System.out.println("işlemi seçiniz.");
                    String yIslem =scanner.nextLine();
                    if (yIslem.equals("q")){
                        System.out.println("yazılımcı işlemlerinden çıkılıyor");
                        break;
                    } else if (yIslem.equals("1")) {
                        System.out.println("işletim sistemi");
                        String isletimSis = scanner.nextLine();
                        yazilimci.formatAt(isletimSis);

                    } else if (yIslem.equals("2")) {
                        yazilimci.bilgileriGoster();

                    }else {
                        System.out.println("geçersiz yazılımcı işşlemi");
                    }
                }


            } else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("serhat", "say ", 123658, 10);
                String yoneticiIslem = "yönetici işlemleri\n" +
                        "1. zam yap\n" +
                        "2. bilgileri göster\n" +
                        "çıkmak için q a bas";

                System.out.println(yoneticiIslem);
                while (true){
                    System.out.println("işlem seçiniz");
                    String yislem = scanner.nextLine();
                    if (yislem.equals("q")){
                        System.out.println("yönetici işlemlerinden çıkılıyor.");
                        break;
                    } else if (yislem.equals("1")) {
                        System.out.print("yöneticinin ne kadar zam yapmasını istiyorsunuz: ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zam(zamMiktari);

                    } else if (yislem.equals("2")) {
                        yonetici.bilgileriGoster();

                    }else {
                        System.out.println("geçersiz yönetici işlemi");
                    }


                }


            }else {
                System.out.println("geçersiz işlem");
            }
        }

    }
}
