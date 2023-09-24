package day06switchternarystring;

public class Ternary01 { // Ternary nedir: verilen degerleri yazdıkca ortaya cıkan değişkenmlere bakarız true false
    public static void main(String[] args) {

        //Ornek:Bir sayinin mutlak degerini hesaplayan kod yaziniz.

        //      -4=-1*-4            3=3             0=0

        int c = 4;
        //condition ? true : false ;

        //c<0 ? -1*c : c ; mutlak deger tanımı

        int result = c < 0 ? -1 * c : c; // -4 degerini ele alallım bu deger -1*c ile olmalı ilki true digeri false ona bakıcaz
        System.out.println(result);

        //Ornek: Iki sayinin isareti ayni ise bu sayilari carpan,

        //isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"

        // mesaji veren kodu yaziniz.

        int a =3;
        int b = 13;
        //condition ? ilk çıktı : ikinci çıkti ;

        //(a>0 && b>0)   ||     (a<0 && b<0)   ?  a*b : "Farkli isaretli sayilari carpamiyorum";

        //String result2 = (a>0 && b>0)   ||     (a<0 && b<0)   ?  a * b : "Farkli isaretli sayilari carpamiyorum";

        //int result2 = (a>0 && b>0)   ||     (a<0 && b<0)   ?  a * b : "Farkli isaretli sayilari carpamiyorum";

        //burada string yazarsak a*b kırmızı yanar int yaparsak yazı kırmızı yanar burada ortak pay olan ve en üst olan "Object kullanmak zorundayız

        // Object kullanırsak kıröızı yanmaz



        Object result2 = (a>0 && b>0)   ||     (a<0 && b<0)   ?  a * b : "Farkli isaretli sayilari carpamiyorum";
        System.out.println(result2);

        //interview question
        /*    Example 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
                       1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
                       2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
         */

        //neasted ternary ile cözecegiz

        int year =1600;

        //c ? t(true) : f(false) ; bu kalıp degerimiz

        //year%100==0 ? c ? t : f ;// true false degerimiz için öncelikle degere bakıp önce true degerine sonra false bakıyoruz
        //true ise falsde ye bakmıyoruz zatenn.

        String result3 = year % 100 == 0 ? year % 400 == 0 ? "Leap" : "Not Leap" : year % 4 == 0 ? "Leap" : "Not Leap";

        System.out.println(result3);




    }
}
