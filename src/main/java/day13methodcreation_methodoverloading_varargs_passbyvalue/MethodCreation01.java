package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class MethodCreation01 {
    public static void main(String[] args) {

        int carpmaSonuc = multiply(3,5); // (a:3 , b:5) arguments (argümanlar ) denir
        System.out.println(carpmaSonuc);

        //ornek 2 icin
        System.out.println(carpTopla(5, 3, 2)); // carpTopla(5, 3, 2).sout yaparsak direk yazar

        //ornek 3 icin
        print("Mehmet Enes"); // String sepetine koyamayız çünkü void oldugu için bir method üretmiyor

    }//main methodkapanis parantezi
    //ornek 1 : 2 sayiyi carpma islemi yapan bir method olusturunuz

    protected static int multiply(int a, int b){ //(int a, int b) parametreler denir

        return a*b;
        // eger bir datatype (int vs.) koyduysak return yazmak zorundayız
        //protected  int multiply(int a, int b){ başta böyle yazdık en üste multply yazdıgımızda java kızıyor
        //Yazı üstüne gelidiğimizde bize statice cevir diyor.
        //ilk başta //main methodkapanis parantezi yazan kısımdan başlayacagız
        //sonra en üstteki multiply yazarız.
    }

    //Ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.

    private static int carpTopla (int q, int w, int e) {
        return  q*w+e;

    }

    //Ornek 3: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.

    public static void print(String str){
        System.out.println(str);
        // direk ekrana yazdiran dedigi için void kullandık
        // eger bir method yeni bir data üretmiyorsa return datasi void olur
        //methodun return typei void ise method body içinde return koyamayız
        //method olusturmada kullanılan variablelar parametreler"parameters" denir
        //method call da kullanılan degerlere argumanlar denir.



    }


}//class kapanis parantezi
