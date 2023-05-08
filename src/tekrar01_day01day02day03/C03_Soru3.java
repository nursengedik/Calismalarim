package tekrar01_day01day02day03;

import java.util.Scanner;

public class C03_Soru3 {

    public static void main(String[] args) {

        //Soru3- Kullanıcıdan ismini, soyismini, yaşını alıp aşağıdaki formatta yazdırın.

        //İsminiz   : John
        //Soyisminiz: Doe
        //Yaşınız   : 44
        //Kaydınız başarıyla tamamlanmıştır.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim= scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        int yas=scan.nextInt();

        System.out.println("İsminiz : " +isim+
        "\nSoyisminiz : " +soyisim+
        "\nYaşınız : " +yas+
        "\nKaydınız başarıyla tamamlanmıştır.");

        //istersek tek bir aciklama ile 3 bilgiyi de alabiliri
        //Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi giriniz" +
                           "\nHer bilgiden sonra ENTER'a basiniz");

         // String isim= scan.nextLine();
        //String soyisim= scan.nextLine();
        //int yas= scan.nextInt();

        System.out.println("İsminiz : " +isim+
        "\nSoyisminiz : " +soyisim+
        "\nYaşınız : " +yas+
        "\nKaydınız başarıyla tamamlanmıştır.");
    }
}
