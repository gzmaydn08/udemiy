package bolum3;

import java.util.Scanner;

public class Dongu2 {
    public static void main(String[] args) {

        // do while --> while dan farkı en az bir kere çalışması garanti

        /*int i=0;

        do {
            System.out.println("i = " + i);
            i++;
        }while (i<5);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı giriniz...");

        int sayı = scanner.nextInt();
        int toplam = 0;

        do {
            toplam += sayı%10;

            sayı /= 10;
            System.out.println("Sayı : " + sayı);

        }while (sayı>0);

        System.out.println("rakamları toplamı : "+ toplam);





    }
}
