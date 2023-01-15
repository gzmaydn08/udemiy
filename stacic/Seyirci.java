package stacic;

public class Seyirci {
    public static int seyirciSayisi=0;


    private String isim;

    public Seyirci(String isim) {
        this.isim = isim;
        seyirciSayisi++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void oyunSeyret(){
        System.out.println(isim+ " oyun seyrediyorr");
    }
}
