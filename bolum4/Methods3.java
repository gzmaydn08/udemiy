package bolum4;

public class Methods3 {

  /*  public static int toplama(int a, int b ,int c){
       // System.out.println(a+b+c);
        return (a+b+c); }*/

    public static int ikiilecarp (int a){
        return a*2;// returnlerin altına yazılanlar çağırılmazzzz!!!!!!!!!!!!!!!! hata verirr!!!!!!!!!!
    }

    public static int ikiiletopla (int a){
        return a+2;
    }

    public static int dortilecarp(int a){
        return  a*4;
    }

    public static void main(String[] args) {

       /* System.out.println("Çıktı değeri : "+ toplama(1,2,3));
*/


        System.out.println("sonuç : "+ dortilecarp(ikiiletopla(ikiilecarp(8))));


    }
}
