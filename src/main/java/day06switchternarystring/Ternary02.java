package day06switchternarystring;

public class Ternary02 {
    public static void main(String[] args) {

        //Example : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.

        int a =-153;

        //Math: Matematiksel işlemlerle alakalı java buraya class oluşturmuş. -153 yazabiliriz bunun öutlak degerini almalıyız

        //Math.abs() abs mutlak deger demek

       //a=  Math.abs(a); böyle yaptıgımızda a degerini mutlak degerini almis oluruz

        a=Math.abs(a);

        //a>99 && a<1000
        String result = a>99 && a<1000 ? "uc basamaklıdır"  :   "uc basamaklı degildir" ;

        System.out.println(result);






    }
}
