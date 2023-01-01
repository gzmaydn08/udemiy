package projee;

import java.util.Scanner;

public class Atm {
    public void calis(Hesap hesap){
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);
        System.out.println("bankamıza hoşgeldiniz..");
        System.out.println("******************************************");

        System.out.println("kullanıcı girişi..");
        System.out.println("******************************************");

        int girisHakkı = 3;
        while (true){

            if (login.Login(hesap)){
                System.out.println("giriş başarılı");
                break;

            }else {
                System.out.println("giriş başarısız");
                girisHakkı -= 1;
                System.out.println("kalan giriş hakkı : " +girisHakkı);
            }if (girisHakkı == 0){
                System.out.println("giriş hakkınız bitti ");
                return;
            }
        }
        System.out.println("************************************");
        String islemler = "1. bakiye görüntüle\n" +
                "2. para yatırma\n" +
                "3. para çekme\n" +
                "çıkış için q";
        System.out.println(islemler);
        System.out.println("*************************************");


        while (true){
            System.out.println("işlemi seçiniz");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                break;
            } else if (islem.equals("1")) {
                System.out.println("bakiyeniz : "+ hesap.getBakiye());

            } else if ( islem.equals("2")) {
                System.out.println("yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            } else if (islem.equals("3")) {
                System.out.println("çekmek istedğiniz tutar :");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paracek(tutar);
            }else {
                System.out.println("geçersiz işlemm");
            }
        }
    }
}
