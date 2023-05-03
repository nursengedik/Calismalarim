package agaın13_day13;

public class C13_MethodCall_MethodKullanma {

    public static void main(String[] args) {


        // method call method çağırma demektir, main methodun içerisinde yapılır, method çağırma yapmadan
        //methodumuzu oluşturmuş olsak bile çalışmaz

        //method kullanma ise başka bir class ta oluşturduğumuz methodu çalıştığımız class ta tekrar oluşturmadan
        // hazır olarak kullanabiliriz, class ismi ve method ismini seçerek, C03_Faktoryel.faktoryelHesapla(7);


        int sonuc= C03_Faktoryel.faktoryelHesapla(7);//int sonuc= den sonra C03 yazınca methodlar hazır gelir
                                                        //ve seçilir
        System.out.println(sonuc);//5040

        double b=C11_İkiSayıToplamaDondurmeMethodu.ikiSayıToplaDondur();
        System.out.println(b);

        int c= C12_İkiSayıyıToplaDondurFarklı.ikiSayıToplaDondur(12,12);
        System.out.println(c);


        // double sonuc=C02_İkiSayıToplamaMethodu.ikiSayıTopla();// void olan methodlar atama yapılarak çağırılmaz
        //atama ve yazdırma yapmadan direk class ismi ve method ismiyle kullanırız

        C14_İkiSayıyıToplaYazdırFarklı.ikiSayıToplaYazdır(11,11);
        C02_İkiSayıToplamaMethodu.ikiSayıTopla();



    }

}
