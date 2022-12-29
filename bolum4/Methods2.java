package bolum4;

public class Methods2 {
    public static void toplama(int a , int b , int c){

        System.out.println("toplamları = " + (a+b+c));

    }

    public static void selamlama ( String isim ){

        System.out.println("MERHABA...."+ isim);


    }

    public static void main(String[] args) {

        selamlama("murat");
        selamlama("ayşe");
        selamlama("ahmet");

        toplama(3,4,5);
        toplama(10,12,20);
    }
}
