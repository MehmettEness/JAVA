package day02variables;

public class Variables02 {
    public static void main(String[] args) {
        /*2) non-primitive data type;
        String ve milyonlarcası var
         */
        //Ornek 9: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        //string ogrenciAdi = mehmetenes ;
        // Stringlerde çift tırnak koymamız gerekiyor
        String ogrenciAdi = "mehmetenes" ;
        System.out.println(ogrenciAdi);

        /*
        ****************************interview sorusuuuuuuuuuuuuuuuuuuuuuuuuu
        primitive ve non primitive data type arasındaki farklar nelerdir?
        1) primitiveler sadece bizim atadagimiz degeri içerir.
            non-primitiveler bizim atadaığımız degeri içerir ve fazladan methodlar icerir.

        2)primitiveler kücük harfle baslar. non-primitiveler büyük harfle baslar

        3)primitiveleri java üretmistir ve 8 tanedir. non-primitiveleri java ve programcilar üretebilir dolayısı ile sinirsiz sayidadir

        4) primitiveler memoryde data typeleerina göre sabit boyutta bellek kullanirlar
            non-primitiveler  memoryde büyüklügüne göre degisen boyutlarda bellek kullanabilirler.

         */

        //Ogrenci notlari icin iki adet variable olusturun ve toplamlarini ekrana yazdirin.

        byte note1 = 50;
        byte note2 = 70;
        System.out.println(note1+note2);



    }
}
