package bolum2;

public class MantıksalOperatorler {

    public static void main(String[] args) {

        /*

        && --> and operatoru ==> tüm sonuçlar true ise true

        || --> or operatoru ==> sonuçlardan biri bile true olsa true

        ! --> not operatoru ==> sonuçları tersine çeviririr


         */

        System.out.println(3 == 3 && 2<3);
        System.out.println(3 == 3 && 2>3);

        System.out.println(3 == 3 || 2<3);
        System.out.println(3 == 3 || 2>3);
        System.out.println(3 == 4 || 2>3);

        System.out.println("murat" == "murat" && 2>3);
        System.out.println("murat" == "murat" || 2>3);

        System.out.println(! false);
        System.out.println(! true);
        System.out.println(! (3>4));

        System.out.println(!((3<4 && "murat" == "murat") || 3.4 > 2.1));






    }
}
