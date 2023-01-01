package composition;

public class Monitor {

    private String model;
    private  String uretici;
    private String boyut;
    private Resolotion resolotion;

    public Monitor(String model, String uretici, String boyut, Resolotion resolotion) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resolotion = resolotion;
    }
    public void monitoruKapat(){
        System.out.println("monitör kapatılıyor");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public Resolotion getResolotion() {
        return resolotion;
    }

    public void setResolotion(Resolotion resolotion) {
        this.resolotion = resolotion;
    }
}

