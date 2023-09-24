package day16staticoop;

public class a05_InstanceBlock {
    //bir obje olusturuldugunda calısan bir blocktur
    //eger tüm constructorların icinde calısması gerekn kodlar var ise tekrardan kurtulmak icin bu kodları
    //instance block icine yazarız

    public int year ;

    public a05_InstanceBlock() { // bunu olusturmak icin mouse sag tik generate sec select none sec gelir

    }

    public a05_InstanceBlock(int year) { //bunu olusturmak icin mouse sag tik generate sec ok sec gelir

        this.year = year;

    }
    //{} instance blocktur
    {
        System.out.println("hi");
        //     public int year ; bunun altındaydı instance icine eklersek hi lar gider ve tekrarsız tek bir hi olusur
    }   // public InstanceBlock(int year) bunun altındaydı instance icine eklersek hi lar gider ve tekrarsız tek bir hi olusur


}
