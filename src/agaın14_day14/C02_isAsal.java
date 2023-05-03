package agaın14_day14;

public class C02_isAsal {

    public static void main(String[] args) {

        // Verilen 1'den buyuk bir tamsayi icin
        // sayi asal ise true
        // sayi asal degil ise false dönen bir method olusturun

        //isAsal(20);kod çalışır ekranda bir şey yazdırmaz.Soruda döndürün denildiği için isAsal ya yazdırılır
        //veya atama yapılır

        System.out.println(isAsal(20)); // false
        System.out.println(isAsal(43)); // true


        boolean sonuc = isAsal(57); // sonuc variable'ina false degeri atar
        //System.out.println("sonuç: "+sonuc);//yazdırırsak false görürüz
    }

    public static boolean isAsal(int sayı){//dönen sonuç true veya false olacağı için data türü boolean yazılır
        int flag=0;

        for (int i = 2; i <sayı ; i++) {

            if(sayı % i == 0){
                flag++;
                break;
            }
        }

        if (sayı == 2){    //soruda döndürün denildiği için burada yazdırma yapılmaz, main methodda yapılır
            return true;
        }else if (flag==0){
            return true;
        }else {
            return false;

        }
    }





    }

