package agaın20_day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullanıcıyaListeOluşturtmak {

    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda (durdurduğunda) girdigi isimleri bize liste olarak dondurecek bir method olusturun.


        //kullanıcıyaListeOluşturtmak();//bu method bize bir liste döndürecek ya yazdırılır ya da atama yapılır
        System.out.println(kullanıcıyaListeOluşturtmak());
    }
    public  static List<String> kullanıcıyaListeOluşturtmak(){

        List<String> isimler= new ArrayList<>();
        String girilenİsim="";
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("Lütfen eklemek için bir isim girin"+
                    "\nBitirmek için 'ya basın");

            girilenİsim=scan.nextLine();

            if (!girilenİsim.equalsIgnoreCase("q")){
                isimler.add(girilenİsim);
            }

        }while (!girilenİsim.equalsIgnoreCase("Q"));

        return isimler;

    }




}
