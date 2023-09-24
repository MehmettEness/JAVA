package day22map_exception;

public class E03 {
    public static void main(String[] args) {
    String s ="Java";    // String icinden bir karakter al yazdır yapmak icin method olusturacagız

     stringdenKarakterAl(s,2); //v

     stringdenKarakterAl(s,4);//Hata alırız (StringIndexOutOfBoundsException)
    }

    public static void stringdenKarakterAl(String s , int idx) {
    //try / catch yazmanın kısa yolu ctrl + alt + T
    //İkinci yol yukarıda kod kısmında surround with var onu secebilirsin.

        try {
            char ch =s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan index kullanma hatası aldınız.." + e.getMessage());//Olmayan index kullanma hatası aldınızIndex 4 out of bounds for length 4
            System.out.println(e.getCause());//null
            e.printStackTrace();// output da çıkan tüm hatalari görürüz.
            System.out.println("printStackTrace sonrası kod calısmaya devam eder..");

        }

    }


}
