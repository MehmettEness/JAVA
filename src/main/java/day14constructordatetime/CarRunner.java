package day14constructordatetime;

public class CarRunner {

    //3+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static void main(String[] args) {

        //Car kalibindan obje olusturacagız
        //Scanner scan = new Scanner(System.in) ; gibii

        //4++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
       // Car c1=new Car(); diyip sout.c1.make falan bu alttaki degerleri yazdırırsak
       // verdigimiz degerler karsımıza gelir.

        //6+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        Car c1= new Car("BMW","M4",2023,false);
        Car c2= new Car("AUDİ" ,"R8" ,2023,true);
        Car c3= new Car("MERCEDES", "EQS", 2023,true );

        //5++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        System.out.println(c1.make);//c1. dedeigimizde bizim olusturduklarımız cıkıyor
//honda
        System.out.println(c1.model);
//accord
        System.out.println(c1.year);
//2023
        c1.hareket();//Honda hızlı hareker eder
        c1.dur(); //Honda güvenli bir sekilde durur

       //8+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

       //10+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        Car c4 = new Car("Mercedes" , "a180");
        System.out.println(c4);
        //Java 10 gördügü kodu gitti 9 da olan veriye işledi.
        //biz sadece make ve model girmek istedik bunu kullanabiliriz 1 usage yazdı
    }
}
