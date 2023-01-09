package yurtDisiCikis;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("hoşgeldiniz");

        String sartlar ="yurtdışı çıkış kuralları\n" +
                "herhangibir siyasi yasağınız olmamalı\n" +
                "15 tl harç bedelinizi tam olarak yatırın\n" +
                "gideceğiniz ülkeye vizenizin bulunması gerekiyor";
        String mesaj= "yurt dışı şartlarından hepsini sağlamanız gerekiyor";

        while (true){
            System.out.println("********************");
            System.out.println(sartlar);
            System.out.println("********************");


            Yolcu yolcu = new Yolcu();
            System.out.println("harç bedeli kontrol ediliyor..");
            Thread.sleep(3000);

            if (yolcu.yurtdisiHarci()== false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("siyasi yasak kontrol ediliyor");
            Thread.sleep(300);
            if (yolcu.siyasiYasak()== false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("vize durumu kontrol ediliyorr");
            Thread.sleep(3000);
             if (yolcu.vizeDurumu() == false){
                 System.out.println(mesaj);
                 continue;
             }
            System.out.println("yurt dışına çıkabiliesiniz");
             break;



        }



    }
}
