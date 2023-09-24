package day22map_exception;

public class E06 {
    public static void main(String[] args) {

        String s = "Java";
        getNumberOfChars(s);//4

        String t="";
        getNumberOfChars(t);//0

        String u=null;
        getNumberOfChars(u);//Error//Cannot invoke "String.length()" because "s" is null



    }
    //Stringin degeri null oldugu zaman string classdaki methodları kullanamazsınız.
    //cunku java NullPointerException hatası verir.
    //Peki bunu nasıl calısştırabilirz.

    public static void getNumberOfChars(String s){
        try {
            int numOfChars = s.length();
            System.out.println(numOfChars);
        } catch (NullPointerException e) {
            System.err.println("null degeri icin string methodlari kullanilamaz");

        }

    }






}
