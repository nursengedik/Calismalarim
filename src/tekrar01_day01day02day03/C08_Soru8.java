package tekrar01_day01day02day03;

import java.util.Scanner;

public class C08_Soru8 {

    public static void main(String[] args) {

        //S-8 (Interview)- Kullanicidan iki sayi alip,
        //                 üçüncü bir değişken kullanmadan ikisinin degerlerini degistirin(swap).


        Scanner scan = new Scanner(System.in);

        System.out.println("Sayi1'i giriniz(Tamsayi)");

        int sayı1= scan.nextInt();

        System.out.println("Sayi2'i giriniz(Tamsayi)");

        int sayı2 = scan.nextInt();

        sayı1=sayı1+sayı2;
        sayı2=sayı1-sayı2;
        sayı1=sayı1-sayı2;

        System.out.println("Sayı1'in yeni degeri : " + sayı1);
        System.out.println("Sayı2'in yeni degeri : " + sayı2);
    }

}
