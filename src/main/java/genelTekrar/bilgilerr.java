//  package genelTekrar;
//
//  public class bilgilerr {
//
//       //variables 01
//  	/*
//  	  \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
//  	          \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
//  	          \\: prints a back slash :\ (ters slash) yazdırır
//  	          \': prints single quote :' tek tırnak yazdırır.
//  	          \": prints double quote :"" Çift tırnak yazdırır.
//
//  	 */
//
//  //variables 02
//
//      /*
//       * Primitive data type
//       * boolean, char, byte, short, integer,long, double, float
//       *
//       */
//
//      //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiriniz.
//
//  //variables 03
//      // verilen 12345 sayısının rakamlarını yukarıdan aşağıya doğru yazdırınız
//      // ex: input:
//      //	 output: 1
//      //            2
//      //            3
//      //	         4
//      //	         5
//
//  //variables 04
//          System.out.println("-------------------Arttırma");
//      int a = 1;
//          System.out.println("a : "+(++a)); //2
//          System.out.println("a : "+(a++)); //2
//          System.out.println("a : "+a);  //3
//      a=5;
//          System.out.println("son hali :"+(a++ + ++a)) ;
//      // 5 + 7 = 12
//
//
//          System.out.println("-------------------Azaltma");
//      int b = 5;
//          System.out.println(--b);  //4
//          System.out.println(b--);  //4
//          System.out.println(b);  //3
//
//
//          System.out.println("-------------SORU1-----------------");
//      int x = 20;
//      int y = 15;
//          System.out.println(++x + --y);  //21 + 14 =35  x= 21   y=14
//          System.out.println(x);
//          System.out.println(y);
//          System.out.println("-----------------------------------");
//          System.out.println(++x + y--);  // 21 + 15=36  x=21 y=14
//          System.out.println(x);
//          System.out.println(y);
//
//
//          System.out.println("-------------SORU2-----------------");
//      x = 20;
//      y = 15;
//          System.out.println(x++ + y--);  // 20+15=35   x=21 y=14
//          System.out.println(x);
//          System.out.println(y);
//          System.out.println("-----------------------------------");
//          System.out.println(x++ + --y);  // 20+14 =34  x=21 y=14
//          System.out.println(x);
//          System.out.println(y);
//          System.out.println("-----------------------------------");
//      int k=5;
//      int sonuc = ++k + k++ + k++ + --k + k-- + k;
//      //  6  + 6 +  7   + 7 + 7 + 6 = 39   k=6
//
//          System.out.println("sonuc = " + sonuc);
//          System.out.println("k = " + k);
//
//  //variables 04
//
//
//      //Write code here
//
//      String b = "Java 1235 ?!@$_";
//
//      // \\d ifadesi tum rakamlari(digit) temsil eder.
//  		System.out.println(b.replaceAll("\\d","*"));
//  		System.out.println(b);
//      // ===>  \\D rakamlardisindaki hersey
//  		System.out.println(b.replaceAll("\\D","*"));
//
//      //==> \\S space disindaki hersey
//  		System.out.println(b.replaceAll("\\S","*"));
//
//      //==> \\s space ifadesidir.
//  		System.out.println(b.replaceAll("\\s","*"));
//      // replace ile yapma
//  		System.out.println(b.replace(" ","*"));
//
//      //==>  \\w ifadesi (word->kelime ve hadf) a-z A-Z 0-9 _  bunlari kapsar
//  		System.out.println(b.replaceAll("\\w","*"));
//
//      //==>  \\W ifadesi a-z A-Z 0-9 _ disindakileri kapsar
//
//  		System.out.println(b.replaceAll("\\W","*"));
//
//  //variables 05
//      // str.matches(pattern);
//      // str'nin pattern'a uygun olup olmadigini kontrol eder. sonuc boolean döner
//
//      // . (nokta) yalniz tek karakter demektir
//      // ".s" toplam 2 karakter olmali, ilk karakter herhangi ikinci karakter s olmali
//          System.out.println(". quantifier ....");
//          System.out.println("as".matches(".s"));  // true, ilk karakter a ikincisi 2 toplam 2 karakter
//          System.out.println("mst".matches(".s")); // false (mst 2 karakterden fazla)
//          System.out.println("mas".matches("..s")); // true, 3 karakterli ve 3. karakter s
//
//      // [abc]    yalniz bir karakter ve a, b veya  c olmali
//          System.out.println("[abc] quantifier ....");
//          System.out.println("a".matches("[a]")); // true, str yalniz bir adet a karakterinden olusmali
//          System.out.println("ab".matches("[ab]")); // false, 1 karakter olmali a ya da b, 2 karakter var
//
//      // [^abc]    a, b, c disinda herhangi bir karakter (negation)
//          System.out.println("[^...] quantifier ....");
//          System.out.println("a".matches("[^a]")); // false, bir karakter ancak a haric olmali
//          System.out.println("c".matches("[^ab]")); // true, 1 karakter ve a ve b nin disinda
//          System.out.println("abcd".matches("[abcd]")); // false, yalniz a, b, c veya d olmali
//          System.out.println("c".matches("[abcd]")); // true, tek karakter ve a, b, c veya d
//          System.out.println("baaaca".matches("[abc]")); // false,
//
//      //   [a-z]      a'dan z'ye kadar olan karakterlerden biri olmali a ve z dahil
//      //   [a-zA-Z]   a'dan z'ye veya A'dan Z,'ye olan karakterlerden biri olmali
//          System.out.println("[a-z] quantifier ....");
//          System.out.println("c".matches("[a-z]")); // true, 1 karakter ve a-z arasinda
//          System.out.println("Aa".matches("[a-zA-Z]")); // false, a dan 1 karakter ve a ve b nin disinda
//          System.out.println("c".matches("[1-9]")); // false, 1 karakter ve 1-9 arasinda olmali
//
//
//      // X?    X en fazla 1 defa kullanilabilir
//          System.out.println("? quantifier ....");
//          System.out.println("a".matches("[abc]?")); // true a, b, c bir defa kullanilabilir
//          System.out.println("aaa".matches("[abc]?")); // false, a 1 den fazla kullanilmis
//          System.out.println("".matches("[abc]?")); // true, a, b veya c en fazla 1 defa
//          System.out.println("b".matches("[abc]?")); // false, a, b veya c en fazla 1 defa
//
//      // X+        X en az 1 defa kullanilabilir
//          System.out.println("+ quantifier ....");
//          System.out.println("a".matches("[abc]+")); // true, a, b veya c en az bir defa
//          System.out.println("aaa".matches("[abc]+")); // true, a 3 defa kullanilmis
//          System.out.println("aaddta".matches("[abc]+")); // false, d ve t olmamali
//          System.out.println("aaabbcccc".matches("[abc]+")); // true, a, b, c en az 1 defa kullanilmis
//
//      // X*   X sifir veya daha fazla olmali
//          System.out.println("* quantifier ....");
//          System.out.println("abbbna".matches("[abc]*")); // true, a, b, c,  0 veya fazla olmali
//          System.out.println("-----" + "aaa".matches("[abc]*")); // true, a, b, c,  0 veya fazla olmali
//          System.out.println("".matches("[abc]*"));   // true, a, b, c 0 defa kullanilmis
//
//      // X{n}      X yalniz n adet kullanilabilir
//      // [a-zA-Z0-9]{6}  a-z, A-Z ve 0-9 arasi toplam 6 karakter olmali
//          System.out.println("{n} quantifier ....");
//          System.out.println("arun32".matches("[a-zA-Z0-9]{6}")); // true
//          System.out.println("kkvarun32".matches("[a-zA-Z0-9]{6}")); // false 6 karakterden fazla
//          System.out.println("JA2Uk2".matches("[a-zA-Z0-9]{6}")); // true
//          System.out.println("arun$2".matches("[a-zA-Z0-9]{6}")); // false, $ olmamali
//
//
//      // X{n,}      X  n veya daha fazla adet kullanilabilir
//      // [a-zA-Z0-9]{6,}  a-z, A-Z ve 0-9 arasi toplam en az 6 karakter olmali
//          System.out.println("{n,} quantifier ....");
//          System.out.println("kkv32".matches("[a-zA-Z0-9]{6,}")); // false 6 karakterden az
//          System.out.println("kkvarun32".matches("[a-zA-Z0-9]{6,}")); // true en az 6 karakterden fazla olabilir
//
//      // X{n,m}      X  en az en fazla m adet kullanilabilir
//      // [a-zA-Z0-9]{6,7}  a-z, A-Z ve 0-9 arasi toplam 6 veya 7 karakter olmali
//          System.out.println("{n,} quantifier ....");
//          System.out.println("+++++" + "kkv32e".matches("[a-zA-Z0-9]{6,7}")); // true
//          System.out.println("kkv32ez6".matches("[a-zA-Z0-9]{6,7}")); // false, 8 karakterz
//
//
//          System.out.println("by character classes and quantifiers ...");
//      // ilk karakter 789 ve kalan 9 karakter 0-9 arasi toplam 10 karakter olmali,
//      // [789]{1}  == [789]
//          System.out.println("9953038949".matches("[789]{1}[0-9]{9}"));   // true
//          System.out.println("9953038949".matches("[789][0-9]{9}"));      //true
//
//          System.out.println("6953038949".matches("[789][0-9]{9}")); // false, ilk karakter 6
//          System.out.println("99530389490".matches("[789][0-9]{9}")); // false, 11 karakter
//
//
//
//  }
//
//       */

//-----------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------
//public class C0_Lambda_Aciklamalar {
//         /*
//     ForEach:
//     Stream içindeki veriyi tek tek tüketmekiçin oluşturulmuş bir yapıdır.
//     **Terminal işlemi olduğundan dolayı stream artık tüketilmiş olarak kabul edilir ve
//     artık kullanılamayacağı anlamına gelir.
//
//
//    Filter:
//    Dizimiz veya Collection’ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
//    filtreleme işlemi yapmamıza yarayan bir yapıdır.
//    Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
//    Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır
//
//
//    Collect:
//    Collect metodu Stream türündeki nesneleri başka biçimdeki nesneye,
//    veri yapısına dönüştürmek için kullanılır.
//
//
//    Map :Stream içerisinde erişilen her bir eleman üzerinde işlem yapmamıza
//    ve başka elemanlara dönüştürmemize imkan sağlayan
//
//
//    Distinct:
//    Stream içerisinde bulunan ve tekrar eden elemanlar varsa
//     bunları distinct metodu ile çıkartabilir ve
//    elimizde tekrar etmeyen birbirinden farklı
//    elemanlar barından bir veri setimiz kalır
//
//
//    Sorted:
//    Bazı durumlarda elimizde ki veri setini belirli bir parametreye göre sıralamak isteyebiliriz.
//            2 türü bulunmaktadır. Birinci hali parametre almaz küçükten büyüğe şekilde sıralar.
//    İkinci formatı ise Comparator arayüzünden türediği için
//    bizim belirlemiş olduğumuz parametreye göre sıralama işlemi yapar.
//
//
//
//    reduce : indirgeme demektir.
//    kullanımı; elemanları teker teker işler. Bir önceki adımda elde edilen sonuç,
//    bir sonraki elemanla işlemle tutulur
//
//
//    peek () 'in Javadoc sayfası şöyle diyor: " Bu yöntem, temelde, öğeleri bir
//    ardışık düzen içinde belirli bir noktadan geçerken görmek istediğiniz
//    yerde hata ayıklamayı desteklemek için vardır .
//
//
//    Match operasyonu bir akışın belirli kriterleri sağlayıp sağlamadığını ölçmek için kullanılır.
//    Map den farkı her iterasyonu tek tek değerlendirip sonucu yansıtmaz bunun yerine tüm koleksiyonu
//    değerlendirerek sonucu yansıtmasıdır. Match operasyonunun 3 çeşit kullanımı bulunmaktadır;
//
//        AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
//        herhangi bir elemanla eşleşme durumunda true dönecektir.
//
//
//        AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
//        bu şarta uyması durumunda true dönecektir.
//
//
//        NoneMatch: Şarta göre Stream içindeki hiç bir
//        elemanın şartı sağlamaması durumunda true dönecektir.
//
//
//    Limit
//    Elimizde var olan bir veri kaynağını, göstermek istediğimiz kadarını göstermemize yarayan,
//    sınırlandıran bir metoddur. Parametre olarak vereceğimiz rakamla aslında
//    Stream içerisinde dönen çok sayıda veri var
//    ancak sen bize şu kadarını göster diyoruz.
//
//
//    findFirst() => İlk elemanı verir. Bu akışın ilk elemanını açıklayan bir İsteğe bağlı veya akış boşsa boş bir İsteğe bağlı döndürür.
//    Akışın karşılaşma sırası yoksa herhangi bir öğe iade edilebilir. Optional return eder.
//
//
//    // Arraylerde Stream kullanabilmek icin 2 yol vardir
//
//    1) Stream <Integer> isim=StreamOf(cevrilecek olan)
//    2) Arrays.stream(arr).
//
//
//    Count
//    Stream içerisinde bulunan toplam veri sayısını öğrenmemize yarar.
//
//
//    flatMap() => Herhangi bir Collection’daki (Array gibi) elemanları birer birer Stream’e yerleştirir.
//    flatMap()’i kullanabilmek için elimizde bir Collection olmak zorunda.
//
//
//    split() => Bu String öğesini verilen normal ifadenin eşleşmelerine böler.
//    Bu yöntem, iki bağımsız değişkenli bölünmüş yöntemi verilen ifade ve sıfır sınır değeriyle çağırır gibi çalışır.
//    Sondaki boş dizeler bu nedenle sonuç dizisine dahil edilmez.
//
//
//    Optional<Integer> => Bir Class’tır. Boş olmayan bir değer içerebilen veya içermeyen bir kap Objecttir.
//    *****Bir değer varsa, isPresent () true, get () ise değeri döndürecektir.
//    Ek olarak, bu sınıf, bir int'i bir String'e ve bir String'i bir int'e dönüştürmek için çeşitli yöntemler
//    ve ayrıca bir int ile ilgilenirken yararlı olan diğer sabitler ve yöntemler sağlar. Exception gibi çalışır.
//
//    #ifPresent – Varsa yap, yoksa yapma
//    Eğer bir Optional içerisinde sadece veri varsa (null değilse) bir işin yapılması isteniyorsa #ifPresent metodu kullanılabilir.
//
//
//    Comparator => bir Class’tır. Compar karşılaştırmak demektir. Bazı nesneler koleksiyonuna toplam sıralama uygulayan bir karşılaştırma işlevi.
//    Karşılaştırıcılar, sıralama düzeni üzerinde hassas kontrol sağlamak için bir sıralama yöntemine (Collections.sort veya Arrays.sort gibi) aktarılabilir.
//    Karşılaştırıcılar, belirli veri yapılarının (sıralı kümeler veya sıralı haritalar gibi) sırasını kontrol etmek veya doğal sıralaması olmayan
//    nesnelerin koleksiyonları için bir sıralama sağlamak için de kullanılabilir.
//
//    reverseOrder() => Comparator Class’ının bir methodudur. Doğal sıralamanın tersini (büyükten küçüğe) uygulayan bir Comparator (karşılaştırıcı) döndürür.
//    comparing() => karşılaştırma demektir.
//    reversed() => Bu karşılaştırıcının (comparator) ters sıralanmasını uygulayan bir karşılaştırıcı (comparator) döndürür.
//
//
//    skip(1) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış döndürür.
//    Bu akış n'den daha az öğe içeriyorsa, boş bir akış döndürülür. Bu, durum bilgisi olan bir ara işlemdir.
//    skip(list.size()-1) => List’in uzunluğunun 1 eksiğini yazarsak son elemanı yazdırırız.
//
//
//    Collectors.toList() => Öğeleri koleksiyonlarda toplamak, öğeleri çeşitli kriterlere göre özetlemek gibi çeşitli
//    yararlı azaltma işlemlerini uygulayan Collector Uygulamaları.
//
//    // dosya eklemek icin 2 yol var
//    1) Files.lines(Path.of("path")   buradan stream e eklemek icin
//    Stream <String> satir=Files.lines(Path.of("dosya pathi"));
//     bu bize tekrardan stream tanimlamadan kullanmayi saglar
//    2) //Files.lines(Paths.get("dosya pathi")).  kullanilir
//
//    satir.map(t->t.split(" ")).
//                    flatMap(Arrays::stream). kelimelere ulasmamizi saglar
//
//
//    */
//}
