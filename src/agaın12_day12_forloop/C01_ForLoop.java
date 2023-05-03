package agaın12_day12_forloop;

public class C01_ForLoop {

    public static void main(String[] args) {

        //50'den baslayip, int i=50;
        // 100'e kadar(100 dahil), i<=100;
        // sayilari yan yana (print) aralarinda bir bosluk (" ") olacak sekilde yazdirin
        // System.out.print(i + " ");

        // for (int i = 50; i <=100 ; i++) {
        //     System.out.print(i + " ");//yazdırmayı for loop'un içinde yapmamızın nedeni değerler arasındaki
        // }                            //tüm sayıları yazdırın istendiği için loop her döngüde sayıları yazdırır

        // 3 basamakli sayilardan 23 ile bolunebilenleri
        // yan yana, aralarinda bir bosluk olacak sekilde yazdirin

        // for (int i=100; i<1000; i++){
        //     if (i%23==0){
        //         System.out.print(i+" ");
        //     }
        // }


        // verilen bir rakam icin carpim tablosu olusturun.day12_C07

        //int sayi = 4 ;

        /*
                1  2  3  4  ==> 1*1 1*2 1*3 1*4
                2  4  6  8  ==> 2*1 2*2 2*3 2*4
                3  6  9 12  ==> 3*1 3*2 3*3 3*4
                4  8 12 16  ==> 4*1 4*2 4*3 4*4
         */

        //kodla dikdörtgen oluşturma

        // for (int i = 1; i <=sayı ; i++) { // satirlar
        //     for (int j = 1; j <=sayı ; j++) {//sütunlar
        //         System.out.print(i*j + " ");
        //     }
        //     System.out.println("");//satırların yanyana gelmemesi için yapılır, bir alt satıra geçmek için
        //}

        // dinamik olarak verilen satir ve sutun sayisina gore
        // yildizlardan bir dikdortgen olusturun  day12_C08

        /*
         * * * * *
         * * * * *
         * * * * *
         */

       //int satirSayisi=3;
       //int sutunsayisi=5;

       //for (int i = 1; i <=satirSayisi ; i++) { // satır sayısını

       //    for (int j = 1; j <=sutunsayisi ; j++) { // sutun sayısını

       //        System.out.print("* ");
       //    }
       //    System.out.println("");// içerdeki loop bitincebir satırdaki tüm sutunlar bitince alt satıra geçiyor
       //}

        // verilen bir rakam icin carpim tablosu olusturun.day12_C07

       //int sayi = 4 ;

        /*
                1  2  3  4  ==> 1*1 1*2 1*3 1*4
                2  4  6  8  ==> 2*1 2*2 2*3 2*4
                3  6  9 12  ==> 3*1 3*2 3*3 3*4
                4  8 12 16  ==> 4*1 4*2 4*3 4*4
         */

        //kodla dikdörtgen oluşturma

       // for (int i = 1; i <=sayi ; i++) {
       //     for (int j = 1; j <=sayi ; j++) {
       //         System.out.print(i*j+" ");
//
       //     }
       //     System.out.println("");
       // }


         /*
        1  	                1. satir 1’den 1’e kadar yazdir
        1  2	            2. satir 1’den 2’e kadar yazdir
        1  2  3	            3. satir 1’den 3’e kadar yazdir
        1  2  3  4.         4. satir 1’den 4’e kadar yazdir
         */

       //int satır=6;
       //for (int i = 1; i <=satır ; i++) {
       //    for (int j = 1; j <=i ; j++) {
       //        System.out.print(j+" ");
       //    }
       //    System.out.println("");
       //}


        /*
                Verilen satir sayisina gore
                asagidaki sekli olusturan kod yaziniz

                *
                * *
                * * *
                * * * *
         */

       //int satır=6;

       //for (int i = 1; i <=satır ; i++) {// satirlar Outer Loop / dis Dongu
       //    for (int j = 1; j <=i ; j++) {// sutunlar inner Loop / ic dongu
       //        System.out.print("* ");

       //    }
       //    System.out.println("");
       //}

        /*
        asagidaki sekli olusturan kod yaziniz

           * * * * * * * *
           * * * * * *
           * * * *
           * *

         */
        int sutun=8;
        for (int i = 0; i <9 ; i++) {//sutun sayısı
            for (int j = 0; j <sutun ; j++) {//satır sayısı
                System.out.print("* ");
            }
            System.out.println("");//sutundaki eksilmeyi burada yapıyoruz, çünkü satır ve sutun sayılarında değişiklik yok
                                  // sadece sutunlarda yıldız sayısı azalıyor
            sutun-=2;
        }






    }
}

