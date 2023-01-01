package kalitim;

public class Yonetici extends Calisan {//subclass

    private int sorumluKisi;// ekstra özellik

    public Yonetici(String isim , int maas ,String departman, int sorumluKisi){
       /* this.isim=isim;
        this.maas=maas;
        this.departman = departman;*/

        super(isim,maas,departman);
        this.sorumluKisi = sorumluKisi;





    }

    public  void  zamYap(int zamMiktari){
        System.out.println("zam miktarı : "+zamMiktari);
    }

    public  void bilgileriGoster(){
        /*System.out.println("isim : "+getIsim());
        System.out.println("maaş : "+getMaas());
        System.out.println("departman : "+getDepartman());*/

        super.bilgileriGoster();

        System.out.println("sorumlu kişi sayısı : "+this.sorumluKisi);
    }
}
