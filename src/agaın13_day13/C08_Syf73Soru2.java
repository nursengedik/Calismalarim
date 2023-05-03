package agaın13_day13;

import java.util.Scanner;

public class C08_Syf73Soru2 {

    public static void main(String[] args) {

         // Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        //          Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //          isim bosluk soyisim seklinde bize donduren bir method olusturun
        //          input : isim : Ali  soyisim :YILMAZ.  output : Ali Yilmaz

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println(isimSoyisimYazdırma(isim, soyisim));
        //System.out.println(isimSoyisimYazdirma(isim,soyisim));


    }

        public  static String isimSoyisimYazdırma(String isim, String soyisim){
        String sonuc="";

            //isim= isim.toUpperCase().charAt(0);//sadece ilk harfi büyük yazdırır
            isim= isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
            soyisim= soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();
            sonuc= isim+ " " + soyisim;
            //System.out.println(sonuc);
            return sonuc;



        }



}
