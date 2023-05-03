package agaın13_day13;

import java.util.Scanner;

public class C02_İkiSayıToplamaMethodu {

    public static void main(String[] args) {

        // kullanicidan 2 sayi alip
        // toplamlarini yazdiran bir method olusturun

        //5-method main methodun içinden çağrılır (Method Call)
        //çağırma methodun ismiyle yapılır

        ikiSayıTopla();
        ikiSayıTopla();// methodu kaç kez çağırırsak o kadar çalışır

    }


    //1-methodu Class'ın içinde main methodun dışında oluşturacagız
    //2-Önce method oluşturma syntax'ini oluştururuz. public static void (soruda yazdırın denildiği için)
    //  sonra methodun ismi yazılır
    //3-soru çözümü yapılır

    public static void ikiSayıTopla(){//sayıyı topla yazdır methodu, sonuç döndürmeyecek
                                     //sayıları kullanıcıdn aldığımız için () içerisinde parametre yazmıyoruz
        Scanner scan=new Scanner(System.in) ;
        System.out.println("Toplamak üzere iki sayı giriniz");
        double sayı1= scan.nextDouble();
        double sayı2= scan.nextDouble();
        System.out.println("İki sayının toplamı : " + (sayı1+sayı2));

        //mesajımızı verip sayıları alıp toplasak bile kod çalışır ama işlem yapmaz -exit code 0
        //4-methodun çalışması için main methodun içinden çağrılması gerekir

    }


}
