package tekrar01_day01day02day03;

import java.util.Scanner;

public class C06_Soru6 {

    public static void main(String[] args) {

        //S-6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan= new Scanner(System.in) ;
//
        System.out.println("Lutfen cemberin yaricapini giriniz");

        // kullanicinin girdigi bilgiyi kaydedebilecek data turunde bir variable olusturun
        // kullanicidan bilgiyi almak icin scan objesini ve ilgili next method'unu kullanin


         double yaricap = scan.nextDouble();

        //cevresini ve alanini yazdirin.

        System.out.println("Cemberin cevresi : " + 2 * 3.14 * yaricap);

        System.out.println("Dairenin alani :" + 3.14 * yaricap * yaricap);


    }
}
