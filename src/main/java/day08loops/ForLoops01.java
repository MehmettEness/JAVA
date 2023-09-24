package day08loops;

public class ForLoops01 {
    public static void main(String[] args) {

        //Ornek: Ekrana 5 kere "Hi" yazdır

        //1.yol
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.yol
        //loop :döngü demektir 4 tanedir. tekrar eden kodlarda kullanırız

        /*
        for ( Baslangıc deger ; Loopun calısma sartı ; artirma azaltma ) {
            tekrarli bir sekilde yazmak istedigimiz kodlar
        }
        */

      //for ( Baslangıc deger ; Loopun calısma sartı ; artirma azaltma )
        for (       int i=1   ;         i<6          ;      i++        ) {
            //int i=1 (baslangıc degerim)  ;i<6 (i degerim 6 dan kücük olsun;i++ (arttırarak yaz)

            System.out.println("Hi..");
        }


        //Example 2: 11'den 14'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for(int i=11; i <15 ; i++){

            System.out.println(i);

        }


        //Example 3 : 40 dan 23 e kadar tüm cift sayilari ekrana yazdir

        for(int i=40; i>22 ; i-- ){

            if(i%2==0) {

                System.out.println(i);
            }

        }
    }
}
