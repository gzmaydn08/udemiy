package projesehirturu;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static  void  islemleriBastir(){
        System.out.println("0- işlemleri görüntüle...");
        System.out.println("1- bir sonraki şehre git...");
        System.out.println("2- bir önceki şehre git...");
        System.out.println("3- uygulamadan çıkk...");
    }
    public static void sehirleriturla(LinkedList<String> sehirler){
        ListIterator<String> iterator = sehirler.listIterator();

        int islem;

        islemleriBastir();
        Scanner scanner = new Scanner(System.in);

        if ( !iterator.hasNext()){
            System.out.println("herhangi bir şehir bulunmuyor..");
        }

        boolean cikis = false;
        boolean ileri = true;


        while (!cikis){
            System.out.println("bir işlem seçiniz...");

            islem =scanner.nextInt();
            switch (islem){
                case 0:
                    islemleriBastir();
                    break;
                case  1:
                    if (!ileri){
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if (iterator.hasNext()){

                        System.out.println("şehre gidiliyor.."+ iterator.next());

                    }else {
                        System.out.println("gidilecek şehir kalmadı....");
                        ileri = true;
                    }
                    break;

                case  2:
                    if (ileri){
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if (iterator.hasPrevious()){
                        System.out.println("şehre gidiliyor..."+ iterator.previous());
                    }else {
                        System.out.println("şehir turu başladı");
                    }
                    break;

                case 3:
                    cikis = true;
                    System.out.println("uygulamadan çıkılıyor");
                    break;

            }


        }
    }
    public static void main(String[] args) {

        LinkedList<String>sehirler = new LinkedList<String>();

        sehirler.add("ankara");
        sehirler.add("eskişehir");
        sehirler.add("afyon");

        sehirleriturla(sehirler);



    }
}
