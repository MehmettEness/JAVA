package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class work13_01 {
    public static void main(String[] args) {
        addd(5.7,9);

        int sonuc = topla(5,7,5,3,1,1);
        System.out.println(sonuc);


    }
    public static void addd(int d , int f){
        System.out.println(d+f);
    }
    public static void addd(double d , double f){
        System.out.println(d + f);
    }
    public static void addd (double d , int f ){
        System.out.println(d + f);
    }

    public static int topla (int... a){
         int top =0;
        for ( int w: a ) {
            top = top+w;
        }
        return (top);
    }

    }


