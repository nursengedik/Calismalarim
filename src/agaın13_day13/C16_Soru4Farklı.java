package agaın13_day13;

import java.util.Scanner;

public class C16_Soru4Farklı {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        //        bölenlerini bize yazdıran bir method olusturun.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayı=scan.nextInt();

        System.out.println(sayı+ " Sayısının pozitif tam bölenleri : ");
        pozıtıfTamBolenler(sayı);


    }

    public static void pozıtıfTamBolenler(int sayı) {

        int i;
        for (i = 1; i <= sayı; i++) {
            if (sayı % i == 0) {
                System.out.print(i + " ");
            }

        }

    }

}
