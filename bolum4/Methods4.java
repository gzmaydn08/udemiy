package bolum4;

public class Methods4 {
    public static void skorhesaplama(String isim,int puan){
        System.out.println(isim + "adlı oyuncunun "+ puan+ " puanı var");
    }

    public static void skorhesaplama(int puan){
        System.out.println("isimsiz oyuncunun "+ puan+ " puanı var");
    }
    public static void skorhesaplama(String isim){
        System.out.println(isim+" adlı oyuncunun puanı yok");
    }
   /* public static  void toplama(String a, String b){
        System.out.println(a+ " "+b);
    }
    public static void toplama(int a, int b){
        System.out.println("Toplamları = "+ (a+b));
    }

    public static void  toplama(int a,int b,int c){

        System.out.println("Toplamları = "+ (a+b+c));
    }*/

    public static void main(String[] args) {

        //overloading
/*
        toplama(2,5);
        toplama(2,5,9);
        toplama("mustafa","murat");*/

        skorhesaplama("murat",1000);

        skorhesaplama("mehmet");

        skorhesaplama(1000);

    }
}
