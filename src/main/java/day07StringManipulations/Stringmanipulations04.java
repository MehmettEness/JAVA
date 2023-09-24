package day07StringManipulations;

public class Stringmanipulations04 {
    public static void main(String[] args) {


         /*  Örnek : Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin
       i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
       ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
       iii) Başında ve sonunda boşluk olmamalıdır.
       */

        String pwd = "a";

       // i) Parola Boş olmamalıdır, en az bir karakter icermelidir.

        boolean first = pwd.isEmpty(); // pwd.isEmpty() bir string tamamen bos ise hic karakter icermiyorsa true verir, aksi halkde false verir
        //System.out.println("first = " + first);

        // ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir

        //isBlank () methodu sadece space iceren stringler ici true verir, space disinda bir karakter var ise false verir.

        boolean second = pwd.isBlank();
       // System.out.println("second = " + second);

        /*
        isBlank() methodu ==> sadece space var ise ve hicbirsey yok ise true verir. bos stringler icinde true verir. isEmpty de kapsar.
        isEmpty() methodu ==> sadece hicbir sey icin true verir.

         */

        // iii) Başında ve sonunda boşluk olmamalıdır.

       boolean third = pwd.trim().equals(pwd);//equals basında ve sonunda karakteri esitlemek icin kullanırız
        // "  ali     "" durumunda karakter boşluklarına bakacagız bosluklar birbirine esit ise true degilse false verir. Biz burada false degerini alırız.
        //"ali" olursa eger true degereini alırız cunku basındaki ve sonundaki spaceler esittir.

        //System.out.println(third);

    if(first){
        System.out.println("Parola bos bırakılamaz..!"); //i sorusu icin
    }
    if(second){
        System.out.println("Parolada bosluk harici gorunur karakterler bulunmalıdır");//ii sorusu icin
    }
    if(!third){
        System.out.println("Parola basinda yada sonunda bosluk birakilmamalidir");
    }
    // sonunda pwd degeri icin degerleri karıstırarark sonuclara bak



        //memory kullanimi

        /*
          Stringlerin esitliklerini kontrol ederken "==" yerine equals kullanırız,
          cunku == sembolu kullanirsaniz, iki stringi karsilastririken hem adreslerini hem degerlerini kontrol eder.
          eger her ikiside esit ise esittir der.

          equals() methodu ise iki stringi karsılastırırken sadece degerlerine bakar, degerleri ayni ise iki string esittir der.
          degerler farkli isse bu iki string farklidir der...

        */








    }
}
