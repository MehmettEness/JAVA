package genelTekrar;

public class çözülecek_sorular {

}

      //  -------------------------------------------------------------------------------------------------------------------
//scanner 02


//scanner 03




//         -------------------------------------------------------------------------------------------------------------------
//                 /* TASK :
//                  * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
//                  * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
//                  * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
//                  * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
//                  *
//                  * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
//                  * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
//                  * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
//                  * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
//                  * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
//                  * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
//                  * 			 ortalama kazançtan yüksekse o günleri return yap.
//                  * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
//                  * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
//                  * 			 ortalama kazançtan aşağıysa o günleri return yap.
//                  * */
//
//     public static void main(String[] args) {
//         //1. Adım
//         ArrayList<String> gunler = new ArrayList<>();
//         gunler.add("Pazartesi");
//         gunler.add("Salı");
//         gunler.add("Çarşamba");
//         gunler.add("Perşembe");
//         gunler.add("Cuma");
//         gunler.add("Cumartesi");
//         gunler.add("Pazar");
//         //2. Adım
//         ArrayList<Integer> gunlukKazanclar = new ArrayList<>();
//         //3. Adım
//         System.out.println("Lütfen Günlük Kazancınızı Giriniz");
//         Scanner input = new Scanner(System.in);
//         int dayCounter = 1;
//         while (dayCounter < 8) {
//             System.out.print(gunler.get(dayCounter - 1) + " : ");
//             gunlukKazanclar.add(input.nextInt());
//             dayCounter++;
//         }
//         //4. Adım
//         double ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
//         System.out.println("Ortalama Kazanc : " + ortalamaKazanc + "\n");
//         //5. Adım
//         System.out.println("Ortalamanın Üstündeki Günler");
//         for (String w : getOrtalamaninUstundeKazancGunleri(ortalamaKazanc, gunlukKazanclar, gunler)) {
//             System.out.println(w);
//         }
//         System.out.println("\n");
//         //6.Adım
//         System.out.println("Ortalamanın Altındaki Günler");
//         for (String w : getOrtalamaninAltindaKazancGunleri(ortalamaKazanc, gunlukKazanclar, gunler)) {
//             System.out.println(w);
//         }
//
//
//     }
//
//     private static double getOrtalamaKazanc(ArrayList<Integer> gunlukKazanclar) {
//         double toplamKazanc = 0;
//         for (Integer w : gunlukKazanclar) {
//             toplamKazanc = w + toplamKazanc;
//         }
//         double ortalamaKazanc = toplamKazanc / gunlukKazanclar.size();
//         return ortalamaKazanc;
//     }
//
//     private static ArrayList<String> getOrtalamaninUstundeKazancGunleri(double ortalamaKazanc, ArrayList<Integer> gunlukKazanclar, ArrayList<String> gunler) {
//         ArrayList<String> ortalamaninUstundeKazancGunleri = new ArrayList<>();
//         for (int i = 0; i < 7; i++) {
//             if (gunlukKazanclar.get(i) > ortalamaKazanc) {
//                 ortalamaninUstundeKazancGunleri.add(gunler.get(i));
//             }
//         }
//         return ortalamaninUstundeKazancGunleri;
//     }
//
//     private static ArrayList<String> getOrtalamaninAltindaKazancGunleri(double ortalamaKazanc, ArrayList<Integer> gunlukKazanclar, ArrayList<String> gunler) {
//         ArrayList<String> ortalamaninAltindaKazancGunleri = new ArrayList<>();
//         for (int i = 0; i < 7; i++) {
//             if (gunlukKazanclar.get(i) < ortalamaKazanc) {
//                 ortalamaninAltindaKazancGunleri.add(gunler.get(i));
//             }
//         }
//         return ortalamaninAltindaKazancGunleri;
//     }
// }
//         -------------------------------------------------------------------------------------------------------------------
// /* Iki kisinin oynayacagi bir kelime oyunu uretelim
//         * Kurallar
//         * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
//         *
//         * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
//         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
//         *        ve 3.adima gecin
//         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
//         *        kazandigini yazip oyunu bitirin
//         *
//         * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
//         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
//         *          basa mi sona mi ekleyecegini sorun
//         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
//         *
//         *      *   Devam etmek istemezse
//         *          "Oyun bitti" yazin
//         *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
//         */
// public class KelimeOyunu {
//     static int player1;
//     static int player2;
//     static String word;
//     public static void main(String[] args) {
//         start();
//     }
//
//     private static void start() {
//         Scanner scan=new Scanner(System.in);
//         System.out.print("Bir kelime giriniz : ");
//         String tempWord=scan.next();
//         System.out.println("Girilen Kelime : "+tempWord);
//         isAccept(tempWord);
//
//     }
//
//     private static void isAccept(String tempWord) {
//         Scanner scan=new Scanner(System.in);
//         System.out.println("Kabul ediyor musunuz? (E/H)");
//         String select=scan.next();
//         if(select.equals("E") || select.equals("e")){
//             player1+=tempWord.length();
//             isAgain();
//         }else{
//             player2+=tempWord.length();
//             System.out.println("Geçersiz Kelime");
//             System.out.println("Kazanan 2. Oyuncu !\n"+player2+" puan");
//         }
//     }
//
//     private static void isAgain() {
//         Scanner scan=new Scanner(System.in);
//         System.out.println("Devam etmek istiyor musunuz ?(E/H)");
//         String select=scan.next();
//         if(select.equals("E") || select.equals("e")){
//             System.out.println("Yeni Kelime : ");
//             String newWord=scan.next();
//             System.out.println("Başa mı eklensin, sona mı? (1/2)");
//             int secim=scan.nextInt();
//             word=secim==1?(newWord+","+word):(word+","+newWord);
//             isAccept(newWord);
//         }
//         else{
//             System.out.println("Oyun bitti.");
//             System.out.println("player1 = " + player1);
//             System.out.println("player2 = " + player2);
//             String kazanan=(player1>player2)?"1. Oyuncu":"2. Oyuncu";
//             System.out.println("Kazanan :"+kazanan);
//         }
//     }
//
// }
// //         -------------------------------------------------------------------------------------------------------------------
//  /*
//       ATM
//        Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
//        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
//        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
//
//        Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.
//
//        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
//        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
//        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
//     */
//    static Scanner scan;
//    static int cardNumber=9876;
//    static int pass=6300;
//    static double bakiye=0;
//    public static void main(String[] args) {
//        start();
//
//    }
//
//    private static void start() {
//        scan=new Scanner(System.in);
//        boolean isTrue=false;
//        do{
//            System.out.println("Lütfen kart numarasını giriniz :");
//            if(scan.nextInt()==cardNumber)
//                isTrue=true;
//        }
//        while (!isTrue);
//        isTrue=false;
//        do{
//            System.out.println("Lütfen kart şifresini giriniz :");
//            if(scan.nextInt()==pass)
//                isTrue=true;
//        }
//        while (!isTrue);
//        islemler();
//    }
//
//    private static void islemler() {
//        scan=new Scanner(System.in);
//        boolean isAgain=false;
//        do {
//
//            System.out.println("      ATM UYGULAMASI     ");
//            System.out.println("1. Bakiye Görüntüle");
//            System.out.println("2. Para Çekme");
//            System.out.println("3. Para Yatırma");
//            System.out.println("4. Para Gönderme");
//            System.out.println("5. Şifre Değiştirme");
//            System.out.println("0. Çıkış");
//            int select=scan.nextInt();
//            isAgain=true;
//            switch (select){
//                case 1:
//                    bakiyeGoster();
//                    break;
//                case 2:
//                    paraCekme();
//                    break;
//                case 3:
//                    paraYatirma();
//                    break;
//                case 4:
//                    paraGonderme();
//                    break;
//                case 5:
//                    sifreDegistir();
//                    break;
//                case 0:
//                    isAgain=false;
//                    break;
//                default:
//                    System.out.println("Hatalı Giriş");
//                    isAgain=false;
//
//            }
//
//
//        }
//        while (isAgain);
//    }
//
//    private static void sifreDegistir() {
//        scan=new Scanner(System.in);
//        boolean sart=false;
//        do {
//            System.out.print("Mevcut şifreyi giriniz:");
//            int oldPass = scan.nextInt();
//            if(oldPass==pass)
//            {
//                System.out.println("Yeni Şifreyi giriniz:");
//                int newPass=scan.nextInt();
//                pass=newPass;
//                System.out.println("Şifreniz Değiştirildi...");
//                sart=true;
//            }
//            else
//                System.out.println("Girdiğiniz şifre hatalı");
//        }
//        while(!sart);
//    }
//
//    private static void paraGonderme() {
//        scan=new Scanner(System.in);
//        boolean sart=false;
//        do {
//            System.out.print("Göndermek istediğiniz IBAN numarasını giriniz: (26 karakter)");
//            String iban = scan.nextLine();
//            if(iban.startsWith("TR") && iban.length()==26)
//                sart=true;
//            else
//                System.out.println("hatalı IBAN");
//        }
//        while(!sart);
//        System.out.print("Göndermek istediğiniz tutarı giriniz: ");
//        double tutar=scan.nextDouble();
//
//
//            if (tutar < bakiye){
//                bakiye -= tutar;
//                System.out.println("Para gönderme işlemi tamamlandı");
//
//            }
//            else
//                System.out.println("Yetersiz Bakiye.");
//
//
//
//        bakiyeGoster();
//    }
//
//    private static void paraYatirma() {
//        scan=new Scanner(System.in);
//        System.out.print("Yatırmak istediğiniz tutarı giriniz:");
//        bakiye+=scan.nextDouble();
//        bakiyeGoster();
//
//    }
//
//    private static void paraCekme() {
//        scan=new Scanner(System.in);
//        System.out.print("Çekmek istediğiniz tutarı giriniz:");
//        double tutar=scan.nextDouble();
//
//        if(tutar<=bakiye)
//            bakiye -= tutar;
//        else
//            System.out.println("Yetersiz Bakiye.");
//        bakiyeGoster();
//    }
//
//    private static void bakiyeGoster() {
//        System.out.println("Bakiyeniz :"+bakiye);
//    }
//}
//         -------------------------------------------------------------------------------------------------------------------
//public class KahveRunner {
//    static Scanner input;
//    public static void main(String[] args) {
//
//        input = new Scanner(System.in);
//        System.out.println("Hangi Kahveyi istersiniz?\n" +
//                "  1.Türk kahvesi\n" +
//                "  2.Filtre Kahve\n" +
//                "  3.Espresso");
//        String hangiKahve = input.nextLine();
//
//        if (hangiKahve.equalsIgnoreCase("türk kahvesi") || hangiKahve.equalsIgnoreCase("Filtre Kahve") || hangiKahve.equalsIgnoreCase("Espresso")){
//            System.out.println( hangiKahve + "hazırlanıyor.");
//        }else {
//            System.out.println("Hatalı tuşlama yaptınız");
//        }
//
//        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):");
//        String sut =input.next();
//
//        System.out.println(sut.equalsIgnoreCase("evet") ? "Süt ekleniyor" : "Süt eklenmiyor");
//
//        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) :");
//        String seker =input.next();
//
//        if(seker.equalsIgnoreCase("evet")){
//            System.out.println("Kaç şeker olsun?");
//            int sekerSayi = input.nextInt();
//            System.out.println(sekerSayi +" şeker ekleniyor.");
//
//        }else {
//            System.out.println("Şeker eklenmiyor");
//        }
//        //input.nextLine();
//        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :");
//        String boyut = input.nextLine();
//
//        if (boyut.equalsIgnoreCase("büyük boy") || boyut.equalsIgnoreCase("küçük boy") || boyut.equalsIgnoreCase("orta boy")){
//                System.out.println("Kahveniz" + boyut + "hazırlanıyor.");
//        }else {
//            System.out.println("Hatalı tuşlama yaptınız");
//        }
//
//
//        System.out.println(hangiKahve+" "+boyut+" hazırdır. Afiyet olsun ");
//    }
//
//}

//         -------------------------------------------------------------------------------------------------------------------
//package ssg_dersler.genelTekrar01;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class C01_Manav {
//    public static void main(String[] args) {
//        /*
//        kucuk bir manav uygulamasi yapın kullanicidan
//        hangi sebzeyi almak istedigini sorun aldigi sebzeye gore islemlere devam edin
//         */
//        Scanner scan=new Scanner(System.in);
//        ArrayList<String>sebzeler=new ArrayList<>();
//        sebzeler.add("salatalik : 1");
//        sebzeler.add("domates : 2");
//        sebzeler.add("biber : 3");
//        sebzeler.add("patlican : 4");
//        sebzeler.add("kabak : 5");
//        sebzeler.add("mantar : 6");
//        int sebze;
//        ArrayList<String>alinanListesi=new ArrayList<>();
//        double kilo;
//        double toplam=0;
//        do {
//            System.out.println("lutfen almak istediginiz sebzenin numarasini giriniz \n"+sebzeler+" burdan sırasiyla secinin siz 0'e basana kadar islem devam edicek");
//            sebze= scan.nextInt();
//        switch (sebze) {
//            case 1:
//                System.out.println("salataliğin kilosu : 15$\nkaç kilo almak istersiniz");
//                kilo = scan.nextDouble();
//                toplam += kilo * 15;
//                alinanListesi.add("salataliktan "+kilo+"kilo aldiniz. "+kilo*15+" tl toplam salatalik tutari.");
//                break;
//            case 2:
//                System.out.println("dometesin kilosu : 20\nkaç kilo almak istersiniz");
//                kilo = scan.nextDouble();
//                toplam += kilo * 20;
//                alinanListesi.add("domates "+kilo+" kilo aldiniz. "+kilo*20+" tl toplam domates tutari.");
//                break;
//                case 3:
//                System.out.println("biberin kilosu : 25.5\nkaç kilo almak istersiniz");
//                kilo = scan.nextDouble();
//                toplam += kilo * 25.5;
//                alinanListesi.add("biber"+kilo+" aldiniz. "+kilo*25.5+" tl toplam biber tutari.");
//                break;
//                case 4:
//                System.out.println("patlicanin kilosu : 10\nkaç kilo almak istersiniz");
//                kilo = scan.nextDouble();
//                toplam += kilo * 10;
//                alinanListesi.add("patlican"+kilo+" aldiniz. "+kilo*10+" tl toplam patlican tutari.");
//                break;
//                case 5:
//                System.out.println("kabakin kilosu : 7\nkaç kilo almak istersiniz");
//                kilo = scan.nextDouble();
//                toplam += kilo * 7;
//                alinanListesi.add("kabak"+kilo+" aldiniz. "+kilo*7+" tl toplam kabak tutari.");
//                break;
//                case 6:
//                System.out.println("mantarin kilosu : 12.5\nkaç kilo almak istersiniz");
//                kilo = scan.nextDouble();
//                toplam += kilo * 12.5;
//                alinanListesi.add("mantar"+kilo+" aldiniz. "+kilo*12.5+" tl toplam mantar tutari.");
//                break;
//            case 0:
//                System.out.println("Manav uygulamasında cıkısı gerceklestirdiniz bizi tercih ettiginiz icin thx tekrar gorusmek uzere");
//                System.out.println("fişiniz burada mevcut");
//                for (String w:alinanListesi
//                     ) {
//                    System.out.println(w);
//                }
//                System.out.println("toplam tutar: "+toplam);
//
//
//                break;
//            default:
//                System.out.println("yanliş bir tuslama yaptiniz lutfen tekrar deneyiniz");
//                break;
//
//        }
//        }while (sebze!=0);
//
//    }
//}
//         -------------------------------------------------------------------------------------------------------------------
//
//      */
//
// }
//