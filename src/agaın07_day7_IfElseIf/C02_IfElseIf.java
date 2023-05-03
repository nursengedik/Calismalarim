package agaın07_day7_IfElseIf;

import java.util.Scanner;

public class C02_IfElseIf {

    public static void main(String[] args) {

        //Birden fazla şart varsa If Else If kullanılır
        //İhtimaller 1 den fazla ama sadece 1 i çalışacak
        //şartlardan hangisi sağlanıyorsa onu çalıştırır ve geriye kalanlara bakmaz
        //şartlardan hiçbiri sağlanmıyorsa ve if body si else ile bitmiyorsa ekranda birşey yazdırmaz
        // Eger bir if else if... cumlesi else ile bitiyorsa MUTLAKA if body'lerinden 1 TANESI CALISIR

        // kullanicidan pozitif bir tamsayi alin
        // sayi 3 ile bolunebiliyorsa "3'un kati"
        // sayi 5 ile bolunebiliyorsa "5'in kati"
        // sayi hem 3 hem de 5 ile bolunebiliyorsa "3 ve 5'in kati" yazdirin
        // (hem de denildiği için && kullanılır)

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi girin");

        int sayı = scan.nextInt();

        //önce iki sayıya da bölünebilen şartı yazmalıyız,çünkü java yukarıdan aşağıya çalışır
        //önce sayı%3==0 yazarsak ve sayı 30 girdiğimizde 3 ün katı şartını sağladığı için onu yazdırır
        //ve geri kalana bakmaz

        if (sayı%3==0 && sayı%5==0) {
            System.out.println("3 ve 5'in kati");
        } else if (sayı%3==0) {
            System.out.println("3'un kati");
        } else if (sayı%5==0){
            System.out.println("5'in kati");
        }else {                                   //hiçbir şart sağlanmıyor durumu yazılır
            System.out.println("ne 3'ün ne de 5'in katı değil");
        }


       /*
            Bazen sartlar olasi tum durumlari karsilamaz
            bu durumda if else if .... cumleleri else ILE BITMEZ
            else ile bitmeyen if else if ... cumlelerinde
            bazi durumlarda hic bir if body'si devreye girmeyebilir


            Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi girin");

        int sayi = scan.nextInt();

        if (sayi%3==0 && sayi%5==0){
            System.out.println("3 ve 5'in kati");
        } else if (sayi%3==0){
            System.out.println("3'un kati");
        } else if (sayi%5==0) {
            System.out.println("5'in kati");
        } mesela 37 girdiğimizde ekranada ne 3 ün katı ne de 5 in katı yazdırmaz

       */



    }
}
