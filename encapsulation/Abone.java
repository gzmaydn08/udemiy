package encapsulation;

public class Abone {

    public String isim;
    public int bakiye;
    public String sehir;

    public void dogalgazKullan(int miktar){

        if ((this.bakiye-miktar) <0){
            System.out.println("yeterli bakiye yok");
        }else {
            this.bakiye -= miktar;
            if (this.bakiye <= 0){
                System.out.println("bakiyeniz bitmiştir. lütfen en yakın kredi merkezine gidip kredi yükleyin"+
                        "kredi limiti = 120 tl");
            }else {
                System.out.println("yeni bakiye : "+ bakiye);
            }
        }
    }
   public void bakiyeOgren(){
       System.out.println("bakiye : " +bakiye);
   }

}
