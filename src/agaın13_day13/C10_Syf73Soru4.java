package agaın13_day13;

import java.util.Scanner;

public class C10_Syf73Soru4 {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        //        bolenleri sayisini bulup bize donduren bir method olusturun.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayı=scan.nextInt();

        int tamBolen=pozıtıfTamBolen(sayı);
        System.out.println(sayı+ " Sayısının pozitif tam bölen sayısı : " + tamBolen);

    }

        public static int pozıtıfTamBolen(int sayı){

        int tamBolen=0;
            for (int i = 1; i <=sayı ; i++) {
                if (sayı%i==0){
                    tamBolen++;//soruda tam bölenlerin sayısını istediği için ++ ile sayıyı bölen sayı olduğunda
                              // arttırıyoruz, eğer bölen sayıları isteseydi tamBolen e atama yapardık
                }
                
            }
            return tamBolen;
        
        }



}
