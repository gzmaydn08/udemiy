package genericClasslar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();*/
        Character[] characters={'j','a','b'};
        Integer[] integers = {1,2,3,4,5,6};
        String[] strings= {"java","pyton"};
        Ogrenci[] ogrencis = {new Ogrenci("gizo"),new Ogrenci ("hjdaj")};


       /* CharYazdir.yazdir(characters);
        System.out.println("************");
        StringYazdir.yazdir(strings);
        System.out.println("************");
        IntYazdir.yazdir(integers);
        System.out.println("************");
        OgrenciYazdir.yazdir(ogrencis);*/

        YazdirmaSinifi<Character> yaazdirChar= new YazdirmaSinifi<>();
        YazdirmaSinifi<Integer> integerYazdirmaSinifi= new YazdirmaSinifi<>();
        YazdirmaSinifi<String> stringYazdirmaSinifi= new YazdirmaSinifi<>();
        YazdirmaSinifi<Ogrenci> ogrenciYazdirmaSinifi= new YazdirmaSinifi<>();

        yaazdirChar.yazdir(characters);
        System.out.println("******************");
        integerYazdirmaSinifi.yazdir(integers);
        System.out.println("******************");
        stringYazdirmaSinifi.yazdir(strings);
        System.out.println("******************");
        ogrenciYazdirmaSinifi.yazdir(ogrencis);





    }


}
