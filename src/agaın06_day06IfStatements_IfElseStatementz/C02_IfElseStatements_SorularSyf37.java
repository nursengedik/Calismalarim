package agaın06_day06IfStatements_IfElseStatementz;

import java.util.Scanner;

public class C02_IfElseStatements_SorularSyf37 {

    public static void main(String[] args) {

        //if else tek bir şartı kontrol eder true ve false sonuçları yazdırır

         /*  Eger bir olay icin
            Sadece 2 olasilik varsa
            Ve bu olasiliklardan birisi mutlaka calisacaksa
            If Else Statements kullaniriz
            If-else statement'da if bodys'si veya else body'si mutlaka calisir
            ikisinin birden calisma ihtimali YOKTUR
            ikisinin de calismama ihtimali YOKTUR
         */

        // Kullanicidan pozitif bir tamsayi alin
        // sayinin tek veya cift sayi oldugunu yazdirin (bir sayı 2 ile kalansız bölünebiliyorsa çift sayıdır,
        // bölünemiyorsa tek sayıdır)

        //Scanner scan=new Scanner(System.in);
        //System.out.println("Lütfen pozitif bir tamsayı girin");
        //int sayı= scan.nextInt();
//
        //if (sayı%2==0){
        //    System.out.println("Girilen sayı çift sayı");
//
        //}else {
        //    System.out.println("Girilen sayı tek sayı");
//
        //}


        // Kullanicidan pozitif bir tamsayi alin
        // 5 ile bolunup bolunmedigini yazdirin

       // Scanner scan=new Scanner(System.in);
       // System.out.println("Lütfen pozitif bir tamsayı girin");
       // int sayı= scan.nextInt();
//
       // if (sayı%5==0) {
       //     System.out.println("Girilen sayı 5 ile bölünebilir");
       // }else {
       //     System.out.println("Girilen sayı 5 ile bölünemez");
       // }


        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin, değilse "Eskenar degil" yazdırın

       //Scanner scan=new Scanner(System.in);
       //System.out.println("Lütfen üçgenin 3 kenar uzunluğunu giriniz");
       //double kenar1= scan.nextDouble();
       //double kenar2= scan.nextDouble();
       //double kenar3= scan.nextDouble();

       //if (kenar1==kenar2 && kenar1==kenar3 && kenar2==kenar3){//kenarlar eşitse
       //    System.out.println("Eskenar ucgen");//yazdır

       //}else {//değilse
       //    System.out.println("Eskenar degil");//yazdır
       //}//tek şart var

        //Soru 2- Kullanicidan notunu alin
        //        50 veya daha buyukse ”Sinifi Gectin”,
        //        50’den kucukse “Maalesef kaldin” yazdirin.

        //Scanner scan=new Scanner(System.in);
        //System.out.println("Lütfen notunuzu giriniz");
        //double not= scan.nextDouble();
//
        //if (not>=50 && not<=100){
        //    System.out.println("Sinifi Gectin");
//
        //}else {//50'den küçük durumunu belirtmemize gerek yok, şart sağlanmazsa kalan durumu yazdırır
        //    System.out.println("Maalesef kaldin");
        //}

        //Soru 3- Kullanıcıdan yaşını isteyin,
        //        65 yaş ve üzeri ise "Emekli olabilirsin" yazdırın,
        //        yoksa emekli olması için çalışması gereken yıl sayısını yazdırın

        //        65 ve üzeri değilse çalışması gereken yılı 65-yaş olarak buluruz

        //Scanner scan=new Scanner(System.in);
        //System.out.println("Lütfen yaşınızı giriniz");
        //double yas= scan.nextDouble();
//
        //if (yas>=65){
        //    System.out.println("Emekli olabilirsin");
//
        //}else {
        //    System.out.println("Emekli olabilmek için daha "+(65-yas) + " yıl çalışmalısın");
        //}


        //Soru 4- Kullanıcıdan bir karakter girmesini isteyin,
        //        girilen karakterin büyük harf olup olmadığını yazdırın


       //Scanner scan=new Scanner(System.in);
       //System.out.println("Lütfen bir karakter giriniz");
       //char karakter=scan.next().charAt(0);

       ////girilen karakter A ile Z arasında olacak

       //if ('A'<= karakter && karakter <= 'Z'){
       //    System.out.println("Girilen karakter büyük harf");

       //}else {
       //    System.out.println("Girilen karakter büyük harf değil ");
       //}


        //Soru 5- Kullanıcıdan bir karakter isteyin,
        //        girilen karakter küçük harf ise onu büyük harf olarak yazdırın,
        //        yoksa girilen harfi yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char krk=scan.next().charAt(0);

        //girilen karakter a ile z arasında olacak

        if ('a'<=krk && krk <= 'z'){
            System.out.println(Character.toUpperCase(krk));//büyük yazdırabilmek için
                                                          // Wrapper Classes'dan yardım alınır
        }else {
            System.out.println(krk);
        }













    }
}
