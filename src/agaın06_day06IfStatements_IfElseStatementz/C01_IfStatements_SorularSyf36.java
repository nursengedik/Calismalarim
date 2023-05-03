package agaın06_day06IfStatements_IfElseStatementz;

public class C01_IfStatements_SorularSyf36 {

    public static void main(String[] args) {

        //if cümleleri bir tek  şartı kontrol eder ve sağlanırsa yazdırır,sağlanmazsa kalanla ilgilenmez

       //// Soru 1- Kullanicidan bir sayi isteyin,
       ////         sayiyi kontrol edip 5 ile bolunebiliyorsa (şart,yani 5'e tam bölünüyorsa)
       ////         “Sayi 5’in tam kati” yazdirin. (yazdırma)

       //Scanner scan= new Scanner(System.in);

       //System.out.println("Lutfen pozitif bir tamsayi giriniz");

       //int sayi = scan.nextInt();

       //if (sayi % 5 == 0){
       //    System.out.println("Sayi 5’in tam kati");//sayı 5'e tam bölünmüyorsa kod çalışır ama
       //                                            // sayı 5'e bölünemez yazmaz
       //}


        //Soru 2- Kullanıcıdan bir harf alın, harf ile başlayan bir ay varsa yazdırın.
        //        not: büyük harf, küçük harf hassasiyeti olmasın.
        //        kullanıcı o veya O yazdığında output Ocak olcun

        /*
            if statements'da sart parantezinden sonra {} kullanmazsak
            Java ilk ; ' e kadar olan kismi if body olarak kabul eder
            if body zaten bir satir ise bu bir sorun olmaz
            ama if body 1 satirdan coksa, ilk satirdan sonrasi
            her durumda calisir
         */

        // /*
        //    büyük harf, küçük harf hassasiyeti olmaması için || OR operatöründen yararlanılır
        //    &&'de iki şart da sağlanmalıdır yani girilen harfin hem küçüğü hem de büyüğü birlikte girilmelidir
        // */

       //Scanner scan= new Scanner(System.in);
       //System.out.println("Lütfen bir harf giriniz");
       //char harf=scan.next().charAt(0);

       //if (harf=='o' || harf=='O') System.out.println("Ocak");
       //if (harf=='ş' || harf=='Ş') System.out.println("Şubat");
       //if (harf=='m' || harf=='M') System.out.println("Mart"+", "+"Mayıs");
       //if (harf=='n' || harf=='N') System.out.println("Nisan");
       //if (harf=='h' || harf=='H') System.out.println("Haziran");
       //if (harf=='t' || harf=='T') System.out.println("Temmuz");
       //if (harf=='a' || harf=='A') System.out.println("Ağustos"+", "+"Aralık");
       //if (harf=='e' || harf=='E') System.out.println("Eylül"+", "+"Ekim");
       //if (harf=='k' || harf=='K') System.out.println("Kasım");


        //Soru 3- Kullanicidan bir sayi alin,
        //        sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //        5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.


         /*
            soru 2' deki gibi ayrı ayrı süslü parantez kullanmadan if cümleleri oluşturulur
         */

       //Scanner scan= new Scanner(System.in);
       //System.out.println("Lütfen bir tamsayı giriniz");
       //int sayı=scan.nextInt();

       //if (sayı%3==0) System.out.println("Uc ile bolunebilen sayi");// süslü parantezi kullanmıyoruz
       //if (sayı%5==0) System.out.println("Bes ile bolunebilen sayi");

       //Java yukarıdan aşağıya çalıştığı için girilen sayı 1 if cümlesine uyarsa onu çalıştırır
        //uymaz ise 2 if cümlesini çalıştırır

//
        //if (sayı%3==0 || sayı%5==0){// || OR operatöriyle sadece 3'e veya sadece 5'e bölünen sayılara da iki
                                     // sonucu da yazdırıyor, OR'la çözülmez
//
        //    System.out.println("Uc ile bolunebilen sayi");
        //    System.out.println("Bes ile bolunebilen sayi");
        //}


        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin.


       // Scanner scan=new Scanner(System.in);
       //System.out.println("Lütfen üçgenin 3 kenar uzunluğunu giriniz");
       //double kenar1= scan.nextDouble();
       //double kenar2=scan.nextDouble();
       //double kenar3=scan.nextDouble();

       // /*
       //    Java'da 3'lu karsilastirma YOKTUR
       //    Onun yerine ikili karsilastirmalar yapip && ile birlestirebiliriz
       // */

       //if (kenar1==kenar2 && kenar2==kenar3 && kenar1==kenar3){
       //    System.out.println("Eşkenar üçgen");

       //}

        // Soru 5- Kullanicidan notunu alin
        //         50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.

         /*
            soru 2' deki gibi ayrı ayrı süslü parantez kullanmadan if cümleleri oluşturulur
         */


       // Scanner scan=new Scanner(System.in);
       // System.out.println("Lütfen notunuzu giriniz");
       // double not= scan.nextDouble();
//
       // if (not>=50 && not<=100) System.out.println("Sinifi Gectin");//süslü parantezi kullanmıyoruz
       // if (not<50) System.out.println("Maalesef kaldin");



    }

}
