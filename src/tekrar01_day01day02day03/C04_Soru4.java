package tekrar01_day01day02day03;

import java.util.Scanner;

public class C04_Soru4 {

    public static void main(String[] args) {

        //s-4- Kullanıcıdan bir dikdörtgenin 2 kenar uzunluğunu alıp
        //     dikdörtgenin alanını yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kenar uzunluklarını  giriniz"+
                           "\nHer sayıdan sonra ENTER'a basiniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();

        System.out.println("Dikdörtgenin alanı : " +kenar1*kenar2);

    }
}
