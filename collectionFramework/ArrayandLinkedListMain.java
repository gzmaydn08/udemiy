package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayandLinkedListMain {
    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();// daha hızlı
        ArrayList<Integer> arrayList = new ArrayList<>();



        zamanhesapla("linkedlist",l);
        zamanhesapla("arraylist",arrayList);



    }
    public static void zamanhesapla(String veriTipi, List<Integer> list){
        //listin sonuna değer ekleme
        long baslangic;
        long bitis;
        baslangic= System.currentTimeMillis();

        for (int i = 0; i<1000000; i++){
            list.add(i);
        }
        bitis = System.currentTimeMillis();

        System.out.println(veriTipi + " ekleme süresi "+ (bitis-baslangic)+ " ms");

    }
}
