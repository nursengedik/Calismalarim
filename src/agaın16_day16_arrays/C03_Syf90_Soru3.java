package agaın16_day16_arrays;

import java.util.Arrays;

public class C03_Syf90_Soru3 {

    public static void main(String[] args) {

         /*
           Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
                   sondaki elementi de basa tasiyacak bir method olusturun,
                   array’i yeni haliyle kaydedin.
                   Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
         */

        //method yazdırmaya göre çözüm

        int [] arr={4,5,6,7};

        sagaKaydır(arr);

    }

    private static void sagaKaydır(int [] arr) {
                                      //önce son element temp e atanır
        int temp = arr[arr.length-1];//arr'nin son elementinin index'ini bulma

        for (int i = 0; i < arr.length-1 ; i++) {

            arr[arr.length-1-i] = arr[arr.length-2-i];//kodun dinamik olması için arr[3]=arr[2]; arr[2]=arr[1];
        }                                             //arr[1]=arr[0]; yerine arr.length-1=arr.length-2 yazılır
                                                     //i'ye bağlı değişeceği için arr.length-1-i=arr.length-2-i
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }


}
