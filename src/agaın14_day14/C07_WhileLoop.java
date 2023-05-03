package agaın14_day14;

import java.util.Scanner;

public class C07_WhileLoop {

    public static void main(String[] args) {

        // kullanicidan bir sifre isteyin
        // asagidaki sartlari saglayana kadar,
        // her seferinde hatalari soyleyip yeni sifre isteyin
        // sartlari saglayan sifre oldugunda
        // "5.denemenizde basarili sifre olusturuldu" seklinde aciklama yazin

        // - ilk harf kucuk harf olmali
        // - son harf buyuk harf olmali
        // - bosluk icermemeli
        // - 8 karakter veya daha uzun olmali


        Scanner scan = new Scanner(System.in);

        String sifre="";
        int flag=0;//şifrenin olması 4 şartı da sağlamasına bağlı ve 4 şartı kontrol etmek için flag kullanılır
        int denemeSayisi=0;

                          //ne zamana kadar çalışacak, devam edecek-şifre doğru oluncaya kadar yani flag 4 olunca
        while(flag != 4){//flag 4 e eşit olmadığı müddetçe çalıştır

            flag=0;//hata olduğunda sıfırlar ki tekrar 1 2 3 4 artabilsin, sayabilsin - geçmişi temizliyoruz
            System.out.println("Lutfen bir sifre giriniz");
            sifre= scan.nextLine();

            // - ilk harf kucuk harf olmali-istenen durum

            if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){//ilk harf a ve z arasında demektir (istenen durum)
                flag++;//istenen durum sağlanınca flag 1 artar
            }else{    // sağlamıyorsa mesaj verilir
                System.out.println("Ilk karakter kucuk harf olmali");
            }


            // - son harf buyuk harf olmali

            if (sifre.charAt(sifre.length()-1)>='A' && sifre.charAt(sifre.length()-1)<='Z'){//istenen durum
                flag++;
            }else{//son karakter büyük değilse
                System.out.println("Son karakter buyuk harf olmali");
            }


            // - bosluk icermemeli

            if (sifre.contains(" ")){// şu anda boşluk içeriyor (istenmeyen durum)
                System.out.println("Sifre bosluk icermemeli");
            }else{
                flag++;//istenen durumda flag arttırılır
            }


            // - 8 karakter veya daha uzun olmali

            if (sifre.length()>=8){//istenen durum
                flag++;
            }else{
                System.out.println("Uzunluk en az 8 karakter olmali");
            }
            denemeSayisi++;
        }


        System.out.println("Tebrikler! " + denemeSayisi + ". denemede sifreniz basari ile kaydedildi");

    }
}
