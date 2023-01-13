package linkedlistson;

public class Daire extends sekil{
    private int yaricap;
    public Daire(String isim, int yaricap) {
        super(isim);
        this.yaricap=yaricap;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim()+ " alanı "+( Math.PI*yaricap*yaricap));

    }
}
