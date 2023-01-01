package projee2;

public class Idman {

    private int burpee;
    private int pushup;
    private  int sithup;
    private int squat;

    public Idman(int burpee, int pushup, int sithup, int squat) {
        this.burpee = burpee;
        this.pushup = pushup;
        this.sithup = sithup;
        this.squat = squat;
    }

    public int getBurpee() {
        return burpee;
    }

    public void setBurpee(int burpee) {
        this.burpee = burpee;
    }

    public int getPushup() {
        return pushup;
    }

    public void setPushup(int pushup) {
        this.pushup = pushup;
    }

    public int getSithup() {
        return sithup;
    }

    public void setSithup(int sithup) {
        this.sithup = sithup;
    }

    public int getSquat() {
        return squat;
    }

    public void setSquat(int squat) {
        this.squat = squat;
    }
    public void  hareketYap (String hareketTuru,int sayi){
        if (hareketTuru.equals("burpee")){

            this.burpee(sayi);

        } else if (hareketTuru.equals("sithup")) {
            this.sithup(sayi);

        } else if (hareketTuru.equals("squat")) {
            this.squat(sayi);

        } else if (hareketTuru.equals("pushup")) {
            this.pushup(sayi);

        }else {
            System.out.println("geçersiz");
        }

    }
    public void burpee(int sayi){
        if (burpee == 0){
            System.out.println("yapacak burpee kalmadı");

        }if (burpee - sayi<0){
            System.out.println("hedefi geçtin tebrikler");
            burpee = 0;
            System.out.println("kalan burpee : "+burpee);

        }else {
            burpee -= sayi;
            System.out.println("kalan burpee : "+burpee);
        }
    }public void sithup(int sayi){
        if (sithup == 0){
            System.out.println("yapacak sithup kalmadı");

        }if (sithup - sayi<0){
            System.out.println("hedefi geçtin tebrikler");
            sithup = 0;
            System.out.println("kalan sithup : "+sithup);

        }else {
            sithup -= sayi;
            System.out.println("kalan sithup  : "+sithup);
        }
    }public void squat(int sayi){
        if (squat == 0){
            System.out.println("yapacak squat kalmadı");

        }if (squat - sayi<0){
            System.out.println("hedefi geçtin tebrikler");
            squat = 0;
            System.out.println("kalan squat : "+ squat);

        }else {
            squat -= sayi;
            System.out.println("kalan squat : "+ squat);
        }
    }public void pushup(int sayi){
        if( pushup == 0){
            System.out.println("yapacak pushup kalmadı");

        }if (pushup - sayi<0){
            System.out.println("hedefi geçtin tebrikler");
            pushup = 0;
            System.out.println("kalan pushup : "+ pushup);

        }else {
            pushup -= sayi;
            System.out.println("kalan pushup  : "+ pushup);
        }
    }

    public  boolean idmanBittiMi (){
        return (burpee == 0) && ( pushup ==0) && (sithup == 0) && (squat == 0);
    }
}
