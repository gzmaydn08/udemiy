package projee;

public class Main {
    public static void main(String[] args) {


        Atm atm = new Atm();

        Hesap hesap = new Hesap("gizemm","12362",2000);
        atm.calis(hesap);
        System.out.println("programdan çıkılıyor");

    }
}
