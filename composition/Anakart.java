package composition;

public class Anakart {
    private  String model;
    private String uretici;
    private int yuvaSayisi;
    private  String isletimsis;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuvaSayisi() {
        return yuvaSayisi;
    }

    public void setYuvaSayisi(int yuvaSayisi) {
        this.yuvaSayisi = yuvaSayisi;
    }

    public String getIsletimsis() {
        return isletimsis;
    }

    public void setIsletimsis(String isletimsis) {
        this.isletimsis = isletimsis;
    }

    public Anakart(String model, String uretici, int yuvaSayisi, String isletimsis) {
        this.model = model;
        this.uretici = uretici;
        this.yuvaSayisi = yuvaSayisi;
        this.isletimsis = isletimsis;

    }
    public void isletimsisYukle( String isletimsis){
        this.isletimsis =isletimsis;

        System.out.println("işletim sistemi yüklendi : " +isletimsis);
    }
}
