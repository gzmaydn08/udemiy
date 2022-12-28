package bolum2;

import java.util.Scanner;

public class MiniProje {
    public static void main(String[] args) {


        // kullanıcıdan alının 3 sayıdan en büyük sayıyı bulma

        Scanner scanner = new Scanner(System.in);
        System.out.print("birinci sayı : ");
        int a = scanner.nextInt();
        System.out.print("ikinci sayı : ");
        int b = scanner.nextInt();
        System.out.print("üçüncü sayı : ");
        int c = scanner.nextInt();


        int max = -1;

        if (a >= b && a >= c){

            max = a;

        } else if (b >= a && b>=c) {

            max = b;

        }else {

            max = c;

        }

        System.out.println("Maksimum sayı : "+ max);

    }
}
