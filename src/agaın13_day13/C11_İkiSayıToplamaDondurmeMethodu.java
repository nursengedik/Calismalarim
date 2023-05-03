package agaın13_day13;


import java.util.Scanner;

public class C11_İkiSayıToplamaDondurmeMethodu {

   public static void main(String[] args) {

       // kullanicidan 2 sayi alip
       // toplamlarini döndüren bir method olusturun

       double sonuc=ikiSayıToplaDondur();//sonuc döndüreceği için atama yapıp yazdırmalıyız
       System.out.println(sonuc);

   }

   public static double ikiSayıToplaDondur() {//sonuc döndürecekse void kullanmayız, data türünü yazarız

       Scanner scan = new Scanner(System.in);
       System.out.println("Toplamak üzere iki sayı giriniz");
       double sayı1 = scan.nextDouble();
       double sayı2 = scan.nextDouble();

      return sayı1 + sayı2;

   }
}