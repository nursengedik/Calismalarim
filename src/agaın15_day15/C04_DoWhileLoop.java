package agaın15_day15;

import java.util.Scanner;

public class C04_DoWhileLoop {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar alin
        // kullaniciya bitirmek icin 0'a basmasini soyleyin
        // kullanici 0'a bastiginda
        // 0 haric kac sayi girildigini ve toplamlarini yazdirin

        Scanner scan = new Scanner(System.in);

        int girilenSayi = 0;//girilen sayı değerini 0 verirsek kod başlamadan biter çünkü şartımız
                           //(girilenSayi !=0) olduğu müddetçe kod çalışacak
        int toplam = 0;
        int sayiAdedi = 0;

        /*
        while(girilenSayi !=0){// girilen sayı 0 olmadığı müddetçe çalış demektir
            System.out.println("Toplanmak uzere tamsayi giriniz" +
                    "\nBitirmek icin 0'a basiniz");
            girilenSayi = scan.nextInt();//kullanıcı yanlışlıkla 0 girerse durumunu da kontrol etmek gerekir
            if (girilenSayi!=0){
                toplam += girilenSayi;
                sayiAdedi++;
            }
        }
        Body 3 kez çalıştı kontrol 4 kez çalıştı
         */

        do {
            System.out.println("Toplanmak uzere tamsayi giriniz" +
                    "\nBitirmek icin 0'a basiniz");
            girilenSayi = scan.nextInt();

            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayiAdedi++;
            }

        } while (girilenSayi != 0);


        System.out.println("Girilen " + sayiAdedi + " adet sayinin toplami :");
    }
}
    //do while'nin bir öncekine göre avantajı yanlış değer versek bile kontrol edilmeden önce kullanıcıdan değer
    //aldığımız için işlem düzelmiş olacak ve sorumuz çalışacak
// //dezavantajı yanlış değer girilse bile çalışmaması gereken yerde en az bir kez çalışması