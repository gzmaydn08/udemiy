package interface1;

public class PcMuhendisi implements Imuhendis{


    private  boolean askerlik;
    private boolean adliSicil;

    public PcMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    @Override
    public void askerlikDurumuSorgula() {
        if (askerlik){
            System.out.println("askerliğimi yaptım...");
        }else {
            System.out.println("askerliğimi henüz yapmadım...");
        }

    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {

        return "ortalamam : "+derece;
    }

    @Override
    public void adliSicilSorgula() {
        if (adliSicil){
            System.out.println("adli sici kaydım bulunuyor");
        }else{
            System.out.println("adli sicilim bulunmuyor..");
        }

    }


    public void isTecrubesi (String [] array) {
        System.out.println("bilgisayar mühendisi olarak şu şirketlerde çalıştım : ");
        for (int i =0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }
}
