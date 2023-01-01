package projee;

import java.util.Scanner;

public class Login {

    public boolean Login( Hesap hesap ){

        Scanner scanner = new Scanner(System.in);
        String kullanicic_adi;
        String parola;

        System.out.print("kullanıcı adı : ");
        kullanicic_adi= scanner.nextLine();
        System.out.print("parola : ");
        parola =scanner.nextLine();

        if (hesap.getKullanici_adi().equals(kullanicic_adi) && hesap.getParola().equals(parola) ){
            return true;

        }else {
            return false;
        }
    }
}
