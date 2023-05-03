package agaın16_day16_arrays;

import java.util.Arrays;

public class C01_Syf90_Soru1 {

    public static void main(String[] args) {

        /*
        Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
                olusturun. Eski array’i yeni haliyle kaydedin.
         */

        int[] arr= {3,4,5,6};

        arr = arrayElementleriniArtir(arr,2);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] arrayElementleriniArtir(int[] ilkArr,int artis){//sonucu array döndüreceği için
                                                                       //public static int[] yazarız
        for (int i = 0; i <ilkArr.length ; i++) {

            ilkArr[i] +=artis;
        }

        return ilkArr;
    }
}




