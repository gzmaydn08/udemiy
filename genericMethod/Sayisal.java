package genericMethod;

public class Sayisal extends Aday {

    public Sayisal(int turkce, int mat, int edebiyat, int fizik) {
        super(turkce, mat, edebiyat, fizik);
    }

    @Override
    public int puanHesapla() {
        return getTurkce()*5+getMat()*5+getFizik()*4+getEdebiyat()*1;
    }
}
