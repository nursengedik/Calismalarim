package agaın12_day12_forloop;

public class C02_SorularSyf636465 {

    public static void main(String[] args) {

        //Soru 1- 1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak yazdirin.

        // for (int i=1; i<=100; i++){
        //     System.out.print(i+" ");//yazdırmayı içerde yapmamızın nedeni tüm sayıları yazdırmamızı istediği için
        // }                          //print yan yana yazdırır, " " aralarında bir boşluk verir


        //Soru 2- Kullanicidan pozitif bir tamsayi alin,
        //        1’den girilen sayiya kadar(girilen sayi dahil)  (for oluşturulacak)
        //        7 ile bolunebilen sayilari yazdirin.(bölünüyorsa)  (if oluşturulacak)

        // Scanner scan=new Scanner(System.in);
        // System.out.println("Lütfen pozitif bir tamsayı giriniz ");
        // int girilenSayı= scan.nextInt();
//
        // for (int i=1; i<=girilenSayı; i++){
        //     if (i%7==0){
        //         System.out.print(i+" ");
        //     }
        // }


        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.(toplam +=i;)
        //        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        // int başlangıcDegeri=20;
        // int bitisDegeri=400;
//
        // int toplam=0;
//
        // if (bitisDegeri<başlangıcDegeri){//istenmeyen durum oluşursa işlem biter, oluşmazsa işleme devam et
        //     System.out.println("Başlangıç değeri bitiş değerinden küçük olmalıdır");
//
        // }else {
        //     for (int i = başlangıcDegeri; i <=bitisDegeri ; i++) {
        //         toplam +=i;
//
        //     }
        // }
//
        // System.out.println("Sayıların toplamı : "+toplam);//her döngüde yazdırma yapmayacağı için bir de
                                                            //en son döngü bittikten sonra toplamı yazdıracağı
                                                           //için yazdırma for un dışında yapılır


        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucuk olsa da program calissin (yani for oluşturulacak)

        //Scanner scan = new Scanner(System.in);
        //System.out.println("Baslangic degerini tamsayi olarak giriniz");
        //int bas = scan.nextInt();

        //System.out.println("Bitis degerini tamsayi olarak giriniz");
        //int bit = scan.nextInt();

        //int sayılarınToplamı=0;

        //if (bit<bas){
        //    for (int i = bas; i <=bit ; i++) {
        //        sayılarınToplamı+=i;

        //    }

        //}else {//baslangic degeri bitis degerinden buyuk

        //    for (int i = bas; i >= bit; i--) {
        //        sayılarınToplamı += i;

        //    }

        //    System.out.println("Sayilarin toplami : " + sayılarınToplamı);

   // }

        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.

       // Scanner scan = new Scanner(System.in);
       // System.out.println("Lütfen 20'den küçük bir tamsayı giriniz");
//
       // int sayı=scan.nextInt();
//
       // int faktoryel=1; //ör: 4!=4*3*2*1=24
//
       // for (int i = sayı; i>=1 ; i--) {
       //     faktoryel*=i;
       //
       // }
       // System.out.println(sayı + "! = " + faktoryel);


         //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        //       bu sayinin faktoryel degerini hesaplayin.
        //       Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	     Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720


       // int sayı=8;
       // int faktoryel=1;
//
       // System.out.print(sayı+"!= ");
//
       // for (int i = sayı; i >=1 ; i--) {
       //           faktoryel*=i;
//
       //     if (i!==1){//i 1 e eşit değilse
       //         System.out.print(i + " * ");
       //     }else{
       //         System.out.print(i + " ");
       //     }
       // }
//
       // System.out.println("= " + faktoryel);


        //Soru 7- Kullanıcıdan pozitif bir tamsayı alıp, rakamlar toplamını yazdırın (şart yok, yani if yok)
        //        day15-C02 de çözümü var

       //Scanner scan=new Scanner(System.in);
       //System.out.println("Lütfen pozitif bir tamsayı giriniz");

       //int sayı= scan.nextInt();
       //int birlerBasamagı=0;
       //int rakamlarToplamı=0;

       //int basamakSayısı=(sayı+"").length();//5 //sayı'nın lenght() i alınmaz ama sayı stringleştirilirse
       //                                    //yani yanına + dersek stringleşir ve uzunluğu alınabilir

       //for (int i = 1; i <=basamakSayısı ; i++) {//1 den başlayıp 5 e kadar gidecek (uzunluk dikkate alınıyor)

       //    birlerBasamagı=sayı%10;                 //önce sayının birler basamağı bulunur,
       //                                           //macılıs (%)10: 10 na bölümünden kalanı verir
       //    rakamlarToplamı+=birlerBasamagı;      //rakamlar toplamına atanır
       //    sayı/=10;                            //diğer basamağı bulabilmek için sayıyı 10 a böleriz ve kalan
       //                                        //sayı üzerinden aynı işlem devam eder

       //}
       //System.out.println(rakamlarToplamı);


        //Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
        //                    tamsayilari yazdirin, sira
        //                    - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //                    - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        //                    - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
        //                     yazdirin


        //Scanner scan=new Scanner(System.in);
        //System.out.println("Lütfen pozitif bir tamsayı giriniz");
        //int sayı= scan.nextInt();

       //for (int i = 1; i <=sayı ; i++) {

       //    if (i%3==0 && i%5==0){//sayıların her birinin 3 e ve 5 e bölünüp bölünmediğine bakılacağı için
       //        System.out.println("fizzBuzz");   //i macılıs denir
       //    } else if (i % 3 == 0) {
       //        System.out.println("fizz");
       //    }else if (i%5==0){
       //        System.out.println("buzz");
       //    }else {
       //        System.out.print(i+", ");//şartı sağlayan sayılar yazdırılır
       //    }
       //}


        //Soru 9 (interview)- Kullanicidan bir String isteyin
        //                    ve String’i tersden yazdırın


        //Scanner scan=new Scanner(System.in);
        //System.out.println("Lütfen bir kelime giriniz");
        //String kelime=scan.next();
        //String terstenKelime="";

        //for (int i = kelime.length()-1; i >=0 ; i--)




        //Soru 10 (interview)- Kullanicidan bir String isteyin
        //                      ve String’i tersine çevirip kaydedin

       //Scanner scan=new Scanner(System.in);
       //System.out.println("Lütfen bir kelime giriniz");
       //String kelime=scan.next();
       //String terstenKelime="";
       ////                                            //kelimeyi tersine çevireceği için son harften başlanmalı
       //for (int i = kelime.length()-1; i >=0 ; i--) {//burada kelimenin index'ini dikkate alıyoruz
//
       //    //terstenKelime+=i; //harflerin index numaralarını yazdırır (3210)
//
       //    terstenKelime+=kelime.charAt(i);
//
       //}
       // System.out.print(terstenKelime);// bu sorunun başka bir yolla çözümü week04_P04'te



        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        //         kontrol edin ve sonucu yazdirin. day14_C01'de çözümü var


        //Scanner scan=new Scanner(System.in);
       //System.out.println("Lütfen pozitif bir tamsayı giriniz");
       //int sayı= scan.nextInt();

       //int flag=0;//girilen sayıya bölünen sayıları tutar

       //for (int i = 2; i <sayı ; i++) {

       //    if(sayı % i == 0){//burada sayının kendisine kadar olan sayılara bölünüp bölünmediği kontrol edilir
       //        flag++;      //sayı kendisine kadar olan sayılardan herhangi birine bölünüyorsa flag bir artar
       //        break;      //break sonlandır demektir
       //    }
       //}//daha sonra flag'ın durumlarını  yazdırırız

       //if (sayı == 2){
       //    System.out.println("Girilen 2 sayisi ASAL bir sayidir");
       //}else if (flag==0){
       //    System.out.println("Girilen " + sayı + " sayisi ASAL bir sayidir");
       //}else {
       //    System.out.println("Girilen " + sayı + " sayisi ASAL bir sayi degildir");

       //}

        //Soru – Asagidaki sekilleri yazdirin - day12_C09

       //satırlar print, sutunlar println olacak

    /*
      Şekil 1
              *
              * *
              * * *
              * * * *
    */
        //önce sadece satır sayısı tanımlanır (üçgenlerde)

        //int satır=4;

       //for (int i = 1; i <=satır ; i++) {//satırlar
       //    for (int j = 1; j <=i ; j++) {
       //        System.out.print("* ");//sutunları oluşturduğu için print yazılır

       //    }
       //    System.out.println("");// bir satirdaki tum sutunlar bitince alt satira geciyor,println
       //}


    /*
      Şekil 2
              * * * * * * * *
              * * * * * * * *
              * * * * * * * *
              * * * * * * * *
    */

        //önce satır ve sutun tanımlayacağız

       //int satır=4;
       //int sutun=8;

       //for (int i = 1; i <=4 ; i++) {    //satırlar
       //    for (int j = 1; j <=8 ; j++) {//sutunlar
       //        System.out.print("* ");  //sutunları oluşturduğu için print yazılır
       //    }
       //    System.out.println("");//satırları oluşturur, bir satirdaki tum sutunlar bitince alt satira geciyor
       //}


    /*
      Şekil 3
              * * * * * * * *
              * * * * * *
              * * * *
              * *
    */
        //
        int sutun=8;

        for (int i = 0; i <9 ; i++) {//satır sayısı
            for (int j = 0; j <sutun ; j++) {//satır sayısı
                System.out.print("* ");

            }
            System.out.println("");
            sutun-=2;  //sutundaki eksilmeyi burada yapıyoruz, çünkü satır ve sutun sayılarında değişiklik yok
                       //sadece sutunlarda yıldız sayısı azalıyor
        }











    }
}
