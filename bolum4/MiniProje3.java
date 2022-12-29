package bolum4;

import java.util.Scanner;

public class MiniProje3 {


    public static int cikarma(int a, int b) {
        return (a - b);

    }

    public static double bolme(int a, int b) {
        return ((double) a / b);

    }

    public static int toplama(int a, int b) {
        return (a + b);
    }

    public static int toplama(int a, int b, int c) {
        return (a + b + c);

    }

    public static int carpma(int a, int b) {
        return (a * b);

    }

    public static int carpma(int a, int b, int c) {
        return (a * b * c);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //hesap makinesi overloading ile

        String islemler = "1. toplama işlemi\n"
                + "2. çıkarma işlemi\n"
                + "3. çarpma işlemi\n"
                + "4. bölme işlemi\n"
                + "çıkış için q ya basınız..";

        System.out.println("******************************************");
        System.out.println(islemler);
        System.out.println("******************************************");

        while (true) {
            System.out.print("işlemi seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("prgramdan çıkılıyor");
                break;
            } else if (islem.equals("1")) {
                System.out.println("kaç değer toplayacaksınız?(2 veya 3");

                int kacsayi = scanner.nextInt();
                if (kacsayi == 2) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b : ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("girilen sayıların toplamları : " + toplama(a, b));

                } else if (kacsayi == 3) {
                    System.out.print("a : ");
                    int a = scanner.nextInt();
                    System.out.print("b : ");
                    int b = scanner.nextInt();
                    System.out.print("c : ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("girilen sayıların toplamları : " + toplama(a, b, c));


                } else {
                    System.out.println("bunun için uygun method bulunmuyor.");
                }

            } else if (islem.equals("2")) {
                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b : ");
                int b = scanner.nextInt();
                scanner.nextLine();

                System.out.println("girilen sayıların farklerı : " + cikarma(a, b));


            } else if (islem.equals("3")) {
                System.out.println("kaç değer çarpacaksınız ?(2 veya 3");

                int kacsayi = scanner.nextInt();
                if (kacsayi == 2) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b : ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("girilen sayıların çarpımları : " + carpma(a, b));

                } else if (kacsayi == 3) {
                    System.out.print("a : ");
                    int a = scanner.nextInt();
                    System.out.print("b : ");
                    int b = scanner.nextInt();
                    System.out.print("c : ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("girilen sayıların çarpımları : " + carpma(a, b, c));

                } else {
                    System.out.println("bunun için uygun method bulunmuyor....");
                }

            } else if (islem.equals("4")) {
                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b : ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("girilen sayıların bölümleri : " + bolme(a, b));


            }else {
                System.out.println("bunun için uygun method bulunmuyor..");
            }


        }
    }
}
