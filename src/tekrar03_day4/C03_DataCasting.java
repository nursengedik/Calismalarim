package tekrar03_day4;

public class C03_DataCasting {

    public static void main(String[] args) {

        // Java bolunen iki sayi tamsayi ise sonucun da tamsayi kismini verir

        int a= 20;
        int b= 6;

        System.out.println(a/b); // 20 / 6 = 3 ====int/int=int

        // bolunen sayilarin data turleri farkli ise sonucu daha genis olanin cinsinden verir

        double c=6;
        System.out.println(a/c); // 20 / 6 = 3.3333333333333335
        // int / double ==> double

        // a/b isleminin sonucunu ondalikli olarak nasil yazdirabiliriz ?

        System.out.println( (double) (a/b) ); // 3.0

        // islem onceligi (a/b)'dedir.// 20/6=3.33333 ondalıklı sayı çıkar
        // Java oncelikle (a/b) islemini yapar ve sonucu 3 bulur // int int e bölüngüğü için tam kısmını alır
        // sonra (double) oldugundan 3'u double'a cast eder 3.0 bulur

        // bolme isleminin sonucunun double olmasi icin
        // isleme girenlerden birisi double olmalidir

        System.out.println((double) a/b); // 3.3333333333333335

        System.out.println(a/(double)b); // 3.3333333333333335int e= 1467; iki sayı int olunca doubleyı
                                         // diğer sayının yanına da yazabiliriz.


    }
}
