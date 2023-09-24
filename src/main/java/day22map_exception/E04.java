package day22map_exception;

public class E04 {
    public static void main(String[] args) {
        String []arr = {"j","a","v","a"};// icinden eleman alacagız
        arraydenElemanVer(arr,1);//a
        arraydenElemanVer(arr,5); //hata: ArrayIndexOutOfBoundsException


    }
    //Arraylerde olmayan bir index kullanıldıgında java ArrayIndexOutOfBoundsException verir...
    public static void arraydenElemanVer(String[]s , int idx){

        //try catch acıklaması sen tryda calısmayı bir dene  ArrayIndexOutOfBoundsException bir hata alırsan devam et demek

        try {
            String el = s[idx];
            System.out.println(el);//a
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());//Index 5 out of bounds for length 4
            System.err.println(e.getCause());//null
        }


    }
}
