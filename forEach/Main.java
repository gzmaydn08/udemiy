package forEach;

public class Main {
    public static void main(String[] args) {


        String [] array = {"elma", "artmut","muz"};
        Deneme[] array2 = { new Deneme("musti"),new Deneme("gizo"),new Deneme("çoşkun")};


        for (Deneme d: array2){
            d.yaz();

        }

    }
}
