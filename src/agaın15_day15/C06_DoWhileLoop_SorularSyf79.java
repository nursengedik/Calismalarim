package agaın15_day15;

public class C06_DoWhileLoop_SorularSyf79 {

    public static void main(String[] args) {

        //soru 1- 'k' harfinden 't' harfine kadar harfleri yazdırın
//
      //  char harf='k';
      //  do {
      //      System.out.print(harf+" ");
      //      harf++;
//
      //  }while (harf<='t');

        //soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        //  kontrol edin ve sifredeki hatalari yazdirin.
        //  Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        //  sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.

        //- Sifre kucuk harf icermelidir
        //- Sifre buyuk harf icermelidir
        //- Sifre ozel karakter icermelidir
        //- Sifre en az 8 karakter olmalidir

      // Scanner scan= new Scanner(System.in);

      // String sifre="";
      // int flag=0;

      // while (flag != 4){//flag 4 e eşit olmadığı müddetçe çalıştır, eşit olunca durur

      //     flag=0;
      //     System.out.println("Lütfen şifrenizi giriniz");
      //     sifre=scan.nextLine();

      //     //-Sifre kucuk harf icermelidir

      //     if (sifre.matches(".*[a-z].*")){//şifre küçük harf içeriyorsa
      //         flag++;//flagı 1 arttır
      //     }else {
      //         System.out.println("Hata: Şifre küçük harf içermelidir.");
      //     }

      //     //- Sifre buyuk harf icermelidir

      //     if (sifre.matches(".*[A-Z].*")){//şifre büyük harf içeriyorsa
      //         flag++;
      //     }else {
      //         System.out.println("Hata: Şifre büyük harf içermelidir.");
      //     }

      //      //- Sifre ozel karakter icermelidir


      //     if (sifre.matches(".*[^a-zA-Z0-9].*")){//şifre özel karakter içeriyorsa
      //         flag++;
      //     }else {
      //         System.out.println("Hata: Şifre özel karakter içermelidir.");
      //     }

      //     //- Sifre en az 8 karakter olmalidir

      //     if (sifre.length()>=8){//
      //         flag++;
      //     }else {
      //         System.out.println("Hata: Şifre en az 8 karakter olmalıdır.");
      //     }

      // }

      // System.out.println("Şifreniz kabul edilmiştir");

       /*
          ".*[az].*" şu durumda eşleşir: dize İÇERİR (en az bir) küçük harf.
          ".*[AZ].*" şu durumlarda eşleşir: dize İÇERİR (en az bir) büyük harf.
          Düzenli ifadede, . herhangi bir dize dizisiyle eşleşir (elbette aynı satırda). Her iki tarafta da . varsa,
          bu, dizenin [az]'dan önce ve sonra herhangi bir şeyle başlayıp bitebileceği anlamına gelir. Diğer bir deyişle,
          bir dizgenin içinde [az] varsa, ondan önce ve sonra hangi karakterler olursa olsun, normal ifade eşleşir.

         Yani:
         ".*[az].*" şu durumda eşleşir: dize İÇERİR (en az bir) küçük harf.
         ".*[AZ].*" şu durumlarda eşleşir: dize İÇERİR (en az bir) büyük harf.

        matched==> eşleşir demek
        continue==> devam et demek
       */

       //başka bir çözüm yolu

       //Scanner scan= new Scanner(System.in);
       //boolean sifreDogruMu = false;

       //while (!sifreDogruMu) {//şifre doğru oladığı müddetçe çalış
       //    System.out.println("Lütfen şifrenizi giriniz");
       //
       //    String sifre = scan.nextLine();

       //    if (!sifre.matches(".*[a-z].*")) {//şifre küçük harf içermiyorsa
       //        System.out.println("Hata: Şifre küçük harf içermelidir.");
       //        continue;
       //    }

       //    if (!sifre.matches(".*[A-Z].*")) {//şifre büyük harf içermiyorsa
       //        System.out.println("Hata: Şifre büyük harf içermelidir.");
       //        continue;
       //    }

       //    if (!sifre.matches(".*[^a-zA-Z0-9].*")) {//şifre özel karakter içermiyorsa
       //        System.out.println("Hata: Şifre özel karakter içermelidir.");
       //        continue;
       //    }

       //    if (sifre.length() < 8) {//şifrenin uzunluğu 8 karakterden azsa
       //        System.out.println("Hata: Şifre en az 8 karakter olmalıdır.");
       //        continue;
       //    }

       //    sifreDogruMu = true;
       //}

       //System.out.println("Şifreniz Kabul edilmistir.");


         //soru 3-Kullanıcıdan bir pozitif sayı isteyin, sayının tam kare olup olmadığını bulunuz,
        //tamkare ise true, değilse false yazdırınız
        //Örnek: input: 16, output: 4

       // Scanner scan=new Scanner(System.in);
       // System.out.println("Lütfen pozitif bir sayı giriniz");
       // int sayı=scan.nextInt();
       // int flag=0;
//
       // for (int i = 1; i <sayı ; i++) {
       //     if (i*i==sayı){
       //         flag++;
       //         System.out.println(i+"\ntrue");
       //     }
       // }
       // if (flag==0){
       //     System.out.println("false");
       // }


    }
}
