package agaın13_day13;

import java.util.Scanner;

public class C04_MethodKullanma {

    public static void main(String[] args) {

        //Method kullanma yani Method alma main methodun içinde yapılır

        // Kullanicidan 10'dan kucuk iki pozitif tamsayi alip
        // faktoryel degerlerini toplayin


        Scanner scan= new Scanner(System.in);
        System.out.println("10'dan küçük 2 adet pozitif tamsayı giriniz");
        int sayı1= scan.nextInt();
        int sayı2=scan.nextInt();

        int sonuç= C03_Faktoryel.faktoryelHesapla(sayı1)
                  +C03_Faktoryel.faktoryelHesapla(sayı2);

        System.out.println(sonuç);// 3 v3 4 sayılarını girdiğimizde 30 toplamını verir


    }
}
