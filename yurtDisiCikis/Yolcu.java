package yurtDisiCikis;

import java.util.Scanner;

public class Yolcu implements YurtDisi {
    @Override
    public boolean yurtdisiHarci() {
        if (this.harc < 15) {
            System.out.println("lütfen yurt dışı çıkış harcını tam yatırın");

            return false;
        } else {
            System.out.println("yurt dışı harcı tamam");
            return true;

        }
    }


    @Override
    public boolean siyasiYasak() {
        if (this.siyasiYasak == true){
            System.out.println("yurt dışına çıkamazsınız");
            return false;
        }else {
            System.out.println("siyasi yasak yok");

            return true;
        }
    }

    @Override
    public boolean vizeDurumu() {
        if (this.vizeDurumu == true){
            System.out.println("vize işlemleri tamam");

        return true;}
        else {
            System.out.println("vizeniz yok");
            return false;
        }


    }

    public Yolcu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("yatırdığınız harç bedeli : ");
        this.harc=scanner.nextInt();
        scanner.nextLine();

        System.out.println("siyasi yasağınız bulunuyor mu ( evet veya hayır");
        String cevap = scanner.nextLine();

        if (cevap.equals("evet")){
            this.siyasiYasak=true;

        }else {
            this.siyasiYasak = false;
        }
        System.out.println("vizeniz bulıunuyor mu ( evet veya hayır");
        String cevap2 = scanner.nextLine();

        if (cevap2.equals("evet")){
            this.vizeDurumu=true;
        }else {
            this.vizeDurumu =false;
        }


    }
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
}
