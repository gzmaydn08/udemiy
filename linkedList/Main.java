package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void listeyiBastir(LinkedList<String>gidilecekYerler) {
        /*for (String s: gidilecekYerler){
            System.out.println(s);
        }*/
        ListIterator<String> iterator = gidilecekYerler.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


public static void siraliEkle(LinkedList<String> gidilecekYerler,String yeni){
        ListIterator<String> iterator = gidilecekYerler.listIterator();
        while (iterator.hasNext()){

            int karsilastir = iterator.next().compareTo(yeni);
            if (karsilastir == 0){
                System.out.println("listenizde bu eleman zaten var...");
                return;

            } else if (karsilastir <0) {


            } else if (karsilastir > 0) {
                iterator.previous();
                iterator.add(yeni);

                return;


            }

        }
        iterator.add(yeni);


}
    public static void main(String[] args) {

        LinkedList<String> gidilecekYerler = new LinkedList<String>();

        siraliEkle(gidilecekYerler, "postane");
        siraliEkle(gidilecekYerler, "market");
        siraliEkle(gidilecekYerler, "ev");
/*
        gidilecekYerler.add("postane");
        gidilecekYerler.add("okul");
        gidilecekYerler.add("ev");
        gidilecekYerler.add("kütüphane");

        listeyiBastir(gidilecekYerler);
        System.out.println("*****************************");

       *//* gidilecekYerler.add(2,"alışveriş merkezi");*//*
       *//* gidilecekYerler.remove(3);*//*
        listeyiBastir(gidilecekYerler);*/

        listeyiBastir(gidilecekYerler);



    }
}
