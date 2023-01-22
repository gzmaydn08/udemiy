package projeee4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("mat ve fizik problemleri programına hoşgeldiniz.....");
        String islemler= "işlemler....\n" +
                "1. daire alanı \n" +
                "2. üçgen çevresi\n" +
                "3. iç çarpım hesaplma\n" +
                "çıkış q";


        while (true){
            System.out.println(islemler);
            System.out.print("işlemi seçiniz");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("programdan çıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                System.out.print("dairenin yarıçapı");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daireAlan(yaricap);



            } else if (islem.equals("2")) {
                System.out.print("kenar 1:");
                int kenar1=scanner.nextInt();
                System.out.print("kenar 2:");
                int kenar2=scanner.nextInt();
                System.out.print("kenar 3:");
                int kenar3=scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.ucgenCevre(kenar1,kenar2,kenar3);




            } else if (islem.equals("3")) {
                Vec vec1 = new Vec("vektör1");
                Vec vec2 = new Vec("vektör2");

                Problem.Fizik.icCarpim(vec1,vec2);


            }else {
                System.out.println("geçersiz işlem....");
            }
        }




    }
}

