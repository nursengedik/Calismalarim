package agaın16_day16_arrays;

public class C02_Syf90_Soru2 {

    public static void main(String[] args) {

        /*
        Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
                method yaziniz.
        */

      int[] arr={5, 8, -9, 12, -6};

      int sonuc=pozitifTamsayilariTopla(arr);
      System.out.println(sonuc);
      //System.out.println(pozitifTamsayilariTopla(arr));//13-14 ve 15 satırları yapmadan da sadece bu satırla da
                                                        //sonuç döndürülebilir

    }


    public  static  int pozitifTamsayilariTopla(int[]arr){//sonuçta array değil de toplam döndüreceği için
        int toplam=0;                                //public  static  int yazılır
        for (int i = 0; arr.length > i; i++) {
            if (arr[i]>0){
                toplam+=arr[i];
            }
        }
        return toplam;






    }


}
