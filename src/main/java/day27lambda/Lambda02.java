package day27lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {


    public static void main(String[] args) throws IOException {
        //lines methodu satır satır okumamıza yarıyor

        //1)Verilen text file icindeki text'i consoole yazdıran codu yazınız

        Files.lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).forEach(System.out::println); //paths bana txt dosya yolunu ver demek.

        // Lambda Text File icerisinde yer alan tüm satırları okuyup bize veriyor

        //Example 2: Verilen text file icindeki text'i buyuk harflerle console'a yazdiran code'u yaziniz.
        Files.lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        //Example 3: Verilen text file icindeki text'lerde "map" kelimesinin olup olmadigini kontrol eden kodu yaziniz.

      boolean result1 =  Files.lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).
                anyMatch(t->t.contains("map"));
        System.out.println(result1); //true


        //Example 3: Verilen text file icindeki text'lerde "enes" kelimesinin olup olmadigini kontrol eden kodu yaziniz.

        boolean result2 =  Files.lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).
                anyMatch(t->t.contains("enes"));
        System.out.println(result2); //false

        //Example 4: Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.

     List<String> words = Files.lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).
                map(t->t.replaceAll("\\p{Punct}" , "").split(" ")).
                flatMap(Arrays::stream).
                distinct().collect(Collectors.toList());
        System.out.println(words);

        //map methodu bize zaten hepsini dahil etti ve boşluklardan bölerek hepsi bir kelime oldu ve bize stream arrayin [  ] içerisinde veriyor

        //flatMap bize [  ] bu duvarları yıkıyorve bize sadece kelimeleri veriyor.

        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.

        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.

        long numOfLetters= Files.
                lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).
                map(t->t.replaceAll("[^a-zA-Z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                count();
        System.out.println("numOfLetters = " + numOfLetters);

        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri
        // natural order da bir listin icinde return eden kodu yaziniz.

     List<String> harflerr =  Files.lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).
               map(t->t.replaceAll("[^a-zA-Z]","")).
               map(t->t.split("")).
               flatMap(Arrays::stream).
                sorted().
               collect(Collectors.toList());
        System.out.println("harflerr = " + harflerr);


    }
}
