package interview;

import java.io.FileInputStream;
import java.io.IOException;

public class a_15Exception {
   /*
    interview sorusu
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


    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\main\\java\\interview\\enes.txt");

        int k =0;
        while ((k=fis.read())!=-1){
            System.out.print((char)k);

        }
        System.out.println();
        int o =12;
        int p =0;
        int u [] ={3,5,7,9};
        NumberFromIntArray(u,o,p);


    }
    public static void NumberFromIntArray (int[]u , int o, int p){


        try {
            int cdx =o/p;
            int element= u[cdx];
            System.out.println(element);
        } catch (ArithmeticException e) {
            String message = e.getMessage();
            System.out.println("Sıfıra bölemezsin");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Devam ett");
        }

    }
}
