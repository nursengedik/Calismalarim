package agaın09_day09_SwitchStatemennts;

import java.util.Scanner;

public class C01_SwitchStatements {
    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin
        // o harfle baslayan gun ismi varsa yazdirin
        // yoksa "gecersiz harf" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf= scan.next().charAt(0);

        harf = Character.toUpperCase(harf);

        if (harf=='P'){
            System.out.println("Pazar, Pazartesi veya Persembe");
        } else if (harf == 'S') {
            System.out.println("Sali");
        } else if (harf == 'C') {
            System.out.println("Carsamba, Cuma veya Cumartesi");
        } else {
            System.out.println("Gecersiz harf");
        }

        System.out.println("======================");
        // daha duzenli ve kullanisli olarak switch statement kullanabiliriz

        // switch statements , switch'in onunde yazilan degiskene esit olan case'i calistirir

        // calismaya basladiktan sonra
        // break gorunceye kadar veya switch'in sonuna kadar calisir

        //switch parantezine yazılan değer hiç bir case ile uyuşmazsa default satırı devreye girer,
        //geriye kalanların hepsi için kullanılır


        switch (harf){

            case 'P':
                System.out.println("Pazar, Pazartesi veya Persembe");
                break;
            case 'S' :
                System.out.println("Sali");
                break;
            case 'C' :
                System.out.println("Carsamba, Cuma veya Cumartesi");
                break;

            default:
                System.out.println("Gecersiz harf");
        }


    }
}
