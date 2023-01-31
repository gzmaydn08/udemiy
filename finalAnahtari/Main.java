package finalAnahtari;

public class Main {
    public static void main(String[] args) {
       /* FinalTest f1 = new FinalTest("obje 1");
        FinalTest f2 = new FinalTest("obje 2");

        System.out.println("obje sayısı: "+ f1.objeSayisi);
        System.out.println("obje sayısı: "+ f2.objeSayisi);*/

        //System.out.println(Math.PI);
       /* Math.PI=3.15;*/


       /* System.out.println("database ismi : " +Database.databaseIsmi);
        System.out.println("username : " +Database.userName);
        System.out.println("password : " +Database.password);*/

        Database database= new Database();
        database.baglantiKur("root","12345");

    }
}
