package finalAnahtari;

public class FinalTest {
    public final int objeSayisi;
    private static int say = 0;
    private final String isim;

    public FinalTest (String isim) {


        this.isim = isim;
        say++;
        objeSayisi = say;
    }

}
