package tekrar03_day4;

import java.util.Scanner;

public class C07_Soru4 {

    public static void main(String[] args) {

        //S-4-Kullanıcıdan iki double sayı alın, ilk sayıyı ikinci sayıya bölün ve
        //    bölüm işleminin sonucunun tamsayı kısmını yazdırın

         Scanner scan=new Scanner(System.in);
         System.out.println("Lütfen iki tane ondalıklı sayı giriniz");
         double say1= scan.nextDouble();
         double say2= scan.nextDouble();

         //System.out.println("İki double sayının int sonucu : "+ say1/say2);
         // 2.0 sonucu double olarak verdi
         System.out.println("İki double sayının int sonucu : "+(int) (say1/say2));
         //2 sonucunu verir
    }
}
