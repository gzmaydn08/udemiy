package bolum3;

import java.util.Scanner;

public class MiniProje {

    public static void main(String[] args) {

        // Atm programı yazma

        Scanner scanner = new Scanner(System.in);

        int bakiye = 1000;

        String islemler = "1. işlem : bakiye öğrenme\n"
                +"2. işlem : para çekme\n"
                +"3. işlem : para yatırma\n"
                +"çıkış için q'a basın.. ";

        System.out.println("*****************************************");
        System.out.println(islemler);
        System.out.println("*****************************************");

        while (true){
            System.out.println("işlemi seçiniz...");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("programdan çıkılıyor");
                break;

            } else if (islem.equals("1")) {
                System.out.println("bakiyeniz : " + bakiye);

            } else if (islem.equals("2")) {
                System.out.println("çekmek istediğiniz tutar : " );
                int tutar = scanner.nextInt();
                scanner.nextLine();

                if (bakiye-tutar<0){
                    System.out.println("yeterli bakiye yok. Bakiyeniz = "+ bakiye);
                }else {
                    bakiye-=tutar;
                    System.out.println("yeni bakiyeniz : "+bakiye);
                }

            } else if (islem.equals("3")) {
                System.out.println("yatırmak istediğiniz tutar");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                bakiye += tutar;
                System.out.println("yeni bakiyeniz : "+bakiye);
            }else {
                System.out.println("geçersiz işlem");
            }


        }

    }
}
