package genelTekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Bakiye {
    public static void main(String[] args) {
        /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
    çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */


            Scanner scan = new Scanner(System.in);
            double bakiye=1000;
            System.out.println("Banka bilgilerinize hoşgeldiniz \n1-Para Çekme \n2-Bakiye Öğrenme \n3-Para Yatırma");
            int banka = scan.nextInt();

            switch (banka) {
                case 1:
                    System.out.println("Ne kadar para çekmek isterseniz");
                    double  tutar = scan.nextDouble();
                    if (tutar > bakiye) {
                        System.out.println("Güncel bakiyeniz 1000 dir.Bundan fazlasını çekemezsiniz");

                    } else {

                        bakiye = bakiye - tutar;
                        System.out.println("Kalan bakiye  " + bakiye);
                        break;
                    }

                case 2:
                    System.out.println("Geçerli bakiyeniz :" + bakiye);
                    break;

                case 3:
                    System.out.println("Yatırmak istediğiniz para miktarını giriniz.");
                    double deger = scan.nextDouble();
                    bakiye = bakiye + deger;
                    System.out.println("Güncel bakiyeniz : " + bakiye);

                default:
                    System.out.println("Geçerli işlem sseçiniz");
            }

            /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        List<Integer> sayi = new ArrayList<>();
        sayi.add(3);
        sayi.add(8);
        sayi.add(4);
        sayi.add(1);
        sayi.add(9);
        sayi.add(6);

        int toplam =0;

        for ( Integer w  : sayi ) {
            toplam= toplam+w*w;

        }
        System.out.println(toplam);

 /*
        - Bir kütüphane yönetimi uygulaması geliştiriyorsunuz.
        - Kullanıcılar, kütüphaneye yeni kitap ekleyebilmeli, kitapları sıralayabilmeli ve
        - kitapları kütüphaneden silebilmelidir.
        - Ayrıca, kullanıcılara kütüphaneyi tamamen sıfırlama seçeneği de sunmanız isteniyor.
        */

        ArrayList<String> kutuphane = new ArrayList<>();
        kutuphane.add("a");
        kutuphane.add("b");
        kutuphane.add("v");
        kutuphane.add("h");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Kütüphane yönetimine hoşgeldiniz \nYapmak istediğiniz işlemi lütfen seçiniz \n 1-Kitap ekleme \n 2-Kitap sıralama \n 3-Kitap silme \n 4-Kütüphaneyi silme ");
        int secim = scan1.nextInt();
        switch (secim){
            case 1:
                System.out.println("Eklemek istediğniz kitabın adını girin.");
                String kitapAdi = scan1.next();
                kutuphane.add(kitapAdi);
                System.out.println(kutuphane);
                break;
            case 2:
                System.out.println(kutuphane);
                break;

            case 3:
                System.out.println("Silmek istediğiniz kitabı seçiniz");
                String silinecekKitap = scan1.next();
                for (int i = 0; i < kutuphane.size(); i++) {

                    if (kutuphane.get(i).contains(silinecekKitap)) {
                        kutuphane.remove(i);
                        i--;
                    }

                }
                System.out.println(kutuphane);
                break;

            case 4:
                for (int i = 0; i < kutuphane.size(); i++) {
                    kutuphane.remove(i);
                    i--;
                }
                System.out.println(kutuphane +"Kütüphane boşaltılmıştır");
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");

        }

        /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        */
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Bu iş kaç günde bitmeli");
        int gun = scan2.nextInt();
        System.out.println("Toplam kaç işci çalışacak");
        int isci = scan2.nextInt();
        System.out.println("İşin bitme süresi : " + gun/isci);

        // TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        //bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.

        Scanner scan4 = new Scanner(System.in);
        System.out.println("İsim Soyisim giriniz");
        String name = scan4.nextLine();
        System.out.println("Yaşınızı  giriniz");
        byte yas = scan4.nextByte();
        System.out.println("Kilonuzu giriniz");
        double kilo = scan4.nextDouble();
        System.out.println("Boyunuzu giriniz");

        double boy = scan4.nextDouble();
        System.out.println("Kayıt olmak istediginiz süre ne kadar");
        int ay = scan4.nextInt();
        System.out.println("Ad Soyad : " +name+ "\n" + "Yaşınız : " +yas+ "\n" + "Kilonuz : " +kilo+ "\n" + "Boyunuz :" + boy+ "\n" + "Kayıt olma süreniz :" +ay+ "\n" );
        System.out.println("Toplam ödemeniz gereken ücret : " + ay*20 +"$");
    }

    }
