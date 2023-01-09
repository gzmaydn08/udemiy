package interface1;

public class Main {
    public static void main(String[] args) {

       // Imuhendis imuhendis = new Imuhendis() {

        PcMuhendisi muhendisi = new PcMuhendisi(false,false);
       /* muhendisi.askerlikDurumuSorgula();
        muhendisi.adliSicilSorgula();
        System.out.println(muhendisi.mezuniyetOrtalamasi(3.07));

        String[] tecrube = {"vestel","turksat","havelsan"};
        muhendisi.isTecrubesi(tecrube);
*/
        MakineMuhendisi makineMuhendisi = new MakineMuhendisi(true,false);

        String [] tecrube= {};
        String [] referans ={ "gizem","aydan"};
        makineMuhendisi.askerlikDurumuSorgula();
        makineMuhendisi.adliSicilSorgula();
        makineMuhendisi.mezuniyetOrtalamasi(2.31);
        makineMuhendisi.isTecrubesi(tecrube);
        makineMuhendisi.referansGetir(referans);
        makineMuhendisi.calis();
    }
}
