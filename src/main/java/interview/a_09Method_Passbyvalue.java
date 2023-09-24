package interview;

public class a_09Method_Passbyvalue {
    public static void main(String[] args) {

        int sonuc= toplamaYap(15,10);
        System.out.println(sonuc);

        print("enes");

        int x = 3;
        int y = 5;
        add(x,y); // altta add de a ve b var ama biz x ve y yazdık. Burada java kopyasını yazar ve degerleri 3 ve 5 yazmış olur.
        System.out.println();


        int result = toplama(5,6,7,8);
        System.out.println(result);

    }
    public static int toplamaYap (int a , int b){
        return a+b;
    }
    private static void print (String str){
        System.out.println(str);
    }


    public static int add(int a, int b) {
        return a+b;
    }

    public static int toplama(int...a){
        int sum =0;
        for   ( int w : a ) {
            sum = sum+w;
        }
        return sum;
    }
     /*
    Pass By Value :
        1) Java Pass By Value kullanir
        2) Yani java methodlarin orjinal degeri degistirmesine müsade etmez
        3) java methodlara deger yollarken orjinal degerin kopyasini olusturur, ve o kopyayi methoda yollar
        Method kopya deger üzerinde degisiklik yapar, böylece orjinal deger korunmus olur

    Pass By Reference:
        1) Pass by Reference da method a reference yollanir
        2) Reference adres demektir. Adress yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir
     */
}

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