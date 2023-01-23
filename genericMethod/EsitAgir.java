package genericMethod;

public class EsitAgir extends Aday{
    public EsitAgir(int turkce, int mat, int edebiyat, int fizik) {
        super(turkce, mat, edebiyat, fizik);
    }

    @Override
    public int puanHesapla() {
        return getEdebiyat()*4+getFizik()*1+getTurkce()*5+getMat()*5;
    }
}
