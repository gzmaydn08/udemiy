package projeBeyblade;

public class Dranza extends Beyblade {

    private String kutsalCanavar;

    public Dranza(String beybladeci, int donusHizi, int saliriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saliriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("kutsal canavar : " +kutsalCanavar );
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        super.kutsalCanavarOrtayaCikar();
        System.out.println(getBeybladeci() + " "+ kutsalCanavar+ " ı ortaya çıkarıyor..");
        System.out.println(getBeybladeci()+ " ın saldırısı : alev kılıcı");
    }
}
