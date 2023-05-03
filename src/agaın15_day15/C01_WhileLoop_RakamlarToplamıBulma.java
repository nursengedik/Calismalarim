package agaın15_day15;

import java.util.Scanner;

public class C01_WhileLoop_RakamlarToplamıBulma {

    public static void main(String[] args) {

        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scan=new Scanner(System.in);
        System.out.println("Rakamları toplanacak pozitif bir tamsayı giriniz");
        int girilenSayı= scan.nextInt();


       int sayı=girilenSayı;
       int birlerBasamağı=0;
       int rakamlarToplamı=0;

       while (sayı>0){//sayı!=0 sayı 0 olmadığı müddetçe bu işlemi yap
                     //veya (sayi!=0) da yazabiliriz/ (sayi==0)olmaz sayı 0'a eşit olduğu müddetçe çalışır yani
                    // sayı 0' a eşitse çalışır

           birlerBasamağı=sayı%10;
           rakamlarToplamı+=birlerBasamağı;
           sayı/=10;
       }

        System.out.println("Girilen "+girilenSayı+"'nın rakamlar toplamı : "+ rakamlarToplamı);

       System.out.println(C02_RakamlarToplamınıBulma.rakamlarToplaminiBul(girilenSayı));//for loop'la yapıldı

    }
}
