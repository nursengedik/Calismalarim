package agaın15_day15;

public class C02_RakamlarToplamınıBulma {

    //main method kullanmadan yapıyoruz çünkü başka class'ta kullanacağımız için-C01 class'ında

    // verilen pozitif bir tamsayinin
    // rakamlar toplamini bize döndüren method olusturun

    public static int rakamlarToplamınıBul(int verilenSayı) {//56781

        int sayı = verilenSayı;
        int birlerBasamağı = 0;
        int rakamlarToplamı = 0;

        int basamakSayısı = (sayı + "").length();//5 - for loop'ta bitiş değerine basamak sayısını yazabilmek için
                                                // sayının uzunluğu lazımdır ama sayının uzunluğu alınmaz
                                                //sayının yanına +"" dersek stringleşir ve uzunluğunu alabiliriz


        for (int i = 1 ; i<=basamakSayısı ; i++){
            birlerBasamağı= sayı%10;
            rakamlarToplamı+=birlerBasamağı;
            sayı/=10;
        }

        return  rakamlarToplamı;
    }

} //burada yazdırmadığımız için çalışmaz C01 class'ında çalıştırdık
