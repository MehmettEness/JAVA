package genelTekrar;

public class Ogrenci_constructor {

    private String ad;
    private int yas;

    public Ogrenci_constructor (String ad , int yas){
        this.ad=ad;
        this.yas=yas;
    }
    public void bilgileri(){
        System.out.println("Ogrenci Adı :" + ad);
        System.out.println("Ogrenci Yaşı :" + yas);
    }

    public static void main(String[] args) {
        Ogrenci_constructor ogrenci1= new Ogrenci_constructor("Mehmet Enes" , 32);
        ogrenci1.bilgileri();

        Ogrenci_constructor ogrenci2 = new Ogrenci_constructor("Yağmur " , 27);
        ogrenci2.bilgileri();


        }
    }

