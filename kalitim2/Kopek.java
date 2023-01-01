package kalitim2;

public class Kopek extends Hayvan {

    private int disSayısı;

    public int getDisSayısı() {
        return disSayısı;
    }

    public void setDisSayısı(int disSayısı) {
        this.disSayısı = disSayısı;
    }

    public Kopek(String isim, int kilo, int boy, int bacakSayisi, int disSayısı) {
        super(isim, kilo, boy, bacakSayisi);
        this.disSayısı = disSayısı;

    }

    public void hareketeGec(int hız) {
        System.out.println("hayvan " + hız + " ile hareket ediyor");
    }

        public void kos ( int hız){
            System.out.println("köpek koşuyor...");
            hareketeGec(hız);
        }
    }

