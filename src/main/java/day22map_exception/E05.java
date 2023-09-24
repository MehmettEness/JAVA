package day22map_exception;

public class E05 {
    public static void main(String[] args) {
        int a =12;
        int b =1;
        String s = "My Java";
        getCharFromString(s,a,b);


    }

    public static void getCharFromString(String s , int a , int b){

        try {
            int idx=a/b;

            char ch =s.charAt(idx);

            System.out.println(ch);//12/4=3  s.charAt(3) J ye denk gelir.
        } catch (ArithmeticException e) {
            System.out.println("Bunu 0 a bölemezsin");

        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandınız");
        }

// 2 catch kullandık bunun nedeni int ve char lardan olusur hata alma ihitilamiz var. Yani int degeri 0 gelebilir veya char degerine rakam gelebilir
        //ama biz dedik k sen devam et ben o hataları hallederim

        /*
        try kısmında birden fazla exception olusturma ihtimali olan kod varsa coklu catch kullanabilirisiniz.
        Coklu catch kullandıgınızda Exception classlar arasında parent-child iliskisi yoksa catchlerin sırası önemli degildir
        Ama koddaki sıralamaya uymak tavsiye edilir.
        Coklu catch kullandıgınızda exception classlar arasında parent-child iliskisi varsa catclerin sirasi önemli hale gelir
        ve child olan class önemli hale gelir...
         */


    }


}
