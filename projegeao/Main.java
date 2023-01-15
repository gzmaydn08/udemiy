package projegeao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String islemler= "işlemler\n" +
                "1. kare alan hesapla\n" +
                "2. üçgen alan hesapla\n" +
                "3. daire alan hesapla\n" +
                "çıkış : q";


        while (true){
            System.out.println(islemler);
            System.out.println("hangi şeklin alanını hesaplamak istiyorsunuz: ");
            String sekilTuru = scanner.nextLine();
            Sekil sekil = null;
            if (sekilTuru.equals("q")){
                System.out.print("programdan çıkılıyorrr");
                break;
            } else if (sekilTuru.equals("1")) {
                System.out.print("karenin kenarı : ");
                int kenar =scanner.nextInt();
                scanner.nextLine();

                sekil = new Kare("kare", kenar);
                sekil.alanHesapla();


            } else if (sekilTuru.equals("2")) {
                System.out.print("kenar 1:");
                int kenar1=scanner.nextInt();
                System.out.print("kenar 2:");
                int kenar2 = scanner.nextInt();
                System.out.print("kenar 3:");
                int kenar3= scanner.nextInt();
                scanner.nextLine();

                sekil = new Ucgen("üçgen",kenar1,kenar2,kenar3);
                sekil.alanHesapla();


            } else if (sekilTuru.equals("3")) {
                System.out.print("Dairenin yarıçapı:");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                sekil = new Daire("daire",yaricap);
                sekil.alanHesapla();
            }else {
                System.out.println("geçersiz işlem...");
            }


        }


    }
}
