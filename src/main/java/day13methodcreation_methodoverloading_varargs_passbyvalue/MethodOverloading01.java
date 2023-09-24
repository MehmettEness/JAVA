package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {

        //MethodOverloading01=aşırı yükleme yani aynı isme bireden fazla iş yüklemek diyebiliriz
        //Javada ayni isimde farkli iişler yapabilen methodlar oluşturmak demek
        //s.dedigimizde karsımıza birçok deger çıkıyor java bunlaari kolaylastırmak icin tek isimle bir çok işleme çıkarma yapılıyor


//ikinci burayi yazdik
    add(3.5 , 5.4);    //add yazdıgımızda karsımıza birkaç tane method çıktı. Java dediki hangisini seceyim
    }
//ilk burayı yazdık
    public  static void add(int a , int b){//java bunu secti çünkü verdigimiz degerlerin her ikiside int oldugu için
        System.out.println(a + b);
    }
    public  static void add(double a , double b){
        System.out.println(a+b);
    }
    public  static void add(double a , int b){
        System.out.println(a + b);
    }
    public  static void add(int a , double b){
        System.out.println(a + b);
    }
    public  static void add(int a , int b ,int c){
        System.out.println(a+b+c);
    }
    //add(int a , int b) / add(double a , double b) bunlar isim + parametre dir bunlara "method signature" denir Yani method imzası
    /*
    1) Method Overloading yaparken method ismi degistirilmez
    2) Method Overloading yaparken parametreler degistirilir.
        a)Parametre degistirilirken parametrelerin data typeleri degistirilebilir
        b)Parametre degistirilirken parametrelerin data typeleri farklı ise yer degistirebiliryani a ve b nin yerleri degistirilemez
        c)Parametre degistirilirken parametrelerin sayisi degistirilebilir.
    3) Java icin ismi ve parametreleri ayni olan iki method tamamıyle aynıdır
        Bu yüzden ismi veparametre Method Signature olarak adlandırılır.
    4)Method Overloading olusturulurken return type degistirmenin hicbir etkisi yoktur
    5)Method Overloading olusturulurken access modifier degistirmenin hicbir etkisi yoktur
    6)Method Overloading olusturulurken static ve non-static yapmanın degistirmenin hicbir etkisi yoktur
    Static ay üzerindeki degisiklik diyebiliriz ve herkes tarafından görülebilir. Non-static ise dünyada herhangi bir insan üzerindeki yapılan degisiklik herkes tarafından görünmez
    7)Method Overloading olusturulurken body degistirmenin hicbir etkisi yoktur
    8)Private methosdlar overload edilebilir
    private olmak baska classlara gidildiginde problem olur, biz overloading ayni classta yapabiliriz. yani public degistir yerine private yaz olurrr.
    9)Static methodlar overload edilebilir
    Overloading yapmak icin ismini degistirmeden method signature degistirirz. Dolayısıyla method signature degistirildiginde
    yeni bir method olusturmus oluruz bu nedenle static olmasi bir seyi degistirmez


     */
}

