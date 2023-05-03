package agaın16_day16_arrays;

public class C06_Syf90_Soru6 {

    public static void main(String[] args) {


         /*
          Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
                  olusturun.
         */

        String [] str={"Java", "Merhaba", "Hello", "Istanbul","Hava","Kırşehir"};
        
        enUzunEnKısaYazdır(str);

    }

    private static void enUzunEnKısaYazdır(String [] str) {

        String enUzun=str[0];//str'nin elemanlarını enUzunla kıyaslayacağız
        String enKısa=str[0];

        for (int i = 0; i < str.length ; i++) {//arrays'in tüm elementlerini fr loop ile elden geçirebiliriz

            if(str[i].length()>=enUzun.length()){//str'nin i'inci elemanın uzunluğu enUzun verilen kelimenin
                enUzun=str[i];                  //uzunluğundan büyükse enUzun'na ata
            }

            if(str[i].length()<=enKısa.length()){//= denilince aynı uzunlukta iki kelime olsa da en sondakini alır
                enKısa=str[i];                  //= kullanmayınca ilkini yazdırır
            }
        }

        System.out.println("Array'deki en uzun kelime : " + enUzun);
        System.out.println("Array'deki en kisa kelime : " + enKısa);
    }

     /*
      private static void enUzunEnKısaYazdır(String [] str) {

        String enUzun=str[0];
        String enKısa=str[0];

       for( String each:str
        ){
        if(each.length()>=enUzun.length()){
           enUzun=each;
        }
        if(each.length()<=enUzun.length()){
           enKısa=each;
        }
        System.out.println("Array'deki en uzun kelime : " + enUzun+\n"Array'deki en kisa kelime : " + enKısa);

    */

}
