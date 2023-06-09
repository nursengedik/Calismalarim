package agaın20_day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {

    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("Kubra");
        isimler.add("Mustafa");
        isimler.add("Emre");
        isimler.add("Ferhat");
        isimler.add("Erdal");

        System.out.println(isimler);//[Kubra, Mustafa, Emre, Ferhat, Erdal]

        // 2.index'deki elementi yazdirin  get methodu ile yapılır

        System.out.println(isimler.get(2));// Emre yazdırır

        //Ferhat'ın index'ini yazdırın

        System.out.println(isimler.indexOf("Ferhat")); // 3 -indexOf aramaya baştan başlar

        System.out.println(isimler.lastIndexOf("Ferhat")); // 3 -sondan aramaya başlar ve ilk bulduğu
        //Ferhat ın index'ini verir

        System.out.println(isimler.indexOf("Hilal")); // -1 olmayan bir elementin index i
        System.out.println(isimler.lastIndexOf("Gokhan")); // -1  - yok olduğunu belirtmek için -1 verir


        isimler.add("Mustafa");
        System.out.println(isimler); // [Kubra, Mustafa, Emre, Ferhat, Erdal, Mustafa]


        System.out.println(isimler.indexOf("Mustafa")); // 1 baştan


        System.out.println(isimler.lastIndexOf("Mustafa")); // 5 sondan

    }
}
