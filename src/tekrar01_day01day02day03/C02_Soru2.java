package tekrar01_day01day02day03;

import java.util.Scanner;

public class C02_Soru2 {

    public static void main(String[] args) {

        //S-2- Kullanıcıdan bir double, bir de int sayı alıp
        //     bunların toplamını ve çarpımını yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int say1= scan.nextInt();
        System.out.println("Lütfen bir ondalıklı sayı giriniz");
        double say2=scan.nextDouble();

        System.out.println("Girilen sayıların toplamı : " +(say1+say2));
        System.out.println("Girilen sayıların çarpımı : " +(say1*say2));

    }
}
