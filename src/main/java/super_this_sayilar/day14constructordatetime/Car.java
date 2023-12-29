package super_this_sayilar.day14constructordatetime;

//1+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public class Car {
    /*
    Constructor nedir ?
    Classtan obje olusturmamızı saglayan code bloklarıdır.Car(); Constructor dır
    Class olusturudugumuzda java bize otomatik olarak Constructor verir.
    Ama bu constructor göz ile görülmez, gözle görülmeyen otomatik olarak verilenm constructorlara default constructor denir.
    default constructor ==> Car () {}

    siz kendi constructor olusturdugunuz zaman java kendi constructor ini siler.
    COnstructor nasıl olusturulur?
    Access Modifier + Class ismi + () + {}

    Method ile Constructor arasındaki fark nedir?? (interwiev sorusu)
    1)Methodlardsa returnm type olur, constructorlarda olmaz.
    2)Metodlar yaptıklari işe göre isimlendirilir, constructorlar ise her zaman Class ismi ile isimlendirilir.
    3)Methodlar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir.
    4)Method isimleri kücük harfle baslar, consdtructor isimleri ise class ismi ile ayni oldugu için büyük harfle baslar
      Parametreli constructorlar olusturarak ayni classdan farkli özelliklere sahip objecteler olusturabiliriz
    */


    //COnstructor görünür yapmak icin

    //7+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public Car(String make, String model, int year, boolean hybrid) { //1 usage dedi bir kere kullanıldı dedi
        //bu stringleri veya diger kaliplari degistirerek istedigimizi kullanabilişriz String make , String model, int year , boolean hybrid
        this.make = make;// bu classtaki make i sana verdigim make ile degistir dedik
        this.model = model;// bu classtaki model i sana verdigim model ile degistir dedik
        this.year = year;// bu classtaki yeaar i sana verdigim year ile degistir dedik
        this.hybrid = hybrid;// bu classtaki hybrid i sana verdigim hybrid ile degistir dedik

    }

    //9+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //istediimiz gibi secenekleri olusturmak icin
    //public Car(String make , String model){
    //        this.make = make;
    //        this.model=model; orneginin kısa yolu
    // sag tıkla generate sec sonra constructor sec oradan neyi istiyorsan onları secebilirsin
    //Ve asagıda yer alan kod otomaik olarak yerleştirilir.
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    //Araba aobjemizde görmek istedigimiz varriableler olusturmalıyız

    //2+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //Variable olusturalım (pasif özellikler)


    String make = "Honda";

    String model = "Accord";

    int year = 2023;

    boolean hybrid = true;

    //method olusturalım (aktif özellikler)

    public void hareket() {
        System.out.println("Honda hızlı hareker eder");

    }

    public void dur() {
        System.out.println("Honda güvenli bir sekilde durur");
    }

    // sag tıkla generate sec sonra constructor sec oradan neyi istiyorsan onları secebilirsin
    // bu calıstırmak icin gerekli olan 6++ olanı calıstırır
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
        // biz bu kalıbı olusturdugumuzda car yazfdıgımız her yerde honca accord cıkacaktır
        // ama dinamik olması için ben bu kalıptan audi , mercedes üretmeliyim
        // bu yüzden istedigimizi verebilmesi için




