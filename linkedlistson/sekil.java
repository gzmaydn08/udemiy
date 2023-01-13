package linkedlistson;

public  abstract class sekil {

    private String isim;

    public sekil(String isim) {
        this.isim = isim;
    }

    public void isminiSoyle(){
        System.out.println("bu obje "+isim+ " objesidir.");

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    abstract void alanHesapla();



}
