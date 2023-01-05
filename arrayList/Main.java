package arrayList;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void yazdir(ArrayList<String> a){
        for (int i = 0; i< a.size();i++){
            System.out.println("element "+(i+1)+": "+a.get(i));
        }

    }
    public static void main(String[] args) {


        ArrayList <String> arraylist = new ArrayList<String>();

        arraylist.add("metalika");
        arraylist.add("guns n roses");
        arraylist.add("black");
        arraylist.add("iron maiden");
        arraylist.add("metalika");

       /* System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(2));

        System.out.println(arraylist.size());
*/
        //arraylist.remove(1);//kaldırma

       /* System.out.println(arraylist.indexOf("metalika"));
*//*
        for (int i = 0 ; i <arraylist.size();i++){
            System.out.println(arraylist.get(i));
        }*/

        //arraylist.set(4,"megatedt");


        yazdir(arraylist);





    }
}
