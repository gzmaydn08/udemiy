package projeBeyblade;

public class BeybladeFabrikasi {
    public Beyblade beybladeUret(String beybladeTuru) {

        if (beybladeTuru.equals("Dragon")) {
            return new Dragon("takao", 800, 300, "mavi ejderha", "kutsal canavarla konuşma");

        } else if (beybladeTuru.equals("Dranza")) {
            return new Dranza("kain", 500, 400, "kırmızı anka kuşu");

        } else if (beybladeTuru.equals("Draciel")) {
            return new Draciel("max", 400, 1000, "kara kaplumbağa");
        } else {
            return null;
        }
    }
}
