package composition;

public class Test {
    public static void main(String[] args) {

        Resolotion resolotion= new Resolotion(1920,1080);
        Monitor monitor= new Monitor("vs197de", "asus","18.5",resolotion );

        Kasa kasa = new Kasa("shadow blade", "shadow","temperli cam");
        Anakart anakart= new Anakart("b250-pro","asus",10, "windows 10");

        Bilgisayar pc = new Bilgisayar(monitor,kasa,anakart);

        pc.getKasa().bilgisayariAc();
        pc.getMonitor().monitoruKapat();
        pc.getAnakart().isletimsisYukle("ubuntu 16.04");


    }
}
