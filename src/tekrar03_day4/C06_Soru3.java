package tekrar03_day4;

import java.util.Scanner;

public class C06_Soru3 {

    public static void main(String[] args) {

        //S-3-Kullanıcıdan bir sayı alın, kullanıcı kaç değerini girerse girsin,
        //    o sayıyı -128 ile 127 arasındaki bir sayıya dönüştürüp yazdırsın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");

        int sy= scan.nextInt();
        //int bir sayıyı byte cast edeceğiz, byte -128 ile +127 arasındaki sayıları tutar
        byte by=(byte)sy;
        System.out.println("Byte dönüştürülen sayı : " +by);//130===>  -126

    }
}
