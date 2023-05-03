package agaın13_day13;

public class C05_StringiTerseÇevirme {

    public static void main(String[] args) {

        // Verilen bir String'i tersine cevirip
        // bize donduren bir method olusturun

        System.out.println(stringTersineÇevir("Java Candir"));   //birçok kez çağırma işlemi yapılabilir ve
        System.out.println(stringTersineÇevir("Anlasildi mi?"));//bunun sonucunda birçok kez sonuç
        System.out.println(stringTersineÇevir("Soyle Omer"));  //yazdırır.


    }

    public static String stringTersineÇevir(String metin) {// parantezin içine
                                                           // methoda çevirmesi için bir şey verilecekse
                                                           //o yazılır
        String tersMetin = "";

        for (int i=metin.length()-1 ; i >=0 ; i--){

            tersMetin+=metin.charAt(i);

        }

        return tersMetin;

   }
}
