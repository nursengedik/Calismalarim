package agaın10_day10_stringManipulations;

import java.util.Scanner;

public class C01_SorularSyf61 {
    public static void main(String[] args) {
       /*
        Soru 1 : Kullanicidan bir cumle alin
                - cumlede ev geciyorsa, "home home sweet home" yazdirin
                - cumlede is geciyorsa, "calismak guzeldir"
                - ikisini de iceriyorsa "Hem ev lazim hem is"
                - hicbirini icermiyorsa "cok calisman lazim" yazdirin
       */

       //Scanner scan=new Scanner(System.in);
       //System.out.println("Lütfen bir cümle giriniz");
       //String cumle=scan.nextLine();
       //String kucukCumle=cumle.toLowerCase();//eğer büyük harfle giriş yapılmışsa küçük harfe çevirir
       //                                     //soruda küçük harfle başlayan kelimeler sorulmuş
       ////önce iki şartı da sağlayan cümleyi kontrol ederim

       //if (kucukCumle.contains("ev") && kucukCumle.contains("iş")){
       //    System.out.println("Hem ev lazim hem is");
       //} else if (kucukCumle.contains("ev")) {
       //    System.out.println("home home sweet home");
       //} else if (kucukCumle.contains("iş") ) {
       //    System.out.println("calismak guzeldir");
       //}else {
       //    System.out.println("cok calisman lazim");
       //}

        //String cumle=scan.nextLine().toLowerCase(); ifadesiyle de yapabiliriz kucukCumle ye atamadan



      /*
           Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
                    input1 : “15.30 €” , input2 : “11.40 €”
                    output : 26.70 €
     */
        
         // String input1="15.30 €";
         // String input2="11.40 €";

         //String'de toplama yapabilmek için sayılar dışındaki herşeyi yok etmemiz gerekir.
        // input'larda digit olmayan (sayı olmayan) herseyi yok edelim

         //input1=input1.replaceAll("\\D","");//1530 sout yazdırınca verir
         //input2=input2.replaceAll("\\D","");//114

        //replaceAll ın replaceden farkı, tek tek harfleri veya metinleri değiştirmek yerine, parametre olarak
        //girilen regex in kapsadığı tüm karakterleri değiştirmesidir

         //System.out.println(input1);//1530
         //System.out.println(input2);//1140

        // digit olmayanlari yok ettik ama String olduklari icin toplayamayiz
        // doubleye'a parse etmeliyiz (sonucu double istediği için doubleye cast ederiz)

       //double inp1= Double.parseDouble(input1);//D. yazılınca wrapper clasess hazır methodları gelir
       //double inp2= Double.parseDouble(input2);//stringi doubleye cast ettik

       //System.out.println((inp1+inp2)/100 + "€");//sonucu double istediği için 100 böleriz



       /*
         Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
                  sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.

                  input : java1 ogRe2@nMek3 #ne +Gu=zel
                  output : Java ogrenmek ne guzel.
       */

       //String input="java1 ogRe2@nMek3 #ne +Gu=zel";


       //input=input.replaceAll("\\d","");//java ogRe@nMek #ne +Gu=zel-sayıları kaldırdık
       //input=input.replaceAll(" ", "5");//java5ogRe@nMek5#ne5+Gu=zel
       //                                                 // space ler 5 yazdık daha sonra space eklememek için

       //input=input.replaceAll("\\W","");// java5ogRenMek5ne5Guzel
       //                                                //harf ve rakam olmayan her şeyi sildik

       //input=input.replaceAll("5"," ");// java ogRenMek ne Guzel
       //                                               //sadece 5 sayısının yerlerini space ile değiştirdik
       //input=input.substring(0,1).toUpperCase()+ input.substring(1).toLowerCase();


       //System.out.println(input);//Java ogrenmek ne guzel



       /*
         Soru 4 : Kullanicidan bir sifre isteyip,
                  asagidaki sartlari kontrol edin ve
                  kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
                  eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
                  - ilk harf kucuk harf olmali
                  - son karakter rakam olmali
                  - sifre bosluk icermemeli
                  - uzunlugu en az 10 karakter olmali
      */

        //kullaniciya duzeltmesi gereken tum eksikleri soyleyin istiyoruz
        // soruyu if else ile yaparsak sadece 1 hata yazdirir, ötekilere bakmaz
        // bagimsiz 4 if-else cumlesi olmali ki tüm hataları yazdırsın
        // en sonda 4 sarti'da sagladigini kontrol eden bir variable kullanacagiz int flag

       //Scanner scan=new Scanner(System.in);
       //System.out.println("Lütfen şifrenizi giriniz");
       //String sifre=scan.nextLine();

       //int flag=0;//eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
       //           //tüm şartların sağlandığını flag ile tutacağız, çünkü if else cümleleri birbirinden
       //          //bağımsız

       //// - ilk harf kucuk harf olmali

       //if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
       //    flag++;
       //}else {
       //    System.out.println("ilk harf kucuk harf olmali");
       //}


       //// - son karakter rakam olmali

       //char sonHarf=sifre.charAt(sifre.length()-1);//şifrenin son karakteri charAt içine son karakterin index i
       //                                           //yazılır, son karakterin index i sifre.length()-1 ile bulunur

       //if (sonHarf>='0' && sonHarf<='9'){
       //    flag++;
       //}else {
       //    System.out.println("son karakter rakam olmali");

       //}

       //// - sifre bosluk icermemeli (contains ile)

       //if (sifre.contains(" ")){//boşluk içeriyor şartı
       //    System.out.println("Sifre bosluk icermemeli");
       //}else {
       //    flag++;//boşluk içermemesi durumunda artacak olduğu için else ye yazdık
       //}

       //// - uzunlugu en az 10 karakter olmali, yani 10 ve daha fazla olabilir

       //if (sifre.length()>=10){
       //    flag++;
       //}else {
       //    System.out.println("uzunlugu en az 10 karakter olmali");
       //}

       //// eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin

       //if (flag==4){
       //    System.out.println("sifre basariyla kaydedildi");
       //}


        
        /*
          Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
                   - ismi daha uzun ise, (isim ve soyisim karşılaştırılıyor)
                     isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
                   - soyisim daha uzun ise
                     ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.
         */

       // Scanner scan=new Scanner(System.in);
      // System.out.println("Lütfen isminizi giriniz");
      // String ısım=scan.nextLine();

      // System.out.println("Lütfen soyismini giriniz");
      // String soyIsım=scan.nextLine();


      // if (ısım.length()>soyIsım.length()){
      //     System.out.println(ısım.substring(0,1).toUpperCase()+ısım.substring(1)+
      //                       " "+soyIsım.substring(0,1).toUpperCase()+soyIsım.substring(1));
      // } else if (ısım.length()<soyIsım.length()) {
      //     System.out.println(ısım.substring(0,1).toUpperCase()+ısım.substring(1)+" "+soyIsım.toUpperCase());

      // } else{
      //     System.out.println(ısım.toLowerCase()+" "+soyIsım.toUpperCase());
      // }



         /*
           Soru 6 : Kullanicidan alinan bir String alin,
                    String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
                    String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(  yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle=scan.nextLine();
        int uzunluk=cumle.length();

        if (uzunluk%2==0){
            int orta=uzunluk/2;
            cumle=cumle.substring(0,orta)+":)"+cumle.substring(orta);

        }else {
            int orta=uzunluk/2;
            cumle=cumle.substring(0,orta)+":("+cumle.substring(orta);
        }
        System.out.println("Cümlenin son hali : "+cumle);



    }

}
