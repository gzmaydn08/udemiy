package bolum3;

import main.Scan;

import java.util.Scanner;

public class MiniProje4 {
    public static void main(String[] args) {

        // while ile kullanıcı girişi yazmak

        Scanner scanner = new Scanner(System.in);

        int girisHakki = 3;

        String sys_kullanici_adi ="mustafa murat";
        String pwd = "12345";
        System.out.println("**********************");
        System.out.println("kullanıcı girişine hoşgeldiniz..");
        System.out.println("**********************");


        while (true){
            System.out.print("kullanıcı adı");
            String kullanici = scanner.nextLine();
            System.out.print("parola : ");
            String parola = scanner.nextLine();

            if (kullanici.equals(sys_kullanici_adi)&& parola.equals(pwd)){
                System.out.println("hoşgeldiniz.."+kullanici);
                break;
            } else if ( kullanici.equals(sys_kullanici_adi)&& !parola.equals(pwd)) {
                System.out.println("parolanız yanlış");
                girisHakki -= 1;
                System.out.println("giriş hakkı : " + girisHakki);

            }else if ( !kullanici.equals(sys_kullanici_adi)&& parola.equals(pwd)) {
                System.out.println("kullanıcı adınız  yanlış");
                girisHakki -= 1;
                System.out.println("giriş hakkı : " + girisHakki);
            }else {
                System.out.println("kullanıcı adınız ve parolanız yanlış");
                girisHakki -= 1;
                System.out.println("giriş hakkı : " + girisHakki);
            }if (girisHakki == 0){
                System.out.println("giriş hakkınız bitti tekrar bekleriz");
                break;
            }


        }


    }
}
