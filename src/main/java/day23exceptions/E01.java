package day23exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class E01 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src\\main\\java\\day23exceptions\\file.txt");
        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k); //Java is easy
                                        //Nothing is easy if you do not study

        }
    }
}

    //import java.io.FileInputStream;
    //import java.io.IOException;
    //
    //public class E01 {
    //    public static void main(String[] args) throws IOException {
    //
    //        /*
    //        1) Run Button'a bastıktan sonra console da alınan Exceptionlara Runtime Exception denir.
    //            AritmeticException , NullpointerException vs...
    //            RunTime Exceptionlara Unchecked Exception da denir.
    //
    //         2) Code yyazarken kırmızı alt cizgi seklinde alınan Exceptionlarda vardır.
    //         Bunlarada Compile Time Exception denir. Compile Time Exception lara Checked Exception da denir.
    //
    //         interview sorusu
    //
    //         throw ile throws arasindaki farklar nelerdir?
    //        1) throw method bodysi icinde, throws ise method parantezinden sonra kullanilir
    //        2) throw method bodysi icinde istenilen yerde istenildigi kadar kullanilabilir
    //           throws ise method signature dan hemen sonra ve sadece bir kere kullanilabilir
    //        3) throw dan sonra new keywordu ve constructor kullanarak object olusturulur
    //           throws dan sonra ise sadece Exception class ismi yazilir
    //        4) throw belli sartlar icin Exception firlatmada kullanilir
    //            throws ise bir methodun belli bir Exception u firlatabileceğini belirtmek icin kullanilir
    //         */
    //
    //        //yazacagımız kod ile file la ulaşmamız lazım bunu FileInputStream ulasırız
    //        FileInputStream fis = new FileInputStream("day23exceptions/file.txt");
    //        // ("day23exceptions/file.txt") icin =class üzerinde file.txt sağ tıkla Copy path/reference çıkıyor
    //        // onda en alttakini alacaksın sectigind kapatıp otomatik kayıt eder sonra () icine String acıp ctrl+v ile yapıştır
    //        //FileInputStream altta kırmızı yanar üzerine geldigimizde more actions sectigimiz de ve ilkdekine tıkladıgımızda..
    //        //    public static void main(String[] args) throws FileNotFoundException { bu gelir ve bunun yanına istedigimiz kadar virgül koyarak exception yazabiliriz.
    //
    //        int k = 0;
    //        while ((k = fis.read())!= -1) { // file deki yazının ascii degerlerini alıyor ve -1 esit degilse calısmaya devam et diyor
    //            System.out.print((char) k);
    //            //read kısmı kırmızı yanıyor. Bunu gecmesi icin yine üstüne gelip more action tıklarız. sonra yine ilk secenegi sectigimizde..
    //            //    public static void main(String[] args) throws FileNotFoundException { degiserekk    public static void main(String[] args) throws IOException {
    //            //olarak degisir. Boyle olunca read normale döner
    //        }
    //
    //    }
    //}
