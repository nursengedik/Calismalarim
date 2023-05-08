package tekrar01_day01day02day03;

import java.util.Scanner;

public class C05_Soru5 {

    public static void main(String[] args) {

        //s-5-Kullanıcıdan ismini, soyismini, yaşını alıp aşağıdaki formatta yazdırın.
        //    Girilen bilgiler : J Doe, 44

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi giriniz" +
                           "\nHer bilgiden sonra ENTER'a basiniz");

        char isimİlkHarf= scan.nextLine().charAt(0);
        String soyisim= scan.next();
        int yas= scan.nextInt();

        System.out.println("Girilen bilgiler : "+isimİlkHarf+" "+ soyisim+", "+ yas);


    }
}
