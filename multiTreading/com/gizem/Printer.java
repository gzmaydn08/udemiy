package multiTreading.com.gizem;

public class Printer  extends  Thread {

    private  String isim;




    @Override
    public void run() {
        super.run();
        System.out.println(isim+" çalışıyor... ");

        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(isim+" yazıyor: "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(" thead kesintiye uğradı. ");
            }
        }
        System.out.println(isim+ " işini bitirdi ...");
    }

    public Printer(String isim) {
        this.isim = isim;
    }
}
