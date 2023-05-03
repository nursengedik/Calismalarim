package agaın13_day13;

import java.util.Scanner;

public class C09_Syf73Soru3 {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        //        olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
        //        sonuclarini donduren bir method olusturun.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz ");
        int sayı=scan.nextInt();


        String sonuc=asalMı(sayı);
        System.out.println(sonuc);


    }

        public  static  String asalMı(int sayı) {//sonucu asal olup olmadığını döndüreceği için dat türü
                                                 //string yazılır
                                               //kullanıcıdan sayıyı main method içinde aldığımız için methodda
                                              //parametre kullanmalıyız
            int flag = 0;

            for (int i = 2; i < sayı; i++) {
                if (sayı % i == 0) {
                    flag++;
                    break;
                }

            }
            if (flag == 0) {
                return "Asal sayı";
            } else {
                return "Asal sayı değildir";
            }


        }

}
