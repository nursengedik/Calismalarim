package agaın08_day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C05_NestedTernary {

    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        // uygun olani yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayı = scan.nextInt();

        System.out.println(sayı > 0
                ? sayı % 2 == 0 ? "Çift sayi" : "Tek sayi"
                : sayı > -1000 && sayı < 99 ? "Üç basamakli" : "3 basamakli degil");




    }
}