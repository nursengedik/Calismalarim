package tekrar03_day4;

import java.util.Scanner;

public class C08_Soru5 {

    public static void main(String[] args) {

        //S-5-Kullanıcıdan bir double, bir tamsayı alın, double sayıyı ikinci sayıya bölün ve
        //    bölüm işleminin sonucunun tamsayı kısmını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tane ondalıklı sayı ve tamsayı giriniz");
        double say1= scan.nextDouble();
        int say2=scan.nextInt();


        //System.out.println("Double int sayının int sonucu : "+ say1/say2);//sonuç 2.0
        System.out.println("Double int sayının int sonucu : "+ (int)(say1/say2));
        //say1 ve say2'yi paranteze almasak da olur


    }
}
