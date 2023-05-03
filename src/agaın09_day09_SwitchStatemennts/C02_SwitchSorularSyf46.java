package agaın09_day09_SwitchStatemennts;

public class C02_SwitchSorularSyf46 {

    public static void main(String[] args) {

        //Soru 1-Kullanıcıdan bir rakam alıp, rakamı yazıyla yazdırın
       //        önce neye göre switch yapacağımıza kara veririz (rakama göre)

     //  Scanner scan=new Scanner(System.in);
     //  System.out.println("Lütfen bir rakam giriniz");
     //  int rakam=scan.nextInt();

     //switch (rakam){
     //    case 0:
     //        System.out.println("Girdiğiniz rakam: Sıfırdır");
     //        break;
     //    case 1:
     //        System.out.println("Girdiğiniz rakam : Birdir");
     //        break;
     //    case 2:
     //        System.out.println("Girdiğiniz rakam: İkidir");
     //        break;
     //    case 3:
     //        System.out.println("Girdiğiniz rakam : Üçtür");
     //        break;
     //    case 4:
     //        System.out.println("Girdiğiniz rakam: Dörttür");
     //        break;
     //    case 5:
     //        System.out.println("Girdiğiniz rakam : Beştir");
     //        break;
     //    case 6:
     //        System.out.println("Girdiğiniz rakam: Altıdır");
     //        break;
     //    case 7:
     //        System.out.println("Girdiğiniz rakam : Yedidir");
     //        break;
     //    case 8:
     //        System.out.println("Girdiğiniz rakam: Sekizdir");
     //        break;
     //    case 9:
     //        System.out.println("Girdiğiniz rakam : Dokuzdur");
     //        break;
     //    default:
     //        System.out.println("Girilen sayı rakam değildir");
     //}


        //Soru 2-Kullanıcıdan 2 basamaklı bir sayı alıp, girilen sayıyı yazı ile yazdırın

      // Scanner scan=new Scanner(System.in);
      // System.out.println("İki basamaklı bir sayı giriniz");
      // int sayı= scan.nextInt();//sayımızı aldık
      // if (sayı>=10 && sayı<=99){//sayı 2 basamaklı olduğu için aralıklarını belirlemeliyiz  ve sağlarsa
      //                          // switch çalışır, switch i if içerisinde yazmalıyız


      //     int birler=sayı%10;//2 basamaklı sayıyı yazdırabilmek için 10 dan 99 a kadar tüm sayıları switch e
      //     int onlar=sayı/10;//yazamayız, switch i basamak ismine göre oluştururuz, bu nedenle birler ve onlar
      //                      //basamağı tanımlanır, sayı söylenirken onlar basamağından başladığımız için switch
                             // oluşturuken de önce onlar b oluşturulur

      //     switch (onlar){//parantezin içi case 1 i sağlarsa yani eşitse yazdırır
      //         case 1:
      //             System.out.print("on");//girilen sayıyı yazı ile yazdırın denildiği için yazıyla yazarız
      //             break;                //onlar basamağı ile birler b yan yana yazılacağı için print kullanılır
      //         case 2:
      //             System.out.print("yirmi");
      //             break;
      //         case 3:
      //             System.out.print("otuz");
      //             break;
      //         case 4:
      //             System.out.print("kırk");
      //             break;
      //         case 5:
      //             System.out.print("elli");
      //             break;
      //         case 6:
      //             System.out.print("altmış");
      //             break;
      //         case 7:
      //             System.out.print("yetmiş");
      //             break;
      //         case 8:
      //             System.out.print("seksen");
      //             break;
      //         case 9:
      //             System.out.print("doksan");
      //             break;
      //
      //     }switch (birler){//onlar basamağını oluşturduktan sonra birler basamağını oluştururuz
      //         case 0:
      //             System.out.print(" ");
      //         case 1:
      //             System.out.print("bir ");
      //             break;
      //         case 2:
      //             System.out.print("iki ");
      //             break;
      //         case 3:
      //             System.out.print("üç");
      //             break;
      //         case 4:
      //             System.out.print("dört");
      //             break;
      //         case 5:
      //             System.out.print("beş");
      //             break;
      //         case 6:
      //             System.out.print("altı");
      //             break;
      //         case 7:
      //             System.out.print("yedi");
      //             break;
      //         case 8:
      //             System.out.print("sekiz");
      //             break;
      //         case 9:
      //             System.out.print("dokuz");
      //             break;
      //     }
      // }else {
      //     System.out.println("Lütfen sadece iki basamaklı sayı giriniz");
      // }


        //Soru 3- Kullanicidan ay numarasini alip ay ismini yazdirin
//
       // Scanner scan= new Scanner(System.in);
       // System.out.println("Lütfen yazdırmak istediğiniz ayın numarasını giriniz (1-12)");
       // int ayNumarası=scan.nextInt();
//
       // switch (ayNumarası){
       //     case 1 :
       //         System.out.println("Birinci ay : Ocak");
       //         break;// break yazana kadar kod çalışır
       //     case 2 :
       //         System.out.println("İkinci ay : Şubat");
       //         break;
       //     case 3 :
       //         System.out.println("Üçüncü ay : Mart");
       //         break;
       //     case 4 :
       //         System.out.println("Dördüncü ay : Nisan");
       //         break;
       //     case 5 :
       //         System.out.println("Beşinci ay : Mayıs");
       //         break;
       //     case 6 :
       //         System.out.println("Altıncı ay : Haziran");
       //         break;
       //     case 7 :
       //         System.out.println("Yedinci ay : Temmuz");
       //         break;
       //     case 8 :
       //         System.out.println("Sekizinci ay : Ağustos");
       //         break;
       //     case 9 :
       //         System.out.println("Dokuzuncu ay : Eylül");
       //         break;
       //     case 10 :
       //         System.out.println("Onuncu ay : Ekim");
       //         break;
       //     case 11 :
       //         System.out.println("On birinci ay : Kasım");
       //         break;
       //     case 12:
       //         System.out.println("On ikinci ay : Aralık");
       //         break;
       //     default:
       //         System.out.println("Geçersiz bir numara girdiniz");
//
       // }


       // Soru 4-Kullanıcıdan ISTQB kısaltmasından harfin anlamını öğrenmek istediğini alın ve
        //       girilen harfin karşılığını yazdırın
        //       I:International  S:Software T:Testing Q:Qualifications B:Board

        //Scanner scan=new Scanner(System.in);
        //System.out.println("Lütfen ISTQB kısaltmasından anlamını öğrenmek istediğiniz harfi giriniz");
        //char harf=scan.next().toUpperCase().charAt(0);


      //switch (harf){
      //    case 'I' :
      //        System.out.println("I:International");
      //        break;
      //    case  'S':
      //        System.out.println("S:Software ");
      //        break;
      //    case 'T':
      //        System.out.println("T:Testing");
      //        break;
      //    case 'Q':
      //        System.out.println("Q:Qualifications");
      //        break;
      //    case 'B':
      //        System.out.println("B:Board");
      //    default:
      //        System.out.println("Yanlış giriş yaptınız");

      //}


        //Soru 5-Kullanıcıdan gün numarasını alıp hafta içi veya hafta sonu yazdırın

      // Scanner scan= new Scanner(System.in);
      // System.out.println("Lütfen gün numarası giriniz (1-7)");
      // int günNumarası=scan.nextInt();

      // switch (günNumarası){
      //     case 1:
      //     case 2:
      //     case 3:
      //     case 4:
      //     case 5:
      //         System.out.println("Hafta içi");
      //         break;
      //     case 6:
      //     case 7:
      //         System.out.println("Hafta sonu");
      //         break;
      //     default:
      //         System.out.println("Geçersiz numara girişi");
      // }


        // Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.

      // Scanner scan= new Scanner(System.in);
      // System.out.println("Lütfen mevsimini öğrenmek istediğiniz ayın numarasını giriniz (1-12)");
      // int ayNumarası=scan.nextInt();

      // switch (ayNumarası){
      //     case 12 : //burada case ler yan yana da yazılabilir case 1: case 2: case 3:
      //     case 1:
      //     case 2:
      //         System.out.println("Girilen numaranın ayı : Kış mevsimindedir");
      //         break;
      //     case 3 :
      //     case 4:
      //     case 5:
      //         System.out.println("Girilen numaranın ayı : İlkbahar mevsimindedir");
      //         break;
      //     case 6 :
      //     case 7:
      //     case 8:
      //         System.out.println("Girilen numaranın ayı : Yaz mevsimindedir");
      //         break;
      //     case 9 :
      //     case 10:
      //     case 11:
      //         System.out.println("Girilen numaranın ayı : Sonbahar mevsimindedir");
      //         break;
      //     default:
      //         System.out.println("Geçersiz bir numara girdiniz");

      // }

     //Soru 7-Kullanıcıdan yılı ve ay numarasını alıp o yıldaki o ayda kaç gün olduğunu yazdırın

       // Scanner scan= new Scanner(System.in);
       // System.out.println("Lütfen bilgi istediğiniz yılı giriniz");
       // int yıl=scan.nextInt();
       //System.out.println("Gün sayısını merak ettiğiniz ayın numarasını giriniz");
       // int ayNumarası=scan.nextInt();

       // int gün=0;
       // switch (ayNumarası){
       //     case 1: case 3: case 5: case 7: case 8: case 10: case 12:
       //         gün=31;//gün 31 olacak, gün tanımladık, değer ataması yapmadık
       //         System.out.println("Girdiğiniz yıldaki ayın gün sayısı : "+ gün);
       //         break;
       //     case 4: case 6: case 9: case 11:
       //         gün=30;
       //         System.out.println("Girdiğiniz yıldaki ayın gün sayısı : "+ gün);
       //         break;
       //     case 2:
       //         gün=((yıl%4==0 && !(yıl%100==0) || yıl%400==0)? 29 :28);
       //         System.out.println("Girdiğiniz yıldaki ayın gün sayısı : "+ gün);
       //         break;
       //     default:
       //         System.out.println("Geçersiz ay");
       // }



    }
}
