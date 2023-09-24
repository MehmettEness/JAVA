package day15stringgbuilderaccesmodifier;

public class Student {

    //Access Modifier
    /*
        1)public
        2)protected
        3)default
        4)private

        public > protected > default > private

        public      ==>  public olanlar her class dan kullanilabilir
        protected   ==> protected olanlar baska package lardan kullanilamaz, ancak baska package larda
                        child classlar icinden kullanilabilir
        default     ==> default olanlar baska package lardan kullanilamazlar
        private     ==> private olanlar sadece olusturulduklari class icinden kullanilabilirler

        "protected ile default" arasindaki farki söyleyiniz?
        Note ==> protected olanlar baska package lardan kullanilamaz ancak ancak baska package larda
                        child classlar icinden kullanilabilir
                  default olanlar baska package lardan kullanilamazlar
     */

    //her class tan kullanilabilir
    public String stdName ="Ali Can";

    //protected olanlar baska package dan sadece child classlardan gorulebilir
    protected String address = "Istanbul";

    //default accses modifier larda default keyword yazilmaz
    //default olanlar baska package lardan kullanilamazlar
    String email = "alican@gmail.com";

    //private olanlar sadece olusturulduklari class icinde kullanilabilirler
    private  String ssnId="1234567891";







}
