package agaın20_day20_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_equals {

    public static void main(String[] args) {

        List<Integer> sayılar1=new ArrayList<>();
        sayılar1.add(3);
        sayılar1.add(8);
        sayılar1.add(1);
        sayılar1.add(2);

        List<Integer> sayılar2=new ArrayList<>();
        sayılar2.add(3);
        sayılar2.add(1);
        sayılar2.add(8);
        sayılar2.add(2);
        sayılar2.add(5);

        System.out.println(sayılar1.equals(sayılar2));//false  sayılar eşit olmadığından değil
        sayılar2.remove(4);// 5 i silelim
        System.out.println(sayılar1.equals(sayılar2));//false yine false verdi çünkü hem sayılar hem de sırala
                                                        //nışları aynı olmalı

        // equals hem elementleri hem de index'leri kontrol eder
        //önce sayılar1 ve sayılar2 Listlerini sıralamalıyız
        //Collections ile
        Collections.sort(sayılar1);//görmek istersek yazdırmalıyız
        Collections.sort(sayılar2);
        System.out.println("sayılar1 : "+sayılar1);//sayılar1 : [1, 2, 3, 8]
        System.out.println("sayılar2 : "+sayılar2);//sayılar2 : [1, 2, 3, 8]



        System.out.println(sayılar1.equals(sayılar2));//true eşit mi


    }
}
