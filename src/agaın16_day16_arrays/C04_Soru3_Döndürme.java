package agaın16_day16_arrays;

import java.util.Arrays;

public class C04_Soru3_Döndürme {

    public static void main(String[] args) {


          /*
           Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
                   sondaki elementi de basa tasiyacak bir method olusturun,
                   array’i yeni haliyle kaydedin.
                   Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
         */

        //method döndürmeye ve array'i kaydetmeye göre çözüm

        int [] arr={4,5,6,7};
        int [] yeniArr=sagaKaydır(arr);
        System.out.println(Arrays.toString(yeniArr));

    }

    private static int [] sagaKaydır(int [] arr) {

    int sonElement= arr[arr.length-1];

        for (int i = arr.length-1; i >0 ; i--) {

            arr[i]=arr[i-1];
        }
        arr[0]=sonElement;
        return  arr;
    }

}
