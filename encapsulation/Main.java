package encapsulation;

public class Main {
    public static void main(String[] args) {

        /*Abone abone =  new Abone();

        abone.isim = "gizem";
        abone.bakiye = 200;
        abone.sehir ="artvin";

        abone.dogalgazKullan(200)*/;

        GelismisAbone abone = new GelismisAbone("gizem",200,"artvin");
        abone.bakiyeOgren();



    }
}
