package day03wrapperconcatenationoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //input=girdi
        // NOT:
// scanner class ı kullanıcı ile etkileşim kurmamızı sağlar
//Scanner bir Class tır. Java util kütüphanesinden getirildiği için import ister

        //1.adim : Scanner01 class tan object olustur
        Scanner scan = new Scanner(System.in);
        //yukarıya import java.util.Scanner; bu kod geldi bu javanın util kütüphanesinden import ettim diyor




        //2.adım : Kullanıcaya ne istediginize dair mesaj veriniz

        System.out.println("Lutfen yasinizi giriniz");

        //3. adim : uygun methodu kullanarak kullanicinin verdigi data yi memorye yerlestiriniz
        //inputtan sonra . koyunca bize mainler verecek nextByte sececez buradan yas degerini alacak
        //byte degerini yazacagız çünkü yas degerleri belirlidir ve mantıklıdır. byte age = input.nextByte(); yazarız.

        byte age = scan.nextByte();
        //kodu sout ile çalıştırdıktan sonra altta yazı çıkar ve bize yaş degeri girmemizi ister. App bizden yas girmemizi istiyor
        // Yani kullanıcının vermiş olduğu degeri karsımıza çıkarır.

        System.out.println(age);
    }

}
