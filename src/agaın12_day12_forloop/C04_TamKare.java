package agaın12_day12_forloop;

import java.util.Scanner;

public class C04_TamKare {

    public static void main(String[] args) {

         /*
           Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
           bulunuz, tamkare ise true değilse false yazdırınız.
           Ornek : input : 16, output: 4

         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayı=scan.nextInt();
        int flag = 0;

        for (int i = 1; i <sayı; i++) {
            if (i*i==sayı){
                flag++;
                System.out.println(i + " true");

                break;
            }
        }if (flag==0){
            System.out.println("false");
        }
    }


}

