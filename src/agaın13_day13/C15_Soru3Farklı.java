package agaın13_day13;


import java.util.Scanner;

public class C15_Soru3Farklı {

    public static void main(String[] args) {


        String sonuc=asalMı();
        System.out.println(sonuc);


    }

    public static String asalMı() {//kullanıcıdan sayı alacaksak ve scanner ı method içerisinde kullanacaksak
                                  // parametre kullanmayız

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz ");
        int sayı = scan.nextInt();

        int flag = 0;

        for (int i = 2; i < sayı; i++) {
            if (sayı % i == 0) {
                flag++;
                break;
            }

        }
        if (flag == 0) {
            return "Asal sayı";
        }else {
            return "Asal sayı değil";
        }


    }
}