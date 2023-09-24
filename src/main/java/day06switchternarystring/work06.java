package day06switchternarystring;

import java.util.Scanner;

public class work06 {
    public static void main(String[] args) {

        String gunAdi = "sAli";
        switch (gunAdi.toLowerCase()) {
            case "pazartesi":
                System.out.println("1");
                break;
            case "sali":
                System.out.println("2");
                break;
            case "carsamba":
                System.out.println("3");
                break;
            case "persembe":
                System.out.println("4");
                break;
            case "cuma":
                System.out.println("5");
                break;
            case "cumartesi":
                System.out.println("6");
                break;
            case "pazar":
                System.out.println("7");
                break;


            //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
            //           yazdiran kodu yaziniz.
            //           8 ==> August - September - October - November - December

        }
            Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ay için bir numara giriniz");
        byte ay = scan.nextByte();

        switch (ay){
            case 1 :
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4 :
                System.out.println("nisan");
                break;
            case 5 :
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7 :
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralik");
                break;
            default:
                System.out.println("Yanlıs deger girdiniz Lütfen 1 ile 12 arasında deger giriniz");


        }

            //Ornek:Bir sayinin mutlak degerini hesaplayan kod yaziniz.

            //      -4=-1*-4            3=3             0=0

        //condition
         int a =-5;
        int mutlak = a>0 ? a : -1*a;
        System.out.println(mutlak);

        int b = -3;
        int deger1 = b>0 ? b : -1*b ;
        System.out.println(deger1);

        int c = -2;
        int deger2 = c<0 ? -1*c : c ;
        System.out.println(deger2);

        //Ornek: Iki sayinin isareti ayni ise bu sayilari carpin,

        //isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"

        // mesaji veren kodu yaziniz.

        int m= -15;
        int n= 10;
        Object degerr = (m>0 && n>0) || (m<0 && n<0) ? m*n : "Farkli isaretli sayilari carpamıyorumm"  ;
        System.out.println(degerr);

        int q =20;
        int w = 10;
        Object sayi1 = (q<0 && w<0) || (q>0 && w>0) ? q*w : "Farkli isaretli sayilari carpamiyorum" ;
        System.out.println(sayi1);

        //Example : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.

        int t = 546;
        t = Math.abs(t);
        String deger = (t>99 && t<1000) ? "üc basamakli " : "üc basamakli degil";
        System.out.println(deger);


    }

}
