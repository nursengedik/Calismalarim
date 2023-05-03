package agaın14_day14;

public class C08_AsalSayıYazdırTekrar {

    public static void main(String[] args) {

        // Verilen 1'den buyuk pozitif bir tamsayinin
        // asal sayi olup olmadigini yazdiran bir method olusturun

      asalSayıYazdır(43);
      asalSayıYazdır(51);
      asalSayıYazdır(12);
    }

    public  static void asalSayıYazdır (int sayı){

        int flag = 0;
        for (int i = 2; i <sayı ; i++) {
            if (sayı%i==0){
                flag++;
                break;
            }
        }

        if (sayı==0){
            System.out.println("Girilen 2 sayısı ASAL bir sayıdır");
        } else if (flag==0) {
            System.out.println("Girilen sayı " + sayı + " sayısı ASAL bir sayıdır");
        }else {
            System.out.println("Girilen sayı "+ sayı + " sayısı ASAL bir sayı değildir");
        }

    }

}
