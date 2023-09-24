package day09loops;

public class WhileLoop01 {
    public static void main(String[] args) {

        /*forloop (baslangıc degeri  ; loop calısma kuralı ; arttırma azaltma) */

        /*while loop
       baslangıc degeri
       while(loop calısma kuralı){
       calısacak kodlar
       arttırma azaltma
       }
         */

        //Example 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz
        //1.yol
        for (int i = 3; i < 7; i++) {
            System.out.println(i);

        }

        //2.yol while loop

        int i =3;

        while(i < 7) { // while : iken , oldugu müddetcee
            System.out.println(i);
            i++;

        }

        //Example 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz

        int k = 23 ;
        while(k>11){

            if(k%2==0)//böyle yaparak cift sayilari almış olduk
            System.out.println(k);
            k--;// k yı azaltarak git
        }






        }

    }

