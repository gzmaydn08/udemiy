package bolum4;

public class Methods5 {
    public static void toplama(int a,int b,int c){
        int deneme = 10;
        System.out.println("toplama sonucu : "+ (a+b+c));
    }


    public static void main(String[] args) {

        toplama(10,20,30);
        //System.out.println(a);// sadece methodun içinde tanımlandığı için hata verdi
        //System.out.println(deneme);// sadece methodun içinde tanımlandığı için hata verdi

       /* int a =4;
        String yazdir = "merhaba";
        if (a<10){
            int b= 5;
            System.out.println(yazdir);
        }

        //System.out.println(b); hata verdi*/
      /*
        int i;// döngünün dışında tanımlarsak kod bloğunun dışında görebiliriz
        for ( i = 0; i<10;i++){
            System.out.println(i);
        }

        System.out.println(i);*/

       /* int i =1;
        while (i<10){

            if (i%2 ==0){
                String yazdir = "çift";
                System.out.println(yazdir);
            }
            System.out.println(yazdir);
            i++;
        }
*/



    }
}
