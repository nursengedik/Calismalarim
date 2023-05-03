package agaın13_day13;

public class C07_Syf73Soru1 {

    public static void main(String[] args) {
       /*
           Metod olusturma asamaları;
           1- public static standart (simdilik)
           2- olusturdugumuz method bize bir sonuc dondurecekse
              dondurecegi sonucun data turunu yaz
           3- method ismi
           4- method parantezi () icine methoda gondermemiz gereken
              bilgileri hangi variable ile gonderecegimizi yaz (parametre)
           5- dondurulmesi istenen islemi yap,
           6- return keyword kullanarak donrulmesi istenen degeri dondur
         */


        //Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        //        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        //        bir method olusturun.
        //       - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
        //       - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin


        String metin = "javaharika";

        indexYazdırma("javaharika",5,9);
        indexYazdırma("javaharika",0,4);


    }

    public  static void indexYazdırma (String metin, int baslangıcIndex, int bitisIndex){

        int baslangicIndex;
        if (baslangıcIndex>bitisIndex){
            System.out.println("Hata");
        } else if (metin.length() <baslangıcIndex || metin.length()  <bitisIndex) {
            System.out.println("Hata veriyor");
        }else {
            metin=metin.substring(baslangıcIndex,bitisIndex);
            System.out.println(metin);
        }
    }

}









