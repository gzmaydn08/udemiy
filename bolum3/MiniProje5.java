package bolum3;

import java.util.Scanner;

public class MiniProje5 {
    public static void main(String[] args) {

        //faiz uygulaması

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz. Faiz oranı : %6");

        int anaPara , vade;
        System.out.print("yatrımak istediğiniz tutar: ");
        anaPara = scanner.nextInt();
        System.out.print("paranızı kaç yıl vadeli yatırmak istiyosunuz");
        vade = scanner.nextInt();

        double toplamPara = anaPara;
        double faizOrani = 0.06;

        for (int i = 1; i<=vade ; i++){

            toplamPara = (toplamPara*faizOrani) + toplamPara;
            System.out.println(i + " . yılın sonunda toplam para : " + (int) toplamPara);
        }





    }
}
