package genericMethod;

import genericClasslar.Ogrenci;

public class Test {
    public static void main(String[] args) {

        Sayisal sayisal = new Sayisal(30,40,20,30);
        Sayisal sayisal1= new Sayisal(25,45,2,35);
        Sayisal birinci = birinci(sayisal1,sayisal);
        System.out.println("birinci sayısal öğrencinin puanı : "+ birinci.puanHesapla());

        EsitAgir esitAgir = new EsitAgir(30,20,40,2);
        EsitAgir esitAgir1= new EsitAgir(40,10,50,0);

        EsitAgir birinci2 = birinci(esitAgir1,esitAgir);
        System.out.println("birinci eşit ağırlık öğrencinin puanı : "+ birinci2.puanHesapla());





      /*  Character[] characters={'j','a','b'};
        Integer[] integers = {1,2,3,4,5,6};
        String[] strings= {"java","pyton"};
        Ogrenci[] ogrencis = {new Ogrenci("gizo"),new Ogrenci ("hjdaj")};


        yazdir(characters);
        yazdir(integers);
        yazdir(strings);
        yazdir(ogrencis);
    }
    public static <E> void yazdir(E[]dizi){

        for (E e : dizi){
            System.out.println(e);
        }*/



    }
    public static < E extends Aday > E birinci(E s1, E s2){
        if (s1.puanHesapla() > s2.puanHesapla()){
            return  s1;
        }else {
            return  s2;
        }
    }
}
