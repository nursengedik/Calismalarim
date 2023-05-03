package agaın08_day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C04_ternarySorularSyf42 {

    public static void main(String[] args) {

    /*
      soru 1- Kullanıcıdan bir sayı isteyin,
              sayıyı kontrol edip 5 ile bölünebiliyorsa
              "Sayı 5'in tam katı" yazdırın.

   */

       //Scanner scan= new Scanner(System.in);
       //System.out.println("Lütfen bir tamsayı giriniz");
       //int sayı=scan.nextInt();

        //if ile çözümü

     /*
        if (sayı%5==0){
            System.out.println("Sayı 5'in tam katı");
        }else {
            System.out.println("Sayı 5'in katı değil");
        }
      */

        //Ternary ile çözümü

        //System.out.println(sayı%5==0 ? "Sayı 5'in tam katı" : "Sayı 5'in katı değil");


        // Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //         ucgen eskenar ise “Eskenar ucgen” yazdirin,
        //         degilse “Eskenar degil” yazdirin.


        //Scanner scan= new Scanner(System.in);
        //System.out.println("Lütfen üçgenin 3 kenar uzunluğunu giriniz");
        //int kenar1=scan.nextInt();
        //int kenar2=scan.nextInt();
        //int kenar3=scan.nextInt();


        /*
        if (kenar1==kenar2 && kenar1==kenar3 && kenar2==kenar3 && kenar1>0){
            System.out.println("Eskenar ucgen");

        }else {
            System.out.println("Eskenar degil");
        }
         */

        //Ternary ile çözümü

       // System.out.println(kenar1==kenar2 && kenar1==kenar3 && kenar2==kenar3 && kenar1>0
       //                    ? "Eskenar ucgen"
       //                    : "Eskenar degil");


        // Soru 3- Kullanicidan bir harf isteyin,
        //         girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //         yoksa girilen harfi yazdirin


      // Scanner scan= new Scanner(System.in);
      // System.out.println("Lütfen bir harf giriniz");
      // char harf= scan.next().charAt(0);

        //if ile çözümü

       // if (harf>='a' && harf<='z'){
       //     System.out.println(Character.toUpperCase(harf));//char'a bir method uygulayabilmek için Character
       // }else {                                            //wrapperclass ını kullanırız harf.toUpperCase kabul
       //     System.out.println(harf);                     //etmez char ın ascii değerleri olduğu için
       // }

        //Ternary ile çözümü

       //System.out.println(harf>='a' && harf<='z'
       //                   ? Character.toUpperCase(harf)
       //                   : harf );


        // Soru 4- Kullanıcıdan notunu alın
        //         50 veya daha büyükse "Sınıfı Geçtin"
        //         50 den küçükse "Malesef Kaldın" yazdırın


        //Scanner scan=new Scanner(System.in);
        //System.out.println("Lütfen notunuzu giriniz");
        //int not= scan.nextInt();

       //if ile çözümü

      // if (not<0 || not>100){
      //     System.out.println("Geçersiz not, tekrar deneyin");
      // } else if (not >= 50) {
      //     System.out.println("Sınıfı Geçtin");
      // }else {
      //     System.out.println("Malesef Kaldın");
      // }


        //Ternary ile çözümü

       // System.out.println(not>0 && not<100 && not >= 50
       //                    ? "Sınıfı Geçtin"
       //                    : "Malesef Kaldın");


        // Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin (küçük sayıyı)

        //Scanner scan=new Scanner(System.in);
       //System.out.println("Lütfen iki tamsayı giriniz");
       //int sayı1= scan.nextInt();
       //int sayı2=scan.nextInt();

        //if ile çözümü

       // if (sayı1>sayı2){
       //     System.out.println(sayı2);
       // }else {
       //     System.out.println(sayı1);
       // }

        //Ternary ile çözümü

        //System.out.println(sayı1>sayı2 ? sayı2 : sayı1);



        //Soru 6- kullanicidan bir tamsayi alip
        //        mutlak degerini yazdirin

        Scanner scan= new Scanner(System.in);
         System.out.println("Lütfen bir tamsayı giriniz");
         int sayı= scan.nextInt();


         //if ile çözümü

        if (sayı>=0){//sayı 0 dan büyükse kendisidir
            System.out.println(sayı);
        }else {
            System.out.println(sayı*(-1));
        }

        //Ternary ile çözümü

        System.out.println(sayı>=0 ? sayı : sayı*(-1));



         //sayıyı mutlak değerine çevirip yazdırın


        /*
        if (sayı>=0){//sayı 0 dan büyükse kendisidir
            System.out.println(sayı);
        }else {
            sayı=sayı*(-1);//atama yapıp sonra yazdırır
            System.out.println(sayı);
        }
       */

        //Ternary ile çözümü

        // sayı=sayı>=0 ? sayı : sayı*(-1);//burada atama yapıp yazdırır
        // System.out.println(sayı);



    }
}
