package javapractice;

import java.lang.reflect.GenericSignatureFormatError;

public class C01Variables {
    public static void main(String[] args) {
        int yas = 35;
        System.out.println(yas);
        int sayi=50;
        System.out.println(sayi);

        System.out.println("sayi=" + sayi);
        int benimYasim=yas;
        System.out.println("benimYasim =" + benimYasim);
        String isim = "MehmetEnes";
        System.out.println("isim= " + isim);



        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala
        String onunIsmi = isim;


        //onunIsmi variable'ını etiketiyle yazdır
        System.out.println("onunİsmi=" + onunIsmi); //onunIsim.soutv
        //isim variable'ının degerini guncelle
        isim= "eness";
        onunIsmi = "mea" ;


        //isim ve onunIsmi variable'larını yazdır
        System.out.println("isim= " + isim); // isim= eness
        System.out.println("onunIsmi =" + onunIsmi);



    }//maim method sonu

}// class sonu
