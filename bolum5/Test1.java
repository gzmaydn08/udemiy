package bolum5;

public class Test1 {

    public static void main(String[] args) {


        Account account1 = new Account();

       /* Account account2 = new Account("123456",1000.0,"gizem aydan yüksel","g.yuksel@org.tr","0542222");

        account2.paraCekme(2000);*/

        //System.out.println(account1.getEmail());

        Account account2 = new Account("ahmet can", "hfkdsjsfhsdjh", "522522552");

        /*System.out.println(account2.getBakiye());

        System.out.println(account2.getEmail());*/

        account2.bilgileriGoster();
    }

    }

