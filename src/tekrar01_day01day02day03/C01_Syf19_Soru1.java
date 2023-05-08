package tekrar01_day01day02day03;

import java.util.Scanner;

public class C01_Syf19_Soru1 {

    public static void main(String[] args) {

        /*
         Soru 1-Kullanıcıdan üç farklı data türünde değer alıp
                girilen değerleri açıklamalarıyla yazdırın
         */

        //Direk değer de yazabiliriz

        int sayı1=1983;
        double sayı2=15.8;
        String str="Java";
        System.out.println("Dört basamaklı sayı : " +sayı1+
                           "\nOndalıklı sayı : " +sayı2+
                           "\nGirilen kelime : " +str);
        System.out.println("========================");

        //Veya kullanıcıya mesaj göndererek değer alırız
//
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dört basamaklı bir sayı giriniz");
        int sayı3=scan.nextInt();
//
        System.out.println("Lütfen ondalıklı bir sayı giriniz");
        double sayı4= scan.nextDouble();

        System.out.println("Lütfen bir kelime giriniz");
        String klm= scan.next();

        //sonra alınan değerler yazdırılır
        System.out.println("Dört basamaklı sayı : " +sayı3+
        "\nOndalıklı sayı : " +sayı4+
        "\nGirilen kelime : " +klm);


    }
}
