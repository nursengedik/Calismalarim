package agaın10_day10_stringManipulations;

import java.util.Scanner;

public class C01_StringManipulations {
    public static void main(String[] args) {


         //Soru syf-55-1- kullanıcıdan bir string ve aranacak metin alın.
        //                Stringin aranan metni içerip içermediğini
        //                indexOf() methodu kullanarak yazdırın

       //Scanner scan=new Scanner(System.in);
       //System.out.println("Lütfen bir cümle giriniz");
       //String cumle=scan.nextLine();

       //System.out.println("Lütfen aramak istediğiniz metni giriniz");
       //String metın=scan.next();

        //önce cümlenin metni içermediği şartını kontrol ederiz
        //aranan metınin ilk index ini istediğimizde -1 döndürüyorsa aranan metin cümlede yok demektir

      //  if (cumle.indexOf(metın)==(-1)){
      //      System.out.println("Cümle aranan metni içermiyor");
//
      //  }else {
      //      System.out.println("Cümle aranan metni içeriyor");
      //  }

          //soru 2- kullanıcıdan bir string ve aranacak metin alın.Aranan metnin  String içerisinde kullanımını
        //          kontrol ederek aşağıdaki cümlelerden uygun olanını yazdırın

        //-String aranan metni içermiyor
        //_Aranan metin String de sadece 1 kere kullanılmış
        //-Aranan metin String de sadece 1 den fazla kullanılmış

       // Scanner scan=new Scanner(System.in);
       // System.out.println("Lütfen bir cümle giriniz");
       // String cumle=scan.nextLine();
//
       // System.out.println("Lütfen aramak istediğiniz metni giriniz");
       // String metın=scan.next();

       // int metınIlkIndex=cumle.indexOf(metın);
//
       // if (cumle.indexOf(metın)==(-1)) {
       //     System.out.println("String aranan metni içermiyor");
       // } else if (cumle.indexOf(metın,(metınIlkIndex+1))==(-1)) {
       //     System.out.println("Aranan metin String de sadece 1 kere kullanılmış");
       // }else {
       //     System.out.println("Aranan metin String de sadece 1 den fazla kullanılmış");
       // }
        // (metınIlkIndex+1) kullanmamızın sebebi cümlede metin aradığımız için çok metninin index i 5 ise bunun
        // +1. index i de 6 dır (metın,6) olur yani 6 index ve sonrasında metni arar
        // cümle: Java çok güzel çok olsun


        //Soru syf-56-1- kullanıcıdan bir string ve aranacak metin alın.
        //               Stringin aranan metni içerip içermediğini
        //               lastindexOf() methodu kullanarak yazdırın


       //Scanner scan=new Scanner(System.in);
       //System.out.println("Lütfen bir cümle giriniz");
       //String cumle=scan.nextLine();

       //System.out.println("Lütfen aramak istediğiniz metni giriniz");
       //String metın=scan.next();


        //önce cümlenin metni içermediği şartını kontrol ederiz
        //aranan metınin ilk index ini istediğimizde -1 döndürüyorsa aranan metin cümlede yok demektir

//
       // if (cumle.lastIndexOf(metın)==(-1)){
       //     System.out.println("Cümle aranan metni içermiyor");
       // }else {
       //     System.out.println("Cümle aranan metni içeriyor");
       // }


        //soru 2- kullanıcıdan bir string ve aranacak metin alın.Aranan metnin  String içerisinde kullanımını
        //          kontrol ederek aşağıdaki cümlelerden uygun olanını yazdırın

        //-String aranan metni içermiyor
        //_Aranan metin String de sadece 1 kere kullanılmış
        //-Aranan metin String de sadece 1 den fazla kullanılmış

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle=scan.nextLine();

        System.out.println("Lütfen aramak istediğiniz metni giriniz");
        String metın=scan.next();

        int ılkIndex=cumle.indexOf(metın);
        int sonIndex=cumle.lastIndexOf(metın);

        if (cumle.lastIndexOf(metın)==(-1)){
            System.out.println("String aranan metni içermiyor");
        } else if (ılkIndex == sonIndex) {
            System.out.println("Aranan metin String de sadece 1 kere kullanılmış");
        }else {
            System.out.println("Aranan metin String de sadece 1 den fazla kullanılmış");
        }


    }
}
