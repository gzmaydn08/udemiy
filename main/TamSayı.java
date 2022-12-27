package main;

public class TamSayı {

    public static void main(String[] args) {

        byte a = 100;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        short b = 233;

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        //.......................................................


        // byte--> short--> int--> long

        short j = 1000;

        int i = (j / 2);

        System.out.println(i);

        short h = 100;
        byte p= 2;
        int s = 4;

        long d = h+p+s;

        System.out.println(d);


    }

}
