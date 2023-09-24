package day18oop;

public class Student {
    /*
    Encapsulation ==> Kapsüllemee
    Encapsulation nedir ? Data hiding demektir .Yani veri saklama demektir.
    Data nasil saklanir?
    Access modifierlarini private yaparak datayi diger classslardan görğnmez hale getirererk saklanır.
    Yani kişiye özel kapsül yani class a ait.

    Encapsulation yaptıgımız diger classlardan okuyabiliriz. privateler görülmezdi..
    Nasıl okuyabilirz
    get methodlar olusturarak encapsulate edilmiş datanın degerini okuyabiliriz.

    1) get methodlar public olur
    2)get methodun return type  okudugu return type ile ayni olur
    3)booelan variable oldugu ici "is" ile baslar.


    Yani private datalar görünmez haldedir. Get methodu ile görünür olur.
    1) set methodları hep public olur
    2) set methodunun return type i hep void olur
    3) set method parametre kullanmak zorundaddır. Yani set diyererk zaten verileni degistirmek istiyorsun

    set method kullanarak var olan object üerinde degisiklikler yaparak o objecti sanarak
    objectmiş gibi kullanabiliriz.

    Getter ve Setter larin ikisine birden "java beans" denir.

     */
    public String stdName ="Ali Can";
    public int age =15;
    private String stdId ="AC20231212121";
    private  double notOrt=3.13;
    private boolean succesful= false;

    public String getStdId() { // sag tık generate ve getter secersewk gelir.
        return stdId;
    }



    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() { // boolean soru eki oldugu icin isBasarasi = Basarili mi dedik ve false cıktı.
        return succesful;
    }



// bunlar setterlarr. Yani getter methodu degistirmesini istiyoruz.
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrtalama) {
        this.notOrt = notOrtalama;
    }

    public void setSuccesful(boolean basarisi) {
        this.succesful = basarisi;
    }





}
