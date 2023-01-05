package proje4;

import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> sarkiciListesi =new ArrayList<String>();

    public void sarkicilariBastir(){
        System.out.println("şarkıcı listesinde "+sarkiciListesi.size() + " kadar şarkıcı var");
        for (int i =0 ; i< sarkiciListesi.size();i++){
            System.out.println((i+1)+" şarkıcı : "+sarkiciListesi.get(i));
        }
    }
    public void sarkiciEkle(String isim){
        sarkiciListesi.add(isim);
        System.out.println("şarkıcı listesi güncellendi...");
    }
    public void sarkiciGuncelle(String yeniisim, int pozisyon){
        sarkiciListesi.set(pozisyon ,yeniisim);
        System.out.println("şarkıcı listesi güncellendi...");
    }
    public void sarkiciSil(int pozisyon){
        String isim = sarkiciListesi.get(pozisyon);

        sarkiciListesi.remove(pozisyon);

        System.out.println(isim + " isimli şarkıcı listeden silindi...");

    }
    public void sarkiciAra(String sarkiciisim){
        int pozisyon = sarkiciListesi.indexOf(sarkiciisim);

        if (pozisyon >= 0){
            System.out.println("şarkıcı bulundu...");
            System.out.println(sarkiciisim + "  isimli şarkıcı "+ (pozisyon+1)+ " . pozisyonda ");
        }else {
            System.out.println("şarkıcı bulunamadı...");
        }
    }
}

