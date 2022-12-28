package bolum3;

import java.util.Scanner;

public class Dongu3 {
    public static void main(String[] args) {

        /*
            break anahtar kelimesi:

            Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman çalışmasını durdurur.
            Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.

            break ifadesi sadece ve sadece içinde bulunduğu döngüyü sonlandırır. Eğer iç içe döngüler varsa
            ve içteki döngüde break kullanılmışsa sadece içteki döngü sona erer.

            continue anahtar kelimesi:

            Döngü herhangi bir yerde ve herhangi bir zamanda continue ifadesiyle karşılaştığı zaman geri kalan
            işlemlerini yapmadan direk döngü bloğunun başına döner.



        */

       /* int i = 0;

        while (i<20){

            if (i == 10){
                break;
            }
            System.out.println("i = "+ i);
            i++;
        }*/

       /* Scanner scanner = new Scanner(System.in);

        while (true){

            int islem = scanner.nextInt();

            if (islem == -1){
                System.out.println("Döngüden çıkılıyor...");
                break;
            }
            System.out.println(" İşlem = " + islem);
        }*/




       /* for (int i= 0; i<10; i++){
            if (i == 3 || i ==5){
                continue;
            }
            System.out.println("i= " i);
        }
*/

        int i = 0;

        while (i<10){
            if ( i == 3 || i == 5){
               i++;
               continue;
            }
            System.out.println("i = " + i);
            i++;
        }










    }
}
