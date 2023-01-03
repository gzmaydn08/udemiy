package projeBeyblade;

public class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donusHizi, int saliriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saliriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("kusatl canavar adı = "+kutsalCanavar);
        System.out.println("gizli yetenek = "+ gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        super.kutsalCanavarOrtayaCikar();
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor..");
        System.out.println(getBeybladeci()+ " ın saldırıcı : hayalet kasırsa");
    }
}

