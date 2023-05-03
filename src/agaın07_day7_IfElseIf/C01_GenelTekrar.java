package agaın07_day7_IfElseIf;

public class C01_GenelTekrar {

    public static void main(String[] args) {

        // char data turundeki degerler, sayisal islemlerde kullanilabilir
        // bir char matemetiksel islemde kullanilirsa ASCII table'daki degeri ile isleme girer

        System.out.println('k' + 1);//108 yazdırır

        // eger bu islemin char olarak degerini yazdirmak istersek (yani harfi yazdırmak istersek)
        // sayisal degerler char'a cast edilebilir

        System.out.println( (char)('k'+1) ); // l


        String str= "112";

        System.out.println(str);//112 yazdırır

        // bu degere 10 ekleyin
        System.out.println(str+10);//11210 yazdırır, çünkü str Stringdir, string bir ifade yanına + ile gelen
                                  //değerle toplama işlemi yapmaz, kendisiyle birleştirir
         //Stringdeki değerle 10 nu toplayabilmek için stringi int e cast etmeliyiz
        // int sonuc= (int)str;//bu şekilde değil, primitive data turlerinin hazir method'lari yoktur
        // Java primitive data turleri icin, kolayca gecis yapabilecekleri
        // non-primitive data turleri olusturmustur
        //int ==> Integer
        //char ==> Character
        //byte ==> Byte
        //boolean ==> Boolean

        //bu durumda Wrapper class'lar imdada yetisir

        int sonuc=Integer.parseInt(str);//int'ra cast ederiz
        System.out.println(sonuc+10);//122 yazdırdı

        String str5= "112";//str5 in 2 katını almak istiyorum
        //önce str5 i int'ra cast ederim
        int snc=Integer.parseInt(str5);
        System.out.println(snc*2);

       //short'ta da cast edilebilir
       short sonc=Short.parseShort(str5);
        System.out.println(sonc*2);

    }
}
