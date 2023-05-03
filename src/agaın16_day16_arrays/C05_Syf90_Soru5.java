package agaın16_day16_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_Syf90_Soru5 {

    public static void main(String[] args) {

         /*
           Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip
                   array’i olusturan ve bize donduren bir method olusturun.
         */

        int [] yeniArr= arrayOlusturma();
        System.out.println(Arrays.toString(yeniArr));

    }

    private static int [] arrayOlusturma() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen array'ın uzunluğunu giriniz");
        int uzunluk= scan.nextInt();
        int [] arr= new int[uzunluk]; // array oluşturduk
        for (int i = 0; i < uzunluk; i++) {// for ile array'in içi doldurulur
            System.out.println("Array " + (i+1) + " . elemanı giriniz");
            arr[i]=scan.nextInt();
        }
        return  arr;


    }


}
