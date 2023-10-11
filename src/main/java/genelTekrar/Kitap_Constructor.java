package genelTekrar;

public class Kitap_Constructor {
    private String ad;
    private String yazar;
    private int barkod;
    private int sayfaSayisi;

    public Kitap_Constructor ( String ad , String yazar , int barkod , int sayfaSayisi){
        this.ad=ad;
        this.yazar=yazar;
        this.barkod=barkod;
        this.sayfaSayisi=sayfaSayisi;

    }
    public Kitap_Constructor(){
        this.ad="bilinmiyor";
        this.yazar="bilinmiyor";
        this.barkod=0;
        this.sayfaSayisi=0;
    }
     public void bilgiler(){
         System.out.println("Kitabın adı :" + ad);
         System.out.println("Kitabın yazarı :" + yazar);
         System.out.println("Kitabın barkodu :" + barkod);
         System.out.println("Kitabın sayfa numarası :" + sayfaSayisi);
     }

    public static void main(String[] args) {

        Kitap_Constructor kitap1 = new Kitap_Constructor("İnce Memed" , "Ahmet Umit" , 86807814 , 9);
        kitap1.bilgiler();

        Kitap_Constructor kitap2 = new Kitap_Constructor();
        kitap2.bilgiler();



    }



}
