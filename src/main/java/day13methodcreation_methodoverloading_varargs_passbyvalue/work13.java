package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class work13 {
    public static void main(String[] args) {
//1
        int sonuc = carpmaIslemi(4,3);
        System.out.println(sonuc);
//2
        int sonuc2=carpTopla(8,7,3);
        System.out.println(sonuc2);
//3
        print("Enes");
    }
    //ornek 1 : 2 sayiyi carpma islemi yapan bir method olusturunuz
        protected static int carpmaIslemi (int a , int b){
        return a*b;
    }
    //Ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan
    // method'u olusturunuz ve kullaniniz.

    private static int carpTopla(int w, int e, int r){
        return w*e+r;

        }
    //Ornek 3: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.

    public static void print(String str) {

        System.out.println(str);

    }


}
