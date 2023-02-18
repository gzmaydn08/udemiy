package multiTreading;

import multiTreading.com.gizem.Printer;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer("printer1");
        Printer printer1= new Printer("printer2");

        printer1.start();
        printer.start();

        //birçok çalışma ünitesi ooluşturup bir çok işi aynı aynda yapmak multitreading

        System.out.println("main thread çalışıyor... ");





    }


}
