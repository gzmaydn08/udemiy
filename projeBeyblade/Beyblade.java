package projeBeyblade;

public class Beyblade {
    private String beybladeci;
    private  int donusHizi;
    private int saliriGucu;

    public Beyblade(String beybladeci, int donusHizi, int saliriGucu) {
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saliriGucu = saliriGucu;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaliriGucu() {
        return saliriGucu;
    }

    public void setSaliriGucu(int saliriGucu) {
        this.saliriGucu = saliriGucu;
    }
    public void saldir(){
        System.out.println(getBeybladeci()+ " "+ saliriGucu+ " ve "+ donusHizi + " ile saldırıyorr...");
    }
    public void kutsalCanavarOrtayaCikar(){
        System.out.println("bu beyblade in kutsal canavarı yok");
    }
    public void bilgileriGoster(){
        System.out.println("beybladçi ismi = "+ beybladeci);
        System.out.println("saldırı gücü  = "+ saliriGucu);
        System.out.println("dönüş hızı = "+ donusHizi);
    }
}
