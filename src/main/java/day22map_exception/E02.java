package day22map_exception;

public class E02 {
    public static void main(String[] args) {
    //  String s="1234"; // toplama işlkemi yapmak istiyoruz ama String oldugu icin Integerea cevirmeliyiiz. Oyüzden } altına method olusturacagız..
    //
    //  convertStringToInt(s);
    //  //icinde rakamlar dısında bir karakter olan stringi sayiya cevirmek isterseniz
    //  // Java NumnerFormat Exception verir.
    //  public static void convertStringToInt(String s) {
    //      int intS = Integer.valueOf(s);
    //      System.out.println(intS+1);//1235
        String s="1234a"; // toplama işlkemi yapmak istiyoruz ama String oldugu icin Integerea cevirmeliyiiz. Oyüzden } altına method olusturacagız..

        convertStringToInt(s);
    }

    //icinde rakamlar dısında bir karakter olan stringi sayiya cevirmek isterseniz
    // Java NumberFormat Exception verir.
    public static void convertStringToInt(String s) {
        try{
            int intS = Integer.valueOf(s);
            System.out.println(intS+1);
        }catch (NumberFormatException e){
            System.out.println("Bir Stringin ınt dönüsmesi icin rakam dısı karakter içermemesi gerekir.");//Bir Stringin ınt dönüsmesi icin rakam dısı karakter içermemesi gerekir.
            System.out.println(e.getMessage()); //For input string: "1234a"
        }


























    }

}

