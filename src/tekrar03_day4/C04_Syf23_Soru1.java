package tekrar03_day4;

public class C04_Syf23_Soru1 {

    public static void main(String[] args) {

        //S-1-Int olarak verilen 3 değerin ortalamasını double olarak yazdıran bir kod yazın


        //1. yol sayıların ortalamasını önce double'a cast ederiz ve sonra yazdırırız

        int a=3;
        int b=6;
        int c=9;
        double ort= (double) (a+b+c)/3;

        System.out.println("Double ort : "+ort);//6.0

        //2. yol yazdırmada casting yaparız

         System.out.println("Int 3 değerin double ortalaması : " +(a+b+c)/3);
         //6, sonucu double olarak vermedi
         System.out.println("Int 3 değerin double ortalaması : " +(double)(a+b+c)/3);
         //6.0 double sonuç

        // islem onceligi (a+b+c)/3'tedir.// 18/3=6  tamsayı çıkar
        // Java oncelikle (a+b+c)/3 islemini yapar ve sonucu 6 bulur
        // sonra (double) oldugundan 6'yı double'a cast eder 6.0 bulur

        // ortalama isleminin sonucunun double olmasi icin
        // isleme girenlerden birisi double olmalidir

    }
}
