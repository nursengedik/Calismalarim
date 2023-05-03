package agaın16_day16_arrays;

import java.util.Arrays;

public class C07_Syf90_Soru7 {

    public static void main(String[] args) {

         /*
         Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
                 eski array’e yeni degeri atayin.
         */

        int [] arr={4,5,8,9,3,6,7};

        // arr'ye method'u kullanarak 5,1,2 ekleyelim

        arr=arrayeElemanEkleme(arr,5);
        arr=arrayeElemanEkleme(arr,1);
        arr=arrayeElemanEkleme(arr,2);
        System.out.println(Arrays.toString(arr));

    }

    private static int [] arrayeElemanEkleme( int [] arr,int eklenecekEleman) {

        //önce yeni array oluşturulur

        int[] yeniArr= new int[arr.length+1]; // [0,0,0,0,0]//yeni array'in uzunluğu eskinin 1 fazlası olacak

        for (int i = 0; i < arr.length ; i++) {//daha sonra for loop'la eski elementleri kaybetmemek için
                                              //yeni array'e atanır
            yeniArr[i]=arr[i];

        } // yeniArr [2,4,7,8,0]

        yeniArr[yeniArr.length-1] = eklenecekEleman;//daha sonra yeni elementi ekleriz

        return yeniArr;

    }


}
