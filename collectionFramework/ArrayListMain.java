package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        //ArrayList<String> arrayList = new ArrayList<>();
        List<String> list = new ArrayList<>();


        list.add("java");
        list.add("python");
        list.add("c++");
        System.out.println(list.get(0));
        System.out.println(list.get(2));
       // System.out.println(list.get(4));//hata veirir
        System.out.println("***************************");

        for (int i = 0 ; i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("***************************");






    }
}
