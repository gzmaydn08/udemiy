package interface1;

public class MakineMuhendisi implements Imuhendis,Icalisma {
    @Override
    public void calis() {
        System.out.println("makine mühendiği çalışıyor..");
    }

    public void referansGetir (String[] array) {
        if (array.length == 0) {
            System.out.println("referansım bulunmuyor");
        } else {
            System.out.println("referanslarım : ");
            for (int i = 0; i < array.length; i++) {
                System.out.println(i);

            }
        }
    }

    private boolean askerlik;
    private boolean adlisicil;

    public MakineMuhendisi(boolean askerlik, boolean adlisicil) {
        this.askerlik = askerlik;
        this.adlisicil = adlisicil;
    }

    @Override
    public void askerlikDurumuSorgula() {
        if (askerlik) {
            System.out.println("askerliğimi yaptım...");
        } else {
            System.out.println("askerliğimi henüz yapmadım...");
        }

    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "ortalamam : " + derece;
    }

    @Override
    public void adliSicilSorgula() {
        if (adlisicil) {
            System.out.println("adli sici kaydım bulunuyor");
        } else {
            System.out.println("adli sicilim bulunmuyor..");
        }

    }

    @Override
    public void isTecrubesi(String[] array) {
        if (array.length == 0) {
            System.out.println("iş tecrübem bulunmuyor");
        } else {
            System.out.println("makine mühendisi olarak şuralarda çalıştım : ");
            for (int i = 0; i < array.length; i++) {
                System.out.println(i);
            }
        }

    }


}
