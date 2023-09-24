package day22map_exception;

public class E01 {

    //Exception
        /*
        Exception: Beklenmedik problem demektir. java çözemedigi bir sorunla karsılastıgında exception classı devreye gire.
        Exception classi bize karsılasılan sorunun cinsini ve bu sorunun nereden kaynaklandigini ve sebebini verir.
        Java exception fırlattıgında kodun calısmasını durdurur ve bizedn karark vermemmizi bekler.
        => Eger gereksinimlere göre kodumuzun calısmasına devam etmek istiyorsak try catch ile exception olusması muhtemel kodlarımızı
        try catch yazmalıyız.
        => Exceptiona uygun cozumler üretebiliriz. Bunda 2 yol vardır.
            a) Exception a uygun cozumler uretebilirsiniz. Buna Excepion Handling denir
                bunun icin try catch kullanilir, try block icinde yapilmasi istenen islemi javadan yapmasi istenir
                java islemi problemsiz bir sekilde yaparsa cathc block java tarafindan okunmaz
                try block da islem yapilirken Exception olusursa catch block devreye girir ve catch block icinde ki kodlar calisir
                try block da islem yapilirken Exception olusursa try block icindeki hata sonrasi kodlar calistirilmaz
            b) Execption olustugunda bunu ilan eder ve geri cekilirsiniz, bunada throw exception denir.

             ==> catch parantezi icindeki karsilasmamiz muhtemel olan exception class isimini ve bir obje ismini (e),
        catch block una ise exception ile karsilasilidiginda yapilmasini istedigimiz kodlari yazariz


        =>Yazdıgımız kod calısmadıgında output yazan kısımda yer alan hataya bakarız. Hataların bütününe log denir.



         */

    public static void main(String[] args) {
        bolmeIslemi(21, 0);

        bolmeIslemi2(5, 0);

    }

       public static void bolmeIslemi(int a, int b) {
        if (b == 0) {
            System.out.println("Bunu 0 a bölemezsin - if");
        } else {
            System.out.println("Devam edebilirsin");
        }

    }

    //ArithmeticException yazdıgınızda code da matematiksel islem kullanıyorsanıuz alabilieceginiz bir excaption cesididr.

    public static void bolmeIslemi2(int a, int b) { // bölme islemi yapan method olusdturralım
        try {                           //try catch bir hatayla karşılşırsan da devam et demek..Yani kod calısmaya devam eder.
            System.out.println(a / b); // buu bölme islemi yapıldıgında java hata verir. Cunku sayi 0 a bölünmez.Burada olan hataların hepsine log denir.
            //0 a böldügümüzde hata almamak icin if else kullanabiliriz ama bu kesinlikle tavsiye edilmez.Onun yerine try kullanılır.
        } catch (ArithmeticException e){ // String s deki s ne ise buradaki e de o işe yarar..veya for i deki i gibi. Bir isimlendirme geleneği
            System.out.println("Bunu 0 a bölemezsin - try/catch");
        }

    }
}
