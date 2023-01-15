package stacic;

public class Main {
    public static void main(String[] args) {


        Seyirci seyirci = new Seyirci("gizo");
        Seyirci seyirci1= new Seyirci("musti");

        seyirci1.oyunSeyret();
        System.out.println("seyirci sayısı: "+ Seyirci.seyirciSayisi);
        System.out.println("seyirci sayısı: "+ seyirci.seyirciSayisi);
        System.out.println("seyirci sayısı: "+ seyirci1.seyirciSayisi);




    }
}
