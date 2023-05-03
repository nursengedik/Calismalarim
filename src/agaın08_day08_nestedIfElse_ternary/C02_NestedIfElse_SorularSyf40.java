package agaın08_day08_nestedIfElse_ternary;

public class C02_NestedIfElse_SorularSyf40 {

    public static void main(String[] args) {

        //Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
        // Kural  1: 4 ile bolunemeyen yillar artik yil degildir
        // Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
        // Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan
        // sadece 400’un kati olan yillar artik yildir (if else if sorusu)

       //Scanner scan=new Scanner(System.in);
       //System.out.println("Lütfen bir yıl giriniz");
       //int yıl=scan.nextInt();
       //if (yıl % 4!= 0){
       //    System.out.println("Artık yıl değildir");
       //} else if (yıl%100 !=0) {
       //    System.out.println("Artık yıl");
       //} else if (yıl%400==0) {
       //    System.out.println("Artık yıl");
       //}else {
       //    System.out.println("Artık yıl değil");
       //}

      /*
        Soru 1-
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.
        hatali giris yapilirsa kullaniciyi uyarin
         */
         // birden fazla degiskene bagli if else statement'larini yazarken
        // once degiskenlerden birine gore ana yapiyi olusturalim
        // bu soruda cinsiyeti ana degisken yapalim

        // ikinci degiskeni ana degiskenin her bolumunde ayri ayri degerlendirelim

        // bu defa ana degisken yas olsun

     //>>>> Scanner scan = new Scanner(System.in);

     //>>>> System.out.println("Lutfen yasinizi giriniz");

     //>>>> double yas = scan.nextDouble();

     //>>>> System.out.println("Lutfen cinsiyetinizi giriniz..." +
     //>>>>         "\nKadin icin : K, Erkek icin : E giriniz");

     //>>>> char cinsiyet = scan. next().charAt(0);

     //>>>> if (yas<16 || yas>80){
     //>>>>     System.out.println("Gecersiz yas");
     //>>>> } else if (yas<60) { // 16-60 yas arasi

     //>>>>     if (cinsiyet=='k' || cinsiyet=='K'){
     //>>>>         System.out.println("Emekli olmak icin " +(60-yas)+" yil daha calismalisin");
     //>>>>     } else if (cinsiyet=='e' || cinsiyet=='E') {
     //>>>>         System.out.println("Emekli olmak icin " +(65-yas)+" yil daha calismalisin");
     //>>>>     }else{
     //>>>>         System.out.println("Gecersiz cinsiyet girisi");
     //>>>>     }

     //>>>> } else if (yas<65) { // 60-65 yas arasi
     //>>>>     if (cinsiyet=='k' || cinsiyet=='K'){
     //>>>>         System.out.println("Emekli olabilirsin ");
     //>>>>     } else if (cinsiyet=='e' || cinsiyet=='E') {
     //>>>>         System.out.println("Emekli olmak icin " +(65-yas)+" yil daha calismalisin");
     //>>>>     }else{
     //>>>>         System.out.println("Gecersiz cinsiyet girisi");
     //>>>>     }


     //>>>> }else {// 65-80 arasi
     //>>>>     if (cinsiyet=='e'||cinsiyet=='E'||cinsiyet=='k'||cinsiyet=='K'){
     //>>>>         System.out.println("emekli olabilirsin");
     //>>>>     }else{
     //>>>>         System.out.println("Gecersiz cinsiyet girisi");
     //>>>>     }

     //>>>> }
        //soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        //        Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

       // Scanner scan=new Scanner(System.in);
       // System.out.println("Lütfen aldığınız ürün adedini giriniz");
       // int ürünAdedi=scan.nextInt();
//
       // System.out.println("Lütfen aldığınız ürünün liste fiyatını giriniz");
       // double listeFiyatı=scan.nextDouble();
//
//
       // System.out.println("Müşteri kartınız var mı? "+
       //                    "\nEvet ise E, hayır ise H giriniz");
       // char kart=scan.next().charAt(0);
//
//
       // if (kart=='e' || kart=='E'){
       //        if (ürünAdedi<=0){
       //         System.out.println("Geçersiz ürün girişi");
       //        } else if (ürünAdedi >= 10) {
       //         System.out.println((ürünAdedi*0.80*listeFiyatı)+"indirim" );
       //        }else {
       //         System.out.println((ürünAdedi*0.85*listeFiyatı)+"indirim" );
       //        }
//
//
       // } else if (kart=='h' || kart=='H') {
//
       //     if (ürünAdedi<=0){ //Önce sınırlar belirtilir ve olumsuz olan şart yazılır
       //         System.out.println("Geçersiz ürün girişi");
       //     } else if (ürünAdedi >= 10) {
       //         System.out.println((ürünAdedi*0.85*listeFiyatı)+"indirim" );
       //     }else {
       //         System.out.println((ürünAdedi*0.90*listeFiyatı)+"indirim" );//kalan aralık 10 dan küçük
       //     }                                                               //ürün adedi
       //
       // }else{
       //     System.out.println("Yanlış kart girişi");
        //}


        //soru 3-Kullanicidan bir sayi alin
        //       sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin,
        //       sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin.









        //soru 4-- Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
        // seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.





    }
}
