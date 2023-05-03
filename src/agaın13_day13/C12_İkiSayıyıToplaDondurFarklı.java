package agaın13_day13;

public class C12_İkiSayıyıToplaDondurFarklı {//

    public static void main(String[] args) {

        // 2 sayinın toplamını döndüren bir method olusturun
        //scanner ve sout kullanmadan parametre kullanarak da işlemi yaptırabiliriz

        //ikiSayıToplaDondur(11,12);//ekranda bir şey yazdırmaz, çünkü methodumuz sonuc döndüreceği için
                                   // atama yapıp yazdırmalıyız

       int snc= ikiSayıToplaDondur(11,12);
       System.out.println(snc);


    }

    public static int ikiSayıToplaDondur(int sayı1, int sayı2) {//sonuc döndürecekse void kullanılmaz,
                                                               // data türü yazılır

        return sayı1 + sayı2;

    }
}
