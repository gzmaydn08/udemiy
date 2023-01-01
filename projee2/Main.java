package projee2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("idmana hoşgeldiniz");
        String idmanlar = "geçerli hareketler\n" +
                "burpee\n" +
                "pushup\n" +
                "sithup\n" +
                "squat";
        System.out.println(idmanlar);

        System.out.println("bir idman oluşturun ");
        System.out.print("burpee sayısı : ");
        int burpee = scanner.nextInt();
        System.out.print("pushup sayısı : ");
        int pushup = scanner.nextInt();
        System.out.print("sithup sayısı : ");
        int sithup = scanner.nextInt();
        System.out.print("squat sayısı : ");
        int squat = scanner.nextInt();
        scanner.nextLine();



        Idman idman = new Idman(burpee, pushup, sithup,squat);

        System.out.println("idmanınnız başlıyorrrrrr...");

        while (idman.idmanBittiMi()== false){
            System.out.print("hareket türü(burpee , pushup,  sithup , squat) : ");
            String tur = scanner.nextLine();
            System.out.println("bu hareketten kaç tane yapacaksınız ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur,sayi);


        }


        System.out.println("idmanınız bitti");





    }
}
