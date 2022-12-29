package bolum4;

import java.util.Scanner;

public class MiniProje2 {

    public static int ebobBulma(int sayi1,int sayi2){
        int ebob = 1;
        for (int i =1; i<= sayi1 && i <= sayi2 ; i++){
            if ((sayi1 % i ==0) && (sayi2 % i ==0)){
                ebob = 1;
            }

        }
        return ebob;
    }

    public static void main(String[] args) {
        // kullanıcıdan alınan 2  sayının ebobunu bulma
        Scanner scanner = new Scanner(System.in);

        System.out.print("birinci sayı : ");
        int birinciSayi = scanner.nextInt();

        System.out.print("ikinci sayı : ");
        int ikinciSayi = scanner.nextInt();
        System.out.println("iki sayının ebobu :  "+ ebobBulma(birinciSayi,ikinciSayi));

    }
}
