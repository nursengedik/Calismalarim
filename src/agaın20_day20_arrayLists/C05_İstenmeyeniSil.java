package agaın20_day20_arrayLists;

import java.util.List;
import java.util.Scanner;

public class C05_İstenmeyeniSil {

    public static void main(String[] args) {

        //Soru 3- Verilen String bir listede
        //        istenmeyen harf iceren elementleri silip,
        //        kalan kismini list olarak bize donduren bir method olusturun

        //listeyi method kullanarak oluşturalım

        List<String> liste=C04_KullanıcıyaListeOluşturtmak.kullanıcıyaListeOluşturtmak();//bize List döndüreceği
                                                                                       //için oluşturulur
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kullanılmasını istemediğiniz bir harf girin");
        String istenmeyenHarf=scan.next().substring(0,1);



    }






}
