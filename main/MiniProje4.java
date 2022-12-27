package main;

import java.util.Scanner;

public class MiniProje4 {
    public static void main(String[] args) {

        //dik üçgenin hipotenüsünü bulma

        Scanner scanner = new Scanner(System.in);
        int a ;
        int b ;

        System.out.print("birinci kenar : ");
        a= scanner.nextInt();
        System.out.print("ikinci kenar : ");
        b = scanner.nextInt();

        double h =Math.sqrt(a*a + b*b) ;
        System.out.println("hipotenüs : " + h );






    }
}
