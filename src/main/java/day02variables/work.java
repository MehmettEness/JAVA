package day02variables;

public class work {

    public static void main(String[] args) {

        //Variable nasıl olusturulur
        // Data Type + Variable name + Assignment Operator(Atama operatoru) + Variable Degeri + noktali virgul
        int age = 15;
        System.out.println(age);
        /* Javata iki tip data vardır
        1 primitive
        char int byte boolean float double short long
        char 2 byte yer kaplar. tek olanlarda kullanılır ve tek tırnak içerşisinde yer alır.
         */
        char isminIlkharfi = 'm';
        System.out.println("isminIlkharfi = " + isminIlkharfi);

        //boolean 1 byte yer kaplar. Sadece true veya false verir.
        boolean yasin20mimi= false;
        System.out.println("yasin20mimi = " + yasin20mimi);

        //byte 1 byte yer kaplar -128 / +127 arasında deger alır
        byte binaNufusu= 87;
        System.out.println("binaNufusu = " + binaNufusu);

        //short 2 byte yer kaplar. -32768 / +32767 deger alır
        short koyNufusu = 1651;
        System.out.println("koyNufusu = " + koyNufusu);

        //int 4 byte yer kaplar -2147483648 ile 2147483647 arası deger alır
        int ilceNufusu = 1564646165;
        System.out.println("ilceNufusu = " + ilceNufusu);

        //long 8 byte yer kaplar.     -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807  deger alır
        long cellnumberinHumanBody = 681546541956419L;
        System.out.println("cellnumberinHumanBody = " + cellnumberinHumanBody);

        //float 4 byte yer kaplar. virgüllü sayilar icin kullanılır
        float gomlekFiyati = 119.90f;
        System.out.println("gomlekFiyati = " + gomlekFiyati);

        //double 8 byte yer kaplar. vigülden sonraki icin kullanılır.

        double weigtcell = 0.000000000000000000000000000000000001;
        System.out.println("weigtcell = " + weigtcell);


        /*
        char 2 byte yer kaplar tek tırnak arasına yazilir.
        boolean 1 byte yer kaplar true veya false verir.
        byte 1 byte yer kaplar -128 / +127 arası deger verir.
        short 2 byte yer kaplar -3276/ / +32767 arasıde yer kaplar
        int 4 byte yer kaplar -6545265 /+6542984168 yer kaplar
        long 8 byte yer kaplar sonuna L gelir
        float 4 byte yer kaplar. virgüllü sayilar icindir sonuna f gelir
        double. o dan sonrasi için deger alır
         */

        //Ornek 9: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.

        String ogernciAdi = "Ali Can";
        System.out.println("ogernciAdi = " + ogernciAdi);
       /* primitive ve non primitive data type arasındaki farklar nelerdir?
                1) primitiveler sadece bizim atadagimiz degeri içerir.
        non-primitiveler bizim atadaığımız degeri içerir ve fazladan methodlar icerir.

        2)primitiveler kücük harfle baslar. non-primitiveler büyük harfle baslar

        3)primitiveleri java üretmistir ve 8 tanedir. non-primitiveleri java ve programcilar üretebilir dolayısı ile sinirsiz sayidadir

        4) primitiveler memoryde data typeleerina göre sabit boyutta bellek kullanirlar
        non-primitiveler  memoryde büyüklügüne göre degisen boyutlarda bellek kullanabilirler.

                */
        //Ogrenci notlari icin iki adet variable olusturun ve toplamlarini ekrana yazdirin.

        byte not1 = 67;
        byte not2 = 55;
        System.out.println(not1+not2);


    }

}












