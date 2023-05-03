package agaın12_day12_forloop;

import java.util.Scanner;

public class C03_Tekrar {

    public static void main(String[] args) {

        //Soru 1- 1’den 100’e kadar
        //        sayilari ayni satirda
        //        aralarinda bir bosluk birakarak yazdirin.

        //for (int i = 1; i <100 ; i++) {
        //    System.out.print(i + " ");
        //}

        //Soru 2- Kullanicidan pozitif bir tamsayi alin,
        //        1’den girilen sayiya kadar(girilen sayi dahil)  (for oluşturulacak)
        //        7 ile bolunebilen sayilari yazdirin.(bölünüyorsa)  (if oluşturulacak)

        //Scanner scan=new Scanner(System.in);
        //System.out.println("Lütfen pozitif bir tamsayı giriniz");
        //int girilenSayı=scan.nextInt();


        //for (int i = 1; i <=girilenSayı ; i++) {
        //    if (i%7==0){
        //        System.out.print(i+" ");//şart sağlandıkça sayı yazılacağı için print i if içerisine yazdık
        //    }
        //}

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.(toplam +=i;)
        //        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


        // Scanner scan =new Scanner(System.in);
        // System.out.println("Lütfen baslangic ve bitis degeri olarak pozitif sayilar giriniz");
        // int baslangıc=scan.nextInt();
        // int bıtıs=scan.nextInt();
//
        // int toplam=0;
//
        // if (bıtıs<baslangıc){
        //     System.out.println("Yanlış bir değer girdiniz");
//
        // }else {
        //     for (int i = baslangıc; i <=bıtıs ; i++) {
        //         toplam+=i;
//
        //     }
        // }
        // System.out.println("Sayıların toplamı : "+toplam);


        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucuk olsa da program calissin (yani for oluşturulacak)


        // Scanner scan =new Scanner(System.in);
        // System.out.println("Lütfen baslangic ve bitis degeri olarak pozitif sayilar giriniz");
        // int baslangıc=scan.nextInt();
        // int bıtıs=scan.nextInt();
//
        // int toplam=0;

        // if (bıtıs<baslangıc){//baslangic degeri bitis degerinden büyükse
        //    for (int i = baslangıc; i <=bıtıs; i++) {
        //        toplam+=i;

        //     }

        // }else {//baslangic degeri bitis degerinden küçükse

        //   for (int i = baslangıc; i >= bıtıs; i--) {
        //       toplam+= i;

        //     }

        //     System.out.println("Sayilarin toplami : " + toplam);

        //  }


        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.

        // Scanner scan=new Scanner(System.in);
        // System.out.println("Lütfen 20 den küçük bir tamsayı giriniz");
        // int sayı=scan.nextInt();
//
        // int faktoryel=1;        //ör: 4!=4*3*2*1=24
//
        // for (int i = sayı; i >=1 ; i--) {
        //     faktoryel*=i;
        // }
        // System.out.println(sayı+"!= "+faktoryel);


        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        //       bu sayinin faktoryel degerini hesaplayin.
        //       Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	     Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720


        //Scanner scan=new Scanner(System.in);
        //System.out.println("Lütfen 20 den küçük bir tamsayı giriniz");
        //int sayı=scan.nextInt();

        //int faktoryel=1;

        //System.out.print(sayı+"!= ");
        //for (int i = sayı; i >=1 ; i--) {
        //    faktoryel*=i;//bu işlemden sonra bulunan faktoryeller kontrol edilir

        //    if (i!=1){    //i 1 e eşit değilse
        //        System.out.print(i + " * ");// i 1 e eşit değilse i nin her değerinde yanına * koy demektir
        //    }else{
        //        System.out.print(i + " ");//1 e eşit se boşluk koy
        //    }
        //}

        //System.out.println("= " + faktoryel);


        //Soru 7- Kullanıcıdan pozitif bir tamsayı alıp, rakamlar toplamını yazdırın (şart yok, yani if yok)
        //        day15-C02 de çözümü var


        //Scanner scan =new Scanner(System.in);
        //System.out.println("Lütfen pozitif bir tamsayı giriniz");
        //int sayı=scan.nextInt();
        //
        //int birlerBasamagı=0;
        //int rakamlarToplamı=0;
        //
        //int basamakSayısı=(sayı+"").length();


        //for (int i =1 ; i <=basamakSayısı ; i++) {

        //    birlerBasamagı=sayı%10;
        //    rakamlarToplamı+=birlerBasamagı;
        //    sayı/=10;

        //}
        //System.out.println(rakamlarToplamı);


        //Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
        //                    tamsayilari yazdirin, sira
        //                    - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //                    - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        //                    - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
        //                     yazdirin


       //Scanner scan = new Scanner(System.in);
       //System.out.println("Lütfen pozitif bir tamsayı giriniz");
       //int sayı = scan.nextInt();

       //for (int i = 1; i <= sayı; i++) {//3 v3 5 i sayıya bölersek girilen sayıyı yazdırır, i ye bölmeli
       //    if (i%3==0 && i%5==0){//sayıların her birinin 3 e ve 5 e bölünüp bölünmediğine bakılacağı için
       //        System.out.print(" fizzBuzz ");   //i macılıs denir
       //    } else if (i % 3 == 0) {
       //        System.out.print(" fizz ");
       //    }else if (i%5==0){
       //        System.out.print(" buzz ");
       //    }else {
       //        System.out.print(i+", ");//şartı sağlayan sayılar yazdırılır
       //    }
       //}//9 girdiğimizde ekranda
        //1, 2,  fizz 4,  buzz  fizz 7, 8,  fizz ===> yazı ile sayı arasında boşluk olması için çift tırnak
        //içine yazılan yazının başında ve sonunda boşluk bırakılır


        //Soru 9 (interview)- Kullanicidan bir String isteyin
        //                    ve String’i tersden yazdırın


        //Scanner scan=new Scanner(System.in);
        //System.out.println("Lütfen bir kelime giriniz");
        //String kelime=scan.next();
        //String terstenKelime="";




        //Soru 10 (interview)- Kullanicidan bir String isteyin
        //                     ve String’i tersine çevirip kaydedin


       //Scanner scan=new Scanner(System.in);
       //System.out.println("Lütfen bir kelime giriniz");
       //String kelime=scan.next();
       //String terstenKelime="";

       //for (int i = kelime.length()-1; i >=0 ; i--) {

       //    terstenKelime+=kelime.charAt(i);
       //}
       //System.out.println(terstenKelime);



        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        //         kontrol edin ve sonucu yazdirin. day14_C01'de çözümü var

       //Scanner scan=new Scanner(System.in);
       //System.out.println("Lütfen pozitif bir tamsayı giriniz");
       //int sayı=scan.nextInt();

       //int flag=0;//girilen sayıya bölünen sayıları tutar
       //
       //for (int i = 2; i <sayı ; i++) {
       //    if (sayı%i==0){
       //        flag++;
       //        break;
       //    }
       //}
       //
       ////daha sonra flag'ın durumlarını  yazdırırız
       //
       //if (sayı==2){
       //    System.out.println("Girilen 2 sayisi ASAL bir sayidir");
       //} else if (flag==0) {
       //    System.out.println("Girilen " + sayı + " sayisi ASAL bir sayidir");
       //}else {
       //    System.out.println("Girilen " + sayı + " sayisi ASAL bir sayi degildir");
       //}

        //Verilen bir pozitif tamsayının pozitif tam bölenlerini yazdırırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayı=scan.nextInt();


        if (sayı<=0){
            System.out.println("Yanlış giriş");
        }else {
            for (int i = 1; i <=sayı ; i++) {//sayıya bölünen sayıları bulacağız
                if (sayı%i==0){
                    System.out.print(i+" ");
                }

            }
        }


    }
}
