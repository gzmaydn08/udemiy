package array;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {


    public static int[] arraydoldur(int sayi){

        Scanner scanner = new Scanner(System.in);

        int [] cikti = new int[sayi];

        for (int i = 0; i< sayi; i++){
            cikti[i] = scanner.nextInt();
        }
        return cikti;


    }

    public static void arrayiBastir(int[] array){
        for (int i =0 ; i< array.length ; i++){
            System.out.println("element "+ (i+1) + ": " + array[i]);
        }
    }
    public static void arraysort(int[] array){
        //arrays sınıfı
        Arrays.sort(array);
        arrayiBastir(array);


    }
    public static void main(String[] args) {
       /* int[] a= arraydoldur(5);
        arrayiBastir(a);
        System.out.println("*************");
        arraysort(a);*/


        int[] a1 ={1,2,3,4,5};
        int[] a2 ={1,2,3,4,5};

        if (Arrays.equals(a1,a2)){
            System.out.println("eşitler");
        }else {
            System.out.println("eşit değiller");
        }

    }
}
