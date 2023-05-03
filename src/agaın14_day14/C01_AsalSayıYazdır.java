package agaın14_day14;

public class C01_AsalSayıYazdır {

    public static void main(String[] args) {

        // Verilen 1'den buyuk pozitif bir tamsayinin
        // asal sayi olup olmadigini yazdiran bir method olusturun

         asalMıYazdır(20);
         asalMıYazdır(35);
         asalMıYazdır(23);
         asalMıYazdır(29);

    }

    public static void asalMıYazdır(int sayı) {//bu method neyin asal mı olup olmadığını yazdıracak?
                                              //çünkü soruda tamsayı diyor

        int flag = 0;                     //flagın kaçla başladığının bir önemi yok
        for (int i = 2; i < sayı; i++) { //i girdiğimiz sayıya 2 den başlayıp bölünecek olan sayılar
            if (sayı % i == 0) {
                flag++;                 // flag girilen sayıya bölünen sayı olduğunda 1 artar yani
                                       // girilen sayının diğer sayılara bölünüp bölünmediğini kontrol eder
                break;
            }
        }
        //kontrolden sonra flag'ın sonuçlarını değerlendirip yazdırır

        if (sayı == 2){
            System.out.println("Girilen 2 sayisi ASAL bir sayidir");//2 sayısının özel durumu
        }else if (flag==0){
            System.out.println("Girilen " + sayı + " sayisi ASAL bir sayidir");
        }else {
            System.out.println("Girilen " + sayı + " sayisi ASAL bir sayi degildir");

        }


    }// methodu oluşturduktan sonra methodu main methodda çağırırız
}
