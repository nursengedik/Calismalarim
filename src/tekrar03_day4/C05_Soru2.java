package tekrar03_day4;

import java.util.Scanner;

public class C05_Soru2 {

    public static void main(String[] args) {

        //S-2-Kullanıcıdan bir harf alın ve
        //    alfabede o harften sonraki 3 harfi yazdırın (char'da casting)


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char girilenHarf=scan.next().charAt(0);

        System.out.println("Girilen harf : " +girilenHarf+
                           "\nGirilen harften sonraki 3 harf : "+
                           (char)(girilenHarf+1)  +", "+ // her harfi ayrı ayrı cast ederiz
                           (char)(girilenHarf+2)  +", "+
                           (char)(girilenHarf+3) );


    }
}
