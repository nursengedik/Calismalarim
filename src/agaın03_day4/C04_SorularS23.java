package agaın03_day4;

import java.util.Scanner;

public class C04_SorularS23 {

    public static void main(String[] args) {

        //S-1-Int olarak verilen 3 değerin ortalamasını double olarak yazdıran bir kod yazın
       //1. yol sayıların ortalamasını önce double'a cast ederiz ve sonra yazdırırız

        //int a=3;
        //int b=6;
        //int c=9;
        //double ort= (double) (a+b+c)/3;

       //System.out.println("Double ort : "+ort);//6.0

        //2. yol yazdırmada casting yaparız

       // System.out.println("Int 3 değerin double ortalaması : " +(a+b+c)/3); 6 sonucu double olarak vermedi
               // System.out.println("Int 3 değerin double ortalaması : " +(double)(a+b+c)/3);//6.0 double sonuç

        // islem onceligi (a+b+c)/3'tedir.// 18/3=6  tamsayı çıkar
        // Java oncelikle (a+b+c)/3 islemini yapar ve sonucu 6 bulur
        // sonra (double) oldugundan 6'yı double'a cast eder 6.0 bulur

        // ortalama isleminin sonucunun double olmasi icin
        // isleme girenlerden birisi double olmalidir


        //S-2-Kullanıcıdan bir harf alın ve alfabede o harften sonraki 3 harfi yazdırın (char'da casting)

        //Scanner scan=new Scanner(System.in);
        //System.out.println("Lütfen bir harf giriniz");
        //char girilenHarf=scan.next().charAt(0);

       // System.out.println("Girilen harf : " +girilenHarf+
       //                    "\nGirilen harften sonraki 3 harf : "+
       //                    (char)(girilenHarf+1)  +", "+ // her harfi ayrı ayrı cast ederiz
       //                    (char)(girilenHarf+2)  +", "+
       //                    (char)(girilenHarf+3) );


        //S-3-Kullanıcıdan bir sayı alın, kullanıcı kaç değerini girerse girsin, o sayıyı -128 ile 127
        //arasındaki bir sayıya dönüştürüp yazdırsın
//
        //Scanner scan=new Scanner(System.in);
        //System.out.println("Lütfen bir tamsayı giriniz");
        //int sy= scan.nextInt();//int bir sayıyı byte cast edeceğiz/byte -128 ile +127 arasındaki sayıları tutar
        //byte by=(byte)sy;
        //System.out.println("Byte dönüştürülen sayı : " +by);//130===>  -126


        //S-4-Kullanıcıdan iki double sayı alın, ilk sayıyı ikinci sayıya bölün ve
        // bölüm işleminin sonucunun tamsayı kısmını yazdırın

       // Scanner scan=new Scanner(System.in);
       // System.out.println("Lütfen iki tane ondalıklı sayı giriniz");
       // double say1= scan.nextDouble();
       // double say2= scan.nextDouble();
//
       // //System.out.println("İki double sayının int sonucu : "+ say1/say2);//2.0 sonucu double olarak verdi
       // System.out.println("İki double sayının int sonucu : "+(int) (say1/say2));//2 sonucunu verir


        //S-5-Kullanıcıdan bir double, bir tamsayı alın, double sayıyı ikinci sayıya bölün ve
        //bölüm işleminin sonucunun tamsayı kısmını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tane ondalıklı sayı ve tamsayı giriniz");
        double say1= scan.nextDouble();
        int say2=scan.nextInt();


        //System.out.println("Double int sayının int sonucu : "+ say1/say2);//sonuç 2.0
        System.out.println("Double int sayının int sonucu : "+ (int)(say1/say2));//say1 ve say2'yi paranteze almasak da olur





    }
}
