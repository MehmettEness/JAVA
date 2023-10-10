// package genelTekrar;
//
// import java.util.Scanner;
//
// public class C6_SoruCevap {
//
//
//     public static void main(String[] args) {
//
//         /*
//         Kullanıcıdan kahve seçmesini isteyiniz.
//         Kahveler : Türk kahvesi, Fİltre Kahve , Espresso, White Mocha
//         **Süt eklemek isteyip isytemediğini sorun
//         **Şeker atmak isteyip istemediklerini sorun e şeker adet miktarını isteyiniz.
//         **Bardağının boyutunu sorun (küçük orta büyük)
//
//         */
//
//         Scanner scan = new Scanner(System.in);
//         do {
//
//             System.out.println("Kahvelerden hangisini seçmek isterseniz :");
//             System.out.println(" 1.Türk Kahvesi \n 2.Filtre Kahve \n 3.Espresso \n 4.White Mocha \n Yukarıda şekilde yazınız");
//             String hangiKahve = scan.next();
//
//
//             if (hangiKahve.equalsIgnoreCase("türk kahvesi") ||
//                     hangiKahve.equalsIgnoreCase("filtre kahve") ||
//                     hangiKahve.equalsIgnoreCase("espresso") ||
//                     hangiKahve.equalsIgnoreCase("white mocha")) {
//                 System.out.println(hangiKahve + " " + "hazırlanıyor");
//             } else {
//                 System.out.println("Yanlış giriş yaptınız");
//
//             }
//         }while (false);
//
//                 System.out.println("Süt eklemek ister misiniz (Evet/Hayır)");
//             String sut = scan.nextLine();
//             System.out.println(sut.equalsIgnoreCase("evet") ? "süt ekleniyor" : "süt eklenmiyor");
//
//             System.out.println("şeker ister misiniz (Evet/Hayır");
//             String seker = scan.nextLine();
//
//         if (seker.equalsIgnoreCase("evet")) {
//                 System.out.println("Kaç şeker olsun");
//                 int sekerSayisi = scan.nextInt();
//                 System.out.println(hangiKahve + "kahvenize " + sekerSayisi + "ekleniyor");
//
//             } else {
//                 System.out.println("Şeker eklenmiyor");
//             }
//             System.out.println("Boyutu ne olsun 1.Büyük boy \n 2.Orta Boy \n 3.Küçük Boy");
//             int boyut = scan.nextInt();
//             if (boyut == 1) {
//                 System.out.println("Büyük Boy");
//             } else if (boyut == 2) {
//                 System.out.println("Orta Boy");
//             } else if (boyut == 3) {
//                 System.out.println("Küçük Boy");
//             } else {
//                 System.out.println("yanlış seçim yaptınız");
//             }
//             System.out.println(hangiKahve + "hazırlanıyor. Afiyet olsun");
//
//     }
// }
//
//