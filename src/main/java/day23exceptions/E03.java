package day23exceptions;

public class E03 {
    public static void main(String[] args) {
        /*
        1)Exception olsada olmasada calıstırışması gereken kodlşar var ise "finally block" cine yazarizz..
        2)Database ile kesme işini yapan kodlar gibi kodlar her halukarda calıstırılmalıdır.
        İste bu tarz kodları finally block icine koyariz
        3) try tek basına kullanılamaz. try + 1 catch olurr  -   try + birden fazla catch olur
        4)Birden fazla finally block kullanılamaz.
        5) Bircok exception ismi (ArithmeticException  , ArrayIndexOutOfBoundsException vs... ) kullandık bunları yerine sadece exception yazamaız yeterli olur
         */


        int a = 12;
        int b = 4;
        int c []= {3,5,7,9};
        getNumberFromIntArray(c,a,b); // 12/4 3 verir c[3] bize 9 verir




    }
    public static void getNumberFromIntArray(int[]c, int a , int b){
      //  int idx=a/b;
      // int element =c[idx];
        //bunu try edersek asagıdaki cıkar
        try {
            int idx=a/b;
            int element =c[idx];
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());

        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Database ile uygulamanın bağlantını kestim.");
        }




    }
}
