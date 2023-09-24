package day16staticoop;

public class a01_Student01 {
    /*
    1)Static variable veya static methodlar (class member denir) tüm objeler ici ortak elemandır (gökteki ay)
    2)static class üzerinde yapılan tüm degisiklikler tüm objectleri etkiler ( ay yoksa medcezir olur gibi)
    3)static class memeberler class'ai non-static class memberlar objectler e monte edilir.
    Mesela bir classtan 100 tane object olusturdugunuzda non-static olanlar 100 kere olusuturulur
    ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulur.
    4)static class memberlara ulasmak icin obje olusturmaya gerek duyulmaz ama
      non-static class memberlara ulaşmak icin obje olusturmak sarttır
    5) static variablelarin diger adi class variabledir, non-static variablelarin diger adi instance variable veya object variabledir

     */
//1
  public static String stdName = "Ali Can";

  public int age = 18 ;

  public static void staticMethod (){
      System.out.println("Ben staticim :-)");

    }
    public static void nonStaticMethod(){
        System.out.println("Ben static degilim :-(");
    }
}
