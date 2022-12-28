package bolum2;

import java.util.Scanner;

public class USwitchCase1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir işlem giriniz...");

        int islem = scanner.nextInt();

        switch (islem){
            case 1 :
                System.out.println("1. işlem");
                break;
            case 2 :
                System.out.println("2. işlem");
                break;
            case 3 :
                System.out.println("3. işlem");
                break;
            case 4 :
                System.out.println("4. işlem");
                break;
            case 5 :
                System.out.println("5. işlem");
                break;
            default:
                System.out.println("geçersiz işlem...");
                break;
        }






    }
}
