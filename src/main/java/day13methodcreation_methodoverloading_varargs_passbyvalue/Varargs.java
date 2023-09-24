package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class Varargs {
    public static void main(String[] args) {

    //2.burayi yazdık
        int result = toplamaYap(5,6,7,8);
        System.out.println(result); // 5+6+7+8=26


    }
    //1.burayi yazdik
    public static int toplamaYap(int... a){ //... koydugumuzda istenilen kadar sayi koyabilir devamli yani
        int sum = 0;
        for ( int w  : a ) { // foreach kullandık
            sum=sum+w;
        }
        return sum;
    }

    //Toplama işlemi yapan bir method olusturun
/*     public static int toplamaYap(int a, int b) {
        return a+b;
    }
    public static int toplamaYap(int a, int b , int c) {
        return a + b + c;
    }
    public static int toplama (int a,int b,int c,int d) {
        return a + b + c + d;*/

    }

//55 tane sayi topla dese 55 e kadar yazamayız
//java farklı sayidaki parametrelerim hepsini kabul eden bir yapi oluşturdu.
//Bu yapıya Varargs denir.
//Varargs array gibi davranir