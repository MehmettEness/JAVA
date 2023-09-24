package day16staticoop;

public class a03_StaticBlock {

    //Bir variable olusturdugunuzda deger atamazsanız o variable initiazlize etmediniz demektir.//double pi ; degeri 0 dır ama double pi =3.14; dersek vermiş oluru

   static double pi ;
    //  pi = 3.14; dersek pi kırmızı yanar neden cunku non static double ıstatic yaparsak o zaman söner

   //static{} bu static-blocktur.

    static {
        pi=3.14;
        System.out.println("static block 1");
    }
    //bazen main method calıstırılmadan önce variablelarrın hazır hale getirilmesi gerekebilir. Bu yüzden static blocklar kullanılır. Yukarıda oldugu gibi
    //static variableler static blocklar icinde initiazlize edilirse o classın içinde herseyden önce hazır hale getirlmiş olur
    //yani altta yer alan psvm calısmadan önce static block icinde yer alan pi=3.14; hazır halde bulunur

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");
        System.out.println(ci);

        /*
        sırasıyla
        static block 1
        3.14
        main method
        geldi
        biz static blockualta alsak bile yine en üstten başlayarak
        static block 1
        3.14
        main method
        çıkar
         */

//public static void main(String[] args) {
//        System.out.println(pi);
//        System.out.println("main method");
        //bu kısmı static(){} üstüne koysak bile staticblock ilk once calısır





    }
    static double ci;

    static {
        ci=3.15;
        System.out.println("static block 2 ");
    }


    }


