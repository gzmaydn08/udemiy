package projeBeyblade;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("beyblade programına hoşgeldiniz....");
        System.out.println("çıkış için q a basınız..");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("hangi beyblad i üretmek istiyorsunuz");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("programdan çıkılıyor...");
                break;

            } else {
                BeybladeFabrikasi fabrikas = new BeybladeFabrikasi();

                Beyblade beyblade = fabrikas.beybladeUret(islem);
                if (beyblade == null){
                    System.out.println("lütfen geçerli bir beyblade ismi giriniz..");
                }else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}
