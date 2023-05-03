package agaın16_day16_arrays;

public class C05_Syf90_Soru4 {

    public static void main(String[] args) {

         /*
          Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve
                  varsa kac kere kullanildigini yazdiran bir method olusturun.
         */

        int [] arr={4,7,9,1,2,7,1,8,9,1};

        elemanSayısıYazdır(arr, 7);
        elemanSayısıYazdır(arr, 1);
        elemanSayısıYazdır(arr, 4);

        String [] arr2={"A", "B", "C", "A", "D", "C"};
        kelimeSayisiYazdir(arr2,"A");
        kelimeSayisiYazdir(arr2,"C");
        
    }

    public static void elemanSayısıYazdır(int [] arr,int arananEleman) {

        int flag=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == arananEleman){
                flag++;
            }
        }

        System.out.println(arananEleman+ " sayısı " + flag + " kez kullanılmıştır ");

    }

    public static void kelimeSayisiYazdir(String [] arr2 , String arananEleman){

        int flag=0;

        for (int i = 0; i < arr2.length ; i++) {


            if (arr2 [i].equals(arananEleman)){
                flag++;
            }
        }

        System.out.println(arananEleman+ " sayısı " + flag + " kez kullanılmıştır ");

    }
}
