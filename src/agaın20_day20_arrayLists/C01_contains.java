package agaın20_day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {

    public static void main(String[] args) {

        // uzun bir listeyi java'da list olarak kaydetmek istersek
        // tek tek eklemek istemezseniz
        // pratik olarak bir array olusturup,
        // loop ile tum elementleri list'e ekleyebiliriz

        int[] arr={2, 3, 5, 4, 3, 6, 7, 5, 4, 3, 2, 5, 6, 8, 6, 5, 1};

        List<Integer>sayılar=new ArrayList<>();//List oluşturduk
        //for ile arrays dekileri List te


        for (int i = 0; i <arr.length ; i++) {//tek tek eklemek yerine for ile ekleriz
            sayılar.add(arr[i]);

        }
        System.out.println(sayılar);//direk yazdırabiliriz [2, 3, 5, 4, 3, 6, 7, 5, 4, 3, 2, 5, 6, 8, 6, 5, 1]


        // listede element olarak 3 var mi (contains) ? booleon sonuç döndürür


        System.out.println(sayılar.contains(3));//true//sayılar listesinde 3 var mı demektir
        System.out.println(sayılar.contains(9));//false


        sayılar.clear();//sout içerisinde yapılamıyor
        System.out.println(sayılar);//[]   List teki tüm elementleri siler


    }
}
