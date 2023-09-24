package day09loops;

public class DoWhileLoops01 {
    public static void main(String[] args) {

        /*while loop
       baslangıc degeri
       while(loop calısma kuralı){
       calısacak kodlar
       arttırma azaltma
       }
         */

        // do - while loop

        /*
        baslangıc degeri
        do{
            calısacak kodlar
            arttırma azaltma
        } while (loop calısma kuralı);
         */

        //ornek 5 dahil den 3 dahile kadar tam sayiları console yazınız

        int i =5;
        do {
            System.out.println(i);
            i--;
        }while (i>2);


        //----------farkları----------------------------------------------------------------------------------------------------------------

        // 1 ) while loop

        int a = 1;
        while (a<1) {
            System.out.println("Sen bir while loopsun...");
            a++;
        }



        //2 ) do-while loop

        int b =1;
        do{
            System.out.println("Sen bir do while loopsun...");
            b++;
        }while (b<1);
        // bire bir ayni kodu yazdık
        //sonuc Sen bir do while loopsun... gördük nedennn
        //while da a<1 en basta kontrol etti o yüzden hic calısmadı direk do-while calıştı .do oldugu icin denetleme olmadan direk calıstı
        // do while her zaman her kosulda calısır cunku bir nöbetcisi yok buna zero execution (hiç çalışmamak) mümkün değil

    }
}
