package bolum2;

import java.util.Scanner;

public class MiniProje3 {
    public static void main(String[] args) {
        //swicht case ile hesap makinesi yapma

        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************************");
        int a;
        int b;

        String islemler = "1. toplama işlemi\n"
                            + "2. çıkarma işlemi\n"
                            + "3. çarpma işlemi\n"
                            + "4. bölme işlemi";
        System.out.println(islemler);
        System.out.println("******************************************");

        System.out.println("işlemi seçiniz.." );
        String islem = scanner.nextLine();

        switch (islem){
            case "1":
                System.out.print("birinci sayı: ");
                 a = scanner.nextInt();
                System.out.print("ikinci sayı: ");
                 b = scanner.nextInt();
                System.out.println("toplam : "+ (a+b));
                break;
            case "2":
                System.out.print("birinci sayı: ");
                 a = scanner.nextInt();
                System.out.print("ikinci sayı: ");
                 b = scanner.nextInt();
                System.out.println("fark : "+ (a-b));
                break;
             case "3":
                System.out.print("birinci sayı: ");
                 a = scanner.nextInt();
                System.out.print("ikinci sayı: ");
                 b = scanner.nextInt();
                System.out.println("çarpım : "+ (a*b));
                break;
             case "4":
                System.out.print("birinci sayı: ");
                 a = scanner.nextInt();
                System.out.print("ikinci sayı: ");
                 b = scanner.nextInt();
                System.out.println("bölüm : "+ ((double)a/b));
                break;
            default:
                System.out.println("geçersiz işlem...");

        }







    }
}
